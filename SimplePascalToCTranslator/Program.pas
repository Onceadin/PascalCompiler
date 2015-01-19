PROGRAM Example;
VAR a, b, c:INTEGER;
BEGIN
  a := 1;
  b := a;
  b := a * 5;
  c := (a + b) * 3;
  WHILE a + b DO 
	BEGIN 
		WRITELN b;
	END;
  WRITELN b;
  WRITE a;
END.
