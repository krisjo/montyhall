# montyhall
A Monty Hall problem simulator

## Build
In directory ```../montyhall```
```bash
mvn clean package
```
## Run tests
```bash
mvn test
```

## Execute
In directory ```./montyhall``` 

```bash
mvn exec:java -Dexec.mainClass="montyhall.MontyHallSimulationRun" -Dexec.args="100"
```
or
```bash
java -classpath target/classes montyhall.MontyHallSimulationRun 100
```
