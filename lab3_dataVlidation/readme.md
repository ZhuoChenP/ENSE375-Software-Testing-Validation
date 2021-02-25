<div align="center">

## ENSE 375 - Lab3
</div>

Compile using...

```
javac -d bin -cp bin ./src/*.java
```

And on Windows VS code...
```
javac -d bin -cp 'bin;junit-platform-console-standalone-1.7.0-all.jar' ./test/*.java
```

And run our tests using...

```
java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path 
```