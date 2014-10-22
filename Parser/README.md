Эти команды выполняются в терминале:
1) Настройка среды
export CLASSPATH=".:/usr/local/lib/antlr-4.X-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.X-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'
2) Генерация кода парсера по логике Хоара
antlr4 MyParser.g4 
3) Компиляция кода в парсер
javac MyParser*.java
4) Запуск парсера на файл
grun MyParser program -gui Program.pas
