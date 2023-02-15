# TechJobs, MVC Edition

For [this assignment](https://education.launchcode.org/java-web-development/assignments/tech-jobs-mvc.html) students are asked to once again refactor a TechJobs application, this time using an MVC 
design pattern.

## Assignment Requirements

1. Review Starter Code
2. Complete the List Views
3. Complete the `searchController`
4. Display Search Results

## Unit Tests

The starter code contains 4 unit test classes.  As with previous graded assignments, each test class was created for a specific task in the instructions.

`TestTaskTwo` verifies the work done to complete the List Views.  This includes displaying a list of jobs and adding a View All link.

`TestTaskThree` verifies work done to complete the `SearchController`.  This includes verifying how the `displaySearchResults` method was created and making sure that the moths calls both `findAll` and `findByColumnAndValue` methods.  This test does not check behavior.

`TestTaskFour` verifies the behaviors required for `displaySearchResults` to pass data to a view.  

`ApplicationTest` verifies that the application is able to run.
 
### Appearance and Code Check:
 
Before you start working, check out our [Working Demo App](https://java-techjobs-mvc.launchcodetechnicaltraining.org/).
The app occasionally restarts. If you experience an error, please wait a few minutes before refreshing the page.
 
1. Start the application.
1. Test the search functionality of the project:

    a. Initiate a search by location, using the search term "new york". Only 1 result should be returned on the page. The result may vary in appearance, but make sure it contains the job data organized similar to this image:

    ![Search result](searchByLocation.png "Search Result Sample")  

    b. Initiate another search by location, this time using the search term "chicago". Check that no results are returned.

    c. Search by employer this time, using the search term "equifax". 1 job should be returned.
    
    d. Search by `all` for the term "Ruby". 4 results should be returned.
    
    e. Search for the same term, "Ruby" with the "Skill" category checked. This time, only 3 results should be returned.

1. View the method for displaying the search results tested above.

    a. Be sure you can point to the method within `SearchController`.
    
    b. Is that method posting to `"results"`?
    
    c. Does it make use of `findAll()` and `findByColumnAndValue()` appropriately?
    
    d. What strategy did you use to display the jobs. Did you create one table for all of the jobs displayed or one table per job?
 
1. Back in the running app, navigate to the ``List`` view and select *View All*.

    a. A view of all 98 jobs should be returned.

## Submitting Your Work

To submit your work please following the [Submission Instructions](https://education.launchcode.org/java-web-development/assignments/hello-world.html#submitting-your-work)
