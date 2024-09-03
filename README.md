# ATM Simulator
## Description
The ATM Simulator is a Java-based application designed to simulate basic ATM functionalities including account management, transactions, and loan processing. This project demonstrates fundamental Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, and polymorphism.

## Features
Client Management: Add and manage clients with personal details and PIN.
Account Management: Support for savings and current accounts with deposit and withdrawal functionalities.
Transaction Logging: Keep track of all transactions with details such as date and status.
Loan Processing: Clients can apply for loans if they have an existing account.
ATM Interface: Simple command-line interface for ATM operations.

## Classes and Functionality
ATM: Main class to handle ATM operations, including client authentication and account management.
Client: Represents a client with personal information and account management.
Account: Base class for accounts with methods for deposit and withdrawal.
SavingAccount: Subclass of Account for savings accounts.
CurrentAccount: Subclass of Account for current accounts.
Transaction: Manages transaction records and logs.
Loan: Represents a loan with attributes like amount and duration.

## Getting Started
### Prerequisites
Java Development Kit (JDK) 8 or later.
A text editor or IDE (e.g., IntelliJ IDEA, Eclipse).
### Running the Project
Clone the Repository:
```

git clone https://github.com/yourusername/atm-simulator.git
cd atm-simulator

```
Compile the Java Files:
```

javac *.java
```
Run the Main Class:
```

java ATM
```

##Example Usage
Start the application by running the ATM class.
Enter the PIN for authentication.
Select an account and choose an option from the menu (View Balance, Withdraw, Deposit, Exit).
Perform transactions and view logs as needed.
