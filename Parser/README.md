#Эти команды выполняются в терминале: <br>
###1) Настройка среды <br>
export CLASSPATH=".:/usr/local/lib/antlr-4.X-complete.jar:$CLASSPATH" <br>
alias antlr4='java -jar /usr/local/lib/antlr-4.X-complete.jar' <br>
alias grun='java org.antlr.v4.runtime.misc.TestRig' <br>
###2) Генерация кода парсера по логике Хоара <br>
antlr4 MyParser.g4  <br>
###3) Компиляция кода в парсер <br>
javac MyParser*.java <br>
###4) Запуск парсера на файл <br>
grun MyParser program -gui Program.pas <br>
