package parser2Tree;

import java.util.Vector;

public class MyTree {
	private class Node{
		public String item;
		Vector<Node> leafs = new Vector<Node>();
		
		public Node(String it){
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
				//делим оставшуюся строку на листья
				while(it.length() != 0){
					if (it.charAt(0) != '('){
						int t = it.indexOf(' ');
						if (t == -1){
							t = it.indexOf(')');
							if (t == -1){
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
			}
		}
		
		void addNewLeaf(String s){
			Node leaf = new Node(s);
			leafs.add(leaf);
		}
		
		void printLeafs(Vector<Integer> tubes){
			for (int i = 0; i < tubes.size(); i++)
			{
				if((int)tubes.get(i) == 0){
					System.out.print("    ");
				}
				else{
					System.out.print("|   ");
				}
			}
			System.out.println("|_"+item);
			if (leafs.size() == 1){
				tubes.add(0);
			}else if(leafs.size() != 0){
				tubes.add(1);
			}
			for(Node t : leafs){
				t.printLeafs(tubes);
			}
			if(leafs.size() != 0){
				tubes.remove(tubes.size()-1);
			}			
		}
	}
	
	private Node root;
	public MyTree(String toParse) {
		root = new Node(toParse);
	}

	public void Output() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(0);
		root.printLeafs(v);				
	}
}
