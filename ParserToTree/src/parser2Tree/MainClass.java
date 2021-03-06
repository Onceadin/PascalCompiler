package parser2Tree;

public class MainClass {

	static String defaultOutput = new String("(program (declarations (progDef PROGRAM Example ;) "
			+ "(varDefs VAR (varDefList (varDef (idList a , b , c) : (typeIdentifier INTEGER)) ;))) "
			+ "(block BEGIN (statementList (statement a := (expression (simpleExpression (term (factor "
			+ "(unsignedConstant (unsignedNumber (unsignedInteger 1)))))))) ; (statement b := (expression"
			+ " (simpleExpression (term (factor a))))) ; (statement b := (expression (simpleExpression "
			+ "(term (factor a) * (factor (unsignedConstant (unsignedNumber (unsignedInteger 5)))))))) ; "
			+ "(statement c := (expression (simpleExpression (term (factor ( (expression (simpleExpression"
			+ " (term (factor a)) + (term (factor b)))) )) * (factor (unsignedConstant (unsignedNumber "
			+ "(unsignedInteger 3)))))))) ; (statement (output WRITE) ( (expression (simpleExpression "
			+ "(term (factor c)))) )) ;) END) .)");
	
	public static void main(String[] args) {
		MyTree tr;
		//при отсутствии аргументов командной строки, подставлять строку выше
		//подстановка из командной строки не проверена
		if (args.length == 0)
		{
			tr = new MyTree(defaultOutput);
		}
		else
		{
			tr = new MyTree(args[0]);
		}
		tr.Output();
	}

}
