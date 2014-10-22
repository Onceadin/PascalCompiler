Эта часть отвечает за преобразование строки, получаемой от персера вида
```Java
(program (declarations (progDef PROGRAM Example ;) (varDefs VAR (varDefList (varDef (idList a , b , c) : <br>
(typeIdentifier INTEGER)) ;))) (block BEGIN (statementList (statement a := (expression (simpleExpression <br>
(term (factor (unsignedConstant (unsignedNumber (unsignedInteger 1)))))))) ; (statement b := (expression <br>
(simpleExpression (term (factor a))))) ; (statement b := (expression (simpleExpression (term (factor a) *<br>
(factor (unsignedConstant (unsignedNumber (unsignedInteger 5)))))))) ; (statement c := (expression <br>
(simpleExpression (term (factor ( (expression (simpleExpression (term (factor a)) + (term (factor b))))<br>
)) * (factor (unsignedConstant (unsignedNumber (unsignedInteger 3)))))))) ; (statement (output WRITE) <br>
( (expression (simpleExpression (term (factor c)))) )) ;) END) .)
```
в дерево, предоставляя текстовый вывод синтаксического дерева в консоль
