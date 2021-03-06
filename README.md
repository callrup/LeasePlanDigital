Project : LeasePlan Digital

Framework : ## Serenity  Integration

Serenity (previously known as 'Thucydides') is a library designed to make writing automated acceptance tests easier, 
and more fun. 

## What does it do?

This module lets you write your BDD acceptance tests using JBehave, and generate fabulous living documentation reports
based on the outcomes of these tests.

Technologies
Java
Cucumber 
Rest Assured
Serenity





The project directory structure
The project has build scripts for both Maven and follows the standard directory structure used in most Serenity projects:
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
    + CustomList                  Feature file subdirectories





The sample scenario
Cucumber BBD :
Feature: Search CustomList default

Feature: GETCseList
@GetCseList
Scenario Outline: 1)Verify Cse List
Given Testing environment
When I pass headers
	|Accept    |  application/json|
	And I pass queryParametres
	|key       | <key>            |
	And I perform GET operation "<resourceName>"
	Then I should get "<status>" response
	And response content Type is json
	
	Examples:
	  |status|resourceName        | key                                     |
	|200   |getCustomList       |AIzaSyBiMV753BNcoMg5qxnrmdjHh3UfyutmKw0  |





Generating the reports
Since the Serenity reports contain aggregate information about all of the tests, they are not generated after each individual test (as this would be extremenly inefficient). Rather, The Full Serenity reports are generated by the serenity-maven-plugin. You can trigger this by running mvn serenity:aggregate from the command line or from your IDE.
They reports are also integrated into the Maven build process: the following code in the pom.xml file causes the reports to be generated automatically once all the tests have completed when you run mvn verify?
             <plugin>
                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.maven.version}</version>
                <configuration>
                    <tags>${tags}</tags>
                </configuration>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>




