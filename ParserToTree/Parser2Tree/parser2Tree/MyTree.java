package parser2Tree;

import java.util.Vector;

public class MyTree {
	private class Node{
		public String item;
		Vector<Node> leafs = new Vector<Node>();
		
		public Node(String it){
			System.out.println("Получена строка: " + it);
			if(it.charAt(0) == '('){
				//получаем название текущей ноды
				int i = it.indexOf(' ');
				if ( i == 1 ){
					item = it.substring(0, i);
				}
				else{
					item = it.substring(1, i);
				}
				it = it.substring(i+1, it.length());
				System.out.println("Выделено название: " + item);
				//делим оставшуюся строку на листья
				while(it.length() != 0){
					if (it.charAt(0) != '('){
						int t = it.indexOf(' ');
						if (t == -1){
							t = it.indexOf(')');
							if (t == -1){
								System.out.println("Ошибка со скобками: "+it);
							}							
						}
						if(t == 0){
							addNewLeaf(it);
							it = "";
						}
						else{
							addNewLeaf(it.substring(0, t));
							it = it.substring(t+1, it.length());
						}
					}
					else{
						int c = 1;
						int j = 1;
						while(c != 0){
							if(it.charAt(j) == '(') c++;
							if(it.charAt(j) == ')') c--;
							j++;
						}
						addNewLeaf(it.substring(0, j));
						it = it.substring(j+1, it.length());
					}
				}
			}
			else{
				item = it;
				System.out.println("Выделено название: " + item);
			}
		}
		
		void addNewLeaf(String s){
			Node leaf = new Node(s);
			leafs.add(leaf);
		}
	}
	
	private Node root;
	public MyTree(String toParse) {
		root = new Node(toParse);
	}

	public void Output() {
		// TODO Auto-generated method stub
		
	}
}