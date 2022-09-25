#Author - Bala

@Prime
Feature: Filter movies by Actor 

User Story: As a user I want to search for movies based on Actor so that i can decide on number of movies I would want to watch

Scenario Outline: Correct number of movies by genre 
	Given I have signed in to Amazaon prime 
	And I have the following movies by genre on Amazon prime 
  | Muthu								    | Commercial |
	| Vel											| Action	|
	| Master									| Action  |
	| Kaithi									| Action  |
	| Padayappa 							| Commercial Action |
	| Kaththi									| Action | 
	| Life of Pie							| Adventure |
	When I search for movies by Genre "<Genre>"
	Then I find Number of "<Movies>" by Genre
	
	Examples:
		| Genre 	  | Movies |
		| Adventure |  1 |
		| Action 		|  4 |
		| Commercial | 2 |
		| Horror 		| 0 |
		| Drama 		| 0 |
	