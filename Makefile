build:
	mvn clean compile assembly:single
test:
	mvn test
run:
	java -jar target/triangle-0.0.1-SNAPSHOT-jar-with-dependencies.jar
