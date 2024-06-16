# Serenity BDD UI and API Testing Framework

## Overview
This project is a comprehensive testing framework for both UI and API testing, utilizing Serenity BDD to ensure robust and readable test reports. The framework leverages Behavior-Driven Development (BDD) principles to create tests that are easy to understand and maintain.

## Table of Contents
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Writing Tests](#writing-tests)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

This project is a comprehensive testing framework for both UI and API testing, utilizing Serenity BDD to ensure robust and readable test reports. The framework leverages Behavior-Driven Development (BDD) principles to create tests that are easy to understand and maintain.

### Prerequisites
- Java JDK 8 or higher
- Maven 3.6.3 or higher
- Git (optional, for version control)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/automation-andy101/serenity-bdd-ui-api-testing.git
   cd serenity-bdd-framework

## Running Tests 

1. Running All Tests -
    ```bash 
    mvn clean verify

2. Running with Chrome - 
    ```bash 
   mvn clean verify -Dwebdriver.driver=chrome
3. Running with FireFox -
    ```bash
   mvn clean verify -Dwebdriver.driver=firefox
4. Running with MSEdge -
    ```bash
      mvn clean verify -Dwebdriver.driver=edge
5. Running a Specific Tag -
    ```bash 
    mvn clean verify -Dcucumber.options="--tags @ui"
6. Running a Specific Feature -
    ```bash
   mvn clean verify -Dcucumber.options="classpath:features/my_feature.feature"
