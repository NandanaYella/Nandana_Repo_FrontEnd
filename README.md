# GUI functional testing
This automation framework is designed to test the webapplication using Java,Selenium and TestNG and Maven

## Prerequisites:

- Java JDK11
- Maven
- Web browser

## Technologies

- Java: Programming language for writing tests
- Selenium WebDriver: For browser automation
- TestNG: Managing test suites
- Maven: Build automation tool
- Extent reports: For test reporting


**To download the project:**

**Clone the repository**
git clone  https://github.com/NandanaYella/Nandana_Repository

**Execute the program:**
from command line : mvn test 

## Packages in the framework:

- Base: In base class initialisation of driver,loading properties file and handling synchronization issues.
- Config package:Configurations like browser,user defined here
- Resources:
    - globalPackage
    - staticPackage
 - Utilities: classes for storing evidences,reporting 
    - extent report will be genearted and stored in src/main/java/Reports
    - evidences will be stored in C:\TestEvidence

**Test cases:**
Test cases will be written under test/java folder
