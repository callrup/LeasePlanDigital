Feature: GETCustomSearchList-Default
@GetCseList
	Scenario Outline: 1) Verify default List -<>
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