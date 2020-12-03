Feature:Cart functionality
Scenario Outline:User searches from menu
Given user is on home page
When user searches for an <item>
    Examples:
   |    item        |
   |    burger      |
   |    pizza       |
   |    chicken     |
Scenario:User selects items
Given user is on home page
When user selects an item and add

Scenario: User performs cart operations
Given user is on home page
When user selects an item and add
And user adds the quantity of item
And user removes the quantity of item

Scenario:User Customizes cart
Given user is on home page
When user selects an item and add
And user selects customizations

Scenario: User adds recommendations
Given user is on home page
When user selects an item and add
And user can add the recommendations

 