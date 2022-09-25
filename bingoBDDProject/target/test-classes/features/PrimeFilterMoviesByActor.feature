#Author: Bala
#tes coverage
@Prime
Feature: Filter movies by actor

User Story: As a user I want to search for movies based on Actor so that I can decide on number of movies I would want to watch

Background: Given I have singed into Prime 

Scenario Outline: Correct number of movies by actor

And I have the following movies on Prime based on Actor
	| Muthu								    | Rajinikanth |
	| Vel											| Suriya  |
	| Master									| Vijay |
	| Kaithi									| Karthi |
	| Padayappa 							| Rajinikanth |
	| Kaththi									| Vijay |
	
	When i search for movies by Actor "<Actor>"
	Then I find Number of "<Movies>" by Actor
	
	Examples:
	|Actor				| Movies|
	|Rajinikanth	| 2	  	|
	|Suriya				| 1			|
	|Vijay				| 1			|
	|Karthi				| 1			|
	|Suriya				| 1			|
	|Jai					| 0			|
	|Sethupathy 	| 0			|
