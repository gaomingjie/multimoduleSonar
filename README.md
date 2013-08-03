This example demonstrates how to aggregate code coverage across multiple Maven modules using TestNG, Jacoco, and Sonar.
It also shows how to separate code by integration and unit tests.

For for details visit [www.minh.io](http://www.minh.io/tech/2013/08/03/sonar-code-quality/)

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
        
