This example demonstrates how to aggregate code coverage across multiple Maven modules using TestNG, Jacoco, and Sonar.
It also shows how to separate code by integration and unit tests.

how to collect code coverage by integration tests

This example demonstrates how to collect code coverage by integration tests, tests are located in a separate Java Maven module.
SonarQube aggregates code coverage by unit tests and integration tersts to compute an overall code coverage (this feature requires SonarQube 3.3).

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project and execute unit tests:

        mvn clean install
        
* Build the project and execute both unit and integration tests:

        mvn clean install -DskipIT=false

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar
        