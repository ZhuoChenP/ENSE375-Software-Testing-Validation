javac -d bin ./src/*.java
javac -d bin -cp 'bin:junit-platform-console-standalone-1.7.0-all.jar' ./Test/BurgerTest.java
java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path