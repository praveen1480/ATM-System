# ATM System in Java

## Overview
This Java program simulates a basic ATM system, allowing users to:
- Check their balance
- Deposit money
- Withdraw money
- View account information
- Exit the system

## Features
- **Encapsulation**: Account details are private and accessible via getter methods.
- **User Input Handling**: The program takes user inputs via `Scanner`.
- **Transaction Validation**: Ensures deposits and withdrawals follow appropriate rules.
- **Loop for Continuous Transactions**: The program runs in a loop until the user chooses to exit.

## How It Works
1. The program initializes an **Account** object with an account number, holder name, and initial balance.
2. It presents an **ATM Menu** where the user can choose an operation.
3. Based on the selection:
   - **Check Balance**: Displays the current balance.
   - **Deposit**: Adds a valid deposit amount to the balance.
   - **Withdraw**: Deducts the requested amount if funds are available.
   - **Account Info**: Displays the account holder name and number.
   - **Exit**: Ends the session.

## How to Run
1. Ensure you have **Java installed**.
2. Compile the program:
   ```bash
   javac ATMSystem.java