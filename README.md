# A small test automation project to fill forms on two different URLs / Pages

# Using Selenium WebDriver tool have developed this script to help perform the basic actions or functions needed to fill a form out on a WebPage

# Programming language, Tools / Libraries Used : Java (jdk-17), Selenium WebDriver

* I have automated two web pages namely a formy and formjot page that takes in User names, D.O.B, select checkbox, etc. 
* I have used a page object model structure for writing this test script
* I have created a Page class for different pages that encapsulate methods page-specific actions and interactions
* I have created a separate Action Class containing methods that perform common actions on both the pages
* My main method finally instantiates the ChromeDriver object and uses Try Catch block to catch any exception and also call my different pages and perform actions on them
