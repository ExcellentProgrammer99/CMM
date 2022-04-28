grammar CMM;

stat: (start? NEWLINE)*
    ;

start:	assignment
	| print
    | writer
   ;


reader: READ '(' STR ')'
    ;
writer: WRITE '(' ID ',' STR ')'
    |WRITE '(' ID indexExpression ',' STR ')'
    | WRITE '(' STR ',' STR ')'
;
assignment: STRING ID  indexExpression? '=' STR
    | DOUBLE ID indexExpression? '=' DBL
    | INTEGER ID indexExpression? '=' INT
    | STRING ID  indexExpression? '=' reader
    | create_an_array_expression
    ;

create_an_array_expression:
    STRING ID '=' '[' STR nextStrExpression
    | DOUBLE ID '=' '[' DBL nextDoubleExpression
    | INTEGER ID '=' '[' INT nextIntExpression
;

nextStrExpression:']'
    | ',' STR nextStrExpression
    | ADD STR nextStrExpression
;

nextIntExpression:']'
    | ',' INT nextIntExpression
    | anyoperation INT nextIntExpression
;
nextDoubleExpression:']'
    | ',' DBL nextDoubleExpression
    | anyoperation DBL nextDoubleExpression
;
anyoperation: ADD
|OPERATORS
;
indexExpression: '[' INT ']'
;
print: PRINT '(' ID ')'
    | PRINT '(' STRING ')'
    | PRINT '(' reader ')'
    | PRINT '(' ID indexExpression ')'
    ;

OPERATORS: '-'
    | '*'
    | '/'
    | '**'
;

WRITE:	'WRITE' 
   ;

READ:	'READ' 
   ;
DBL: '0'..'9'+'.''0'..'9'+
    ;
ADD: '+'
;
INTEGER: 'INT'
;
PRINT:'PRINT'
;
STRING: 'STRING'
;
DOUBLE: 'DOUBLE'
;
STR :  '"' ( ~('\\'|'"') )* '"'
    ;
ID:   [a-zA-Z_][a-zA-Z0-9_]*
   ;
TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;
TOSTRING: '(string)'
;

INT:   '0'..'9'+
    ;
COMA: ','
;
IF: 'IF'
;
ELSE: 'ELSE'
;
FOR: 'FOR'
;
CLASS: 'class'
;
END: 'end'
;
EQ: '='
;
SQRBRACKETO: '['
;
SQRBRACKETC: ']'
;
BRACKETO: '('
;
BRACKETC: ')'
;

NEWLINE: '\n'
;
WS:   (' '|'\t')+ -> skip

    ;
