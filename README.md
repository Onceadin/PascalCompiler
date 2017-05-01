PascalCompiler
==============
Транслятор языка Pascal в С. Парсер генерируется с помощью ANTLR.

# Эти команды выполняются в терминале: <br>
### 1) Настройка среды <br>
export CLASSPATH=".:/usr/local/lib/antlr-4.X-complete.jar:$CLASSPATH" <br>
alias antlr4='java -jar /usr/local/lib/antlr-4.X-complete.jar' <br>
alias grun='java org.antlr.v4.runtime.misc.TestRig' <br>
### 2) Генерация кода парсера по логике Хоара в папке /SimplePascalToCTranslator/src/<br>
antlr4 -no-listener -visitor PascalGrammar.g4<br>
