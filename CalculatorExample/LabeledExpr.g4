stat: expr NEWLINE
	| ID '=' expr NEWLINE
	| NEWLINE
	;

expr: expr op=('*'|'/') expr
	| expr op=('+'|'-') expr
	| INT
	| ID
	| '(' expr ')'
	;

MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;