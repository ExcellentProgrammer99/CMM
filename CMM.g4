
grammar CMM;

prog: ( (stat|function)? NEWLINE )*
;

stat:	 IF equal THEN blockif ENDIF #if
    | READ ID           #read
	| PRINT ID   		#print
    | ID #call
	| REPEAT repetitions prog ENDREPEAT		#repeat
    // | IF equal THEN blockif ENDIF 	#if
	| ID '=' expr0		#assign
    | WRITE ID          #write
    // | IF ID COMPARE (ID|value) THEN prog #blockif
;

equal: ID '==' INT // TODO (ID|value) COMPARE (ID|value)
;

blockif: prog
;

expr0:  expr1			#single0
      | expr1 ADD expr1		#add 
;

expr1:  expr2			#single1
      | expr2 MULT expr2	#mult 
;


expr2:  ID                  #ID
       | STR                 #string 
       | INT			    #int
       | REAL			    #real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
       | arr  #array  // TODO problem with recursive declaration
;

arr: '[' value ']'
;
function: FUNCTION fparam fblock ENDFUNCTION
;
repetitions: value
;
fparam: ID
;

fblock: ( stat? NEWLINE )* 
; 
value:      INT
        |   REAL
    ;

PRINT:	'print' 
    ;
FUNCTION: 'function'
;
ENDFUNCTION: 'endfunction'
;
IF:'IF'
;
ENDIF:	'endif'
;
THEN: 'THEN'
;
REPEAT:	'repeat'
    ;
ENDREPEAT: 'endrepeat'
;
WRITE: 'WRITE'
;
READ: 'READ'
;
TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

COMPARE: '>'|'<'|'>='|'<='|'=='|'!='
;
REAL: '0'..'9'+'.''0'..'9'+
    ;


INT: '0'..'9'+
    ;

ADD: '+'
    ;

MULT: '*'
    ;
STR :  '"' ( ~('\\'|'"') )* '"'
    ;
NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
