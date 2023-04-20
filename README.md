# Web-Application-Testing-and-Test-Automation-Project
This repository contains the code for a web application testing and test automation project. The project includes user story analysis and test scenario development, automation test script preparation, test execution, bug finding, and bug reporting.
# Project URL
The web application being tested is located at: https://test-nf.com/english.html
# User Story Analysis and Test Scenario Development
# User Story 0001: Add About us link option in footer of the application.
# Description-
The scope of this user story is to provide an 'About us' link so that users can click on the link and get all the details about the organization vision and mission.
# Acceptance Criteria:
1.	Users should be able to click on the 'About us' link.
2.	'About us' link should be displayed in footer part (as per the mock-up).
3.	When the user clicks on the 'About us' link, the system will navigate to a new page which displays the Organization Vision and Mission.
4.	'About us' link should be available for all the tabs (Home, Cricket, Football, Basketball and Cyber Sports).
# Automation Testing Scenario:
In this task, I prepared an automation test script using Selenium WebDriver and Java. I  also performed the test execution using TestNG framework. The automation test script covers the following scenarios:
•	Launch the application: “https://test-nf.com/english.html”
•	Verify the availability of each tab (Home, Cricket, Football, Basketball and Cyber Sports)
•	Verify that the URL of each tab contains the tab name.
•	Store all the current URLs in an Excel sheet.
# Additional Information-
We have to implement the Page Object Model design pattern to organize our code and improve its readability and maintainability. We have to use assertions for validation and Excel sheet integration for passing system properties and application URL.


#Bug Finding and Bug Reporting
In this task, I found out all the possible bugs in the web application and reported them using Jira tool. We provided the following details for each bug:
•	Bug Title
•	Bug Priority
•	Bug Severity
Some of the bugs we found are:
#HOMEPAGE
•	In header section, Basketball ,Cricket and Cybersport spelling is wrong.
o	Priority: Low
o	Severity: Low
•	In header section, football menu orange background highlight is not cover the full border length.
o	Priority: Low
o	Severity: Low
•	On hovering the “Basketball” tab the text of Basketball gets disappear.
o	Priority: Medium
o	Severity: High
•	Layout of image are not uniform.
o	Priority: Low
o	Severity: Low
•	Image of Lionel Messi is incorrect.
o	Priority: Medium
o	Severity: High
•	The Ads are overlapping with the navigation bar while scrolling the home page.
o	Priority: High
o	Severity: Urgent
•	In body section if we click on learn more button of Michael Jordon, we unable to view any information. it’s Blank  
o	Priority: High  
o	Severity: Urgent  
•	In body section, if we click learn more on Michael Jordon we unable to close information box ,the icon is not visible.  
o	Priority: High  
o	Severity: Urgent  
•	The social media handles are in footer is not clickable.  
o	Priority: Medium  
o	Severity: High  
•	On clicking “About us” link, it will navigate to a new page which is holding 404 error.  
o	Priority: High  
o	Severity: Urgent  
•	On clicking “Click here” button in Ads it only refreshes the page.  
o	Priority: Medium  
o	Severity: High  
•	On clicking “TESTERS” and “Apply Now” button, both are navigated to same page.  
o	Priority: High  
o	Severity: Urgent  
•	In body section, learn more information text is overlapped with ads.  
o	Priority: High  
o	Severity: Critical  
•	In header section the titles are not symmetric and not properly aligned  
o	Priority: Low  
o	Severity: Low 
# FOOTBALL  
•	In the Football page the image given is not related to football.  
o	Priority: Medium  
o	Severity: High  
•	First story article In Football page’s the text is not fully visible and there is no option to expand the story or view the full article.  
o	Priority: High 
o	Severity: Urgent  
# BASKETBALL  
•	The spelling of Basketball is wrong.  
o	Priority: Low  
o	Severity: Low  
•	In the Busketball page’s the articles texts are not fully visible and there is no option to expand it or view the full version of it.  
o	Priority: High  
o	Severity: Urgent  
•	In the Busketball page second story article the image is not loading.  
o	Priority: Medium  
o	Severity: High  
# CRICKET
•	The spelling of Cricket in the body is wrong  
o	Priority: Low  
o	Severity: Low  
•	In the Kriket page’s both story articles text is not fully visible and there is no option to expand the story or view the full version of it.  
o	Priority: High  
o	Severity: Urgent  
# CIBERSPORT  
•	The spelling of Cybersport in the body is wrong.  
o	Priority: Low  
o	Severity: Low  
•	In the Cibersport page the first story article text is not fully visible and there is no option to expand it.  
o	Priority: High  
o	**Severity:** Urgent  
•	In the Cibersport page the second story article text is not fully visible and there is no option to expand the story or view the full version of it.  
o	**Priority:** High
o	**Severity:** Urgent  

# Project Contributor  
**Name-** Roshan Paswan  
**Email-** Roshansaroj246@gmail.com
