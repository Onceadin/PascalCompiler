PROGRAM Example;
VAR a, b, c:INTEGER;
BEGIN
  b := a;
  b := a * 5;
  c := (a + b) * 3;
  WHILE a + b DO 
	BEGIN 
		WRITELN b;
	END;
  WRITELN b;
  IF a + b 
	BEGIN 
		WRITELN b;
		READLN (a);
	END;
  WRITE a;
END.
