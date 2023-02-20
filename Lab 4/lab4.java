// Write a JAVA Menu driven program that does the following:
// You can ONLY have the below variables as global variables
// Account Number
// Account Holder Name
// Account Balance


// You MUST have the below as functions
// To initialize the customer
// To deposit money
// To withdraw money
// To print the transactions
// To print account summary


// Your menu will have the following operations once the customer is created
// To deposit money
// To withdraw money
// To print the transactions
// To print account summary


// You need to draw a flowchart, and structure your results and program description and other details in README.md

// importing libraries
import java.util.Scanner;


public class lab4{

    // defining globl variables.
    static Scanner scan = new Scanner(System.in);
    static int AccNumber;
    static String AccHolderName;
    static double AccBalance;
    
    
    static int traNumber = 0;

    // functions

    static void customerInitialization(){
        System.out.print("Enter Account Holder Name: ");
        String name = scan.nextLine();
        AccHolderName = name;
        System.out.print("Enter Account Number: ");
        int number = Integer.parseInt(scan.nextLine());
        AccNumber = number;
        System.out.print("Enter Initial Balance: ");
        double balance = scan.nextFloat();
        AccBalance = balance;
    }

    static double depositMoney(String [] transactions){
        System.out.print("Enter Deposit Amout: ");
        double deposit = scan.nextFloat();
        transactions[traNumber] = "Deposited: " + deposit;
        AccBalance += deposit;
        System.out.println("New Balance: " + AccBalance);
        traNumber++;
        return AccBalance;
    }

    static double withdrawMoney(String [] transactions){
        System.out.print("Enter Withdraw Amount: ");
        double withdraw = scan.nextFloat();
        if(withdraw > AccBalance){
            System.out.println("Insufficient Balance.");
        }else{
            transactions[traNumber] = "Withdrew: " + withdraw;
            AccBalance -= withdraw;
            System.out.println("New Balance: " + AccBalance);
            traNumber++;
        }
        return AccBalance;
    }

    static void printTransactions(String [] transactions){
        System.out.println("***** TRANSACTIONS *****");
        for(int k = 0; k <= transactions.length; k++){
            System.out.println(transactions[k]);
        }
    }

    static void accountSummary(String [] transactions){
        System.out.println("***** ACCOUNT SUMMARY *****");
        System.out.println("Account Number: " + AccNumber);
        System.out.println("Account Holder Name: " + AccHolderName);
        for(int last = transactions.length - 5; last < transactions.length ; last++){
            System.out.println(transactions[last]);
        }
    }

    public static void main(String[] args){

        String [] transactions = new String[1024];
        customerInitialization();

        char cont;
        do{
            System.out.println("********** CHOOSE FROM BELOW **********\n1. Deposit Money (1).\n2. Withdraw Money (2).\n3. Print Transactions (3).\n4. Account Summary (4).");
            System.out.println("Enter your choice number: ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    depositMoney(transactions);
                    break;
                case 2:
                    withdrawMoney(transactions);
                    break;
                case 3:
                    printTransactions(transactions);
                    break;
                case 4:
                    accountSummary(transactions);
                    break;
            
            }
            System.out.println("Press 'y' to continue, and anything else to quit.");
            cont = scan.next().charAt(0);


        }while(cont == 'y' || cont == 'Y');

    }
}