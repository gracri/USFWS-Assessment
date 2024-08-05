# USFWS-DAG

This project implements a Directed Acyclic Graph (DAG) using Java. It includes the following classes:

- `DAG`: Represents the graph and provides a method to query the longest directed path.
- `Vertex`: Represents a vertex in the graph.
- `Edge`: Represents a directed edge between two vertices in the graph.

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)

## Getting Started

### Prerequisites

- Java 17 or later
- Maven (optional, for building and managing dependencies)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/gracri/USFWS-Assessment.git
    cd USFWS\ Assessment/
    ```

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. If using Maven, you can build the project with:
    ```sh
    mvn clean install
    ```

## Usage

### Running Tests

To run the unit tests, use the following command if you are using Maven:
    ```
    mvn test
    ```
Or run them from your preferred IDE.

### Running the application

The Main.java class main method contains code which runs when the application is run. It creates a new DAG and prints the longest directed path from vertex "a" to the console.
To run the application use the following command:
    ```
    mvn exec:java
    ```
Or run the application from your IDE.
