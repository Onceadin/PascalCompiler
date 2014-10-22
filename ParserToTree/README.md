Эта часть отвечает за преобразование строки, получаемой от персера вида
```Java
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
```
в дерево, предоставляя текстовый вывод синтаксического дерева в консоль
