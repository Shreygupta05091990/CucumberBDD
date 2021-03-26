Feature:  Search Functionality SCenarios


@Search  @One 
Scenario: Verify User is able to search the products 
Given I launch the application
When I search for a product "Samsung SyncMaster 941BW" 
Then I should see the product in Serch Results

@Search  @Two
Scenario: Verify is not able to search the product which doesn't exist
Given I launch the application
When I search for a product "Apple I phone12"
Then No product should appear  in search results