grammar LabeledExpr;

PROGRAM  :  'PROGRAM' ;
BEGIN    :  'BEGIN'   ;
WRITE    :  'WRITE'   ;
WRITELN  :  'WRITELN' ;
READ     :  'READ'    ;
READLN   :  'READLN'  ;
END      :  'END'     ;
VAR      :  'VAR'     ;
PLUS     :  '+'       ;
MINUS    :  '-'       ;
MULT     :  '*'       ;
DIV      :  '/'       ;
DOT      :  '.'       ;
SEMI     :  ';'       ;
COLON    :  ':'       ;
COMMA    :  ','       ;
ASSIGN   :  ':='      ;
INTEGER  :  'INTEGER' ;
LPAR     :  '('       ;
RPAR     :  ')'       ;

program
    : declarations
      block
      DOT
;

declarations    : (progDef)+ (varDefs)*        ;
progDef         : PROGRAM ID SEMI              ;
varDefs         :  VAR varDefList              ;
varDefList      :  (varDef SEMI)+              ;
varDef          :  idList COLON typeIdentifier  ; 
idList          :  ID ( COMMA ID )*             ;
typeIdentifier
    : INTEGER 	;

block           :  BEGIN statementList END     ;

statementList   : (statement SEMI)+            ;

statement 
    : ID ASSIGN expression    ;

expression
    : simpleExpression;

simpleExpression
    : term((PLUS|MINUS) term )* ;
      
term : factor ((MULT|DIV) factor)* ;

factor : LPAR expression RPAR 
       | ID		      
       | unsignedConstant     
       ;

unsignedConstant
    : unsignedNumber;

unsignedNumber
    : unsignedInteger;

unsignedInteger
    : NUM_INT 
    ;

NUM_INT
  : ('0'..'9')+;

ID  :  ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*  ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
