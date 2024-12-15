# BankAccountApp

## Applicant Name
Elizabeth Rakhi Baby

## Overview

The **BankAccountApp** is a simple command-line banking application that allows users to perform basic banking operations such as depositing money, withdrawing money, and printing account statements. This application is designed to manage bank account functionalities in an easy-to-use interface.

## Design Overview

The application consists of the following main classes:

- **BankAccount**: Manages the account balance and transactions. It provides methods for depositing and withdrawing funds and maintains a list of transactions for printing statements.
  
- **Transaction**: Represents a banking transaction, including its type (deposit or withdrawal), the amount involved, the current balance after the transaction, and the date of the transaction.

- **BankAccountApp**: The main class providing a command-line interface for user interaction with the banking system. It prompts users for actions, processes input, and displays appropriate messages.

### Assumptions

- The initial balance of the account is set to zero when created.
- Users can only deposit or withdraw positive amounts (deposits and withdrawals cannot be negative).
- Withdrawals cannot exceed the available balance, and appropriate error messages are displayed for insufficient funds.
- The application maintains a history of transactions and displays them in a formatted manner.

## Instructions to Run the Application

### Required Environment

- **Java Development Kit (JDK)**: Ensure you have JDK installed on your machine (Java 11 or higher is recommended).
- **Operating System**: The application can be run on any operating system (Windows, Linux, or macOS) that supports Java.

### Running the Application

1. **Navigate to the `src` directory** within the project folder:
   ```bash
   cd /path/to/BankAccountApp/src

2. **Compile the Application**  
   ```bash
   javac main/*.java


3. **Run the Application**  
   ```bash
   java -cp main BankAccountApp

4. **Interact with the Application**  

### Testing the Application

1. **Navigate to the `src` directory** within the project folder:
   ```bash
   cd /path/to/BankAccountApp/src

2. **Compile the Test Class**  
   ```bash
   javac -cp .:main test/BankAccountTest.java

3. **Run the Test**  
   ```bash
   java -cp .:main:test BankAccountTest

4. **View Test Results**  