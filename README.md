# cucumber-java-selenium
## Cucumber Java Selenium framework for UI testing

## ❓ What is this Repository about?
This framework is an example of BDD test automation using Cucumber, Java and Selenium.
It contains scenarios to test [Bing](https://www.bing.com) search engine.

### WebDriver Setup
This project uses Selenium WebDriver to interact with the Chrome web browser.
In order for the tests to work, [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
must be installed on the test machine and accessible from the system PATH.
Make sure to download chromedriver compatible with chrome browser

The source code may easily be changed to work with any other web browser by installing the required web drivers.

**How to run Test**

    1. From IDE, run test as JUnit test
    2. From command line, run 'mvn clean test' from root folder
