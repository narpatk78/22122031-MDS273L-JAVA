<<<<<<< HEAD
// importing libraries
import java.util.Scanner;

public class lab4{

    // defining global variables.
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static String AccHolderName;
    static int AccNumber;
    static double AccBalance;
    static int traNumber = 0; 

    // customer initilization
    static void customerInitialization(){
        System.out.println();
        System.out.println("          Initializing Customer          ");
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

    // depositing money
    static double depositMoney(String [] transactions){
        System.out.println();
        System.out.print("Enter Deposit Amout: ");
        double deposit = scan.nextFloat();
        AccBalance += deposit;
        transactions[traNumber] = "Deposit " + "                   "+ deposit + "               "+ AccBalance;
        System.out.println("New Balance: " + AccBalance);
        traNumber++;
        return AccBalance;
    }

    // withdrawing money
    static double withdrawMoney(String [] transactions){
        System.out.print("Enter Withdraw Amount: ");
        double withdraw = scan.nextFloat();
        if(withdraw > AccBalance){
            System.out.println("Insufficient Balance.");
            transactions[traNumber] = "Transaction Failed" + "";
            traNumber++;
        }else{
            AccBalance -= withdraw;
            transactions[traNumber] = "Withdraw " + "                   "+ withdraw + "               "+ AccBalance;
            System.out.println("New Balance: " + AccBalance);
            traNumber++;
        }
        return AccBalance;
    }

    // printing transactions
    static void printTransactions(String [] transactions){
        System.out.println();
        System.out.println("                    ***** TRANSACTIONS *****");
        System.out.println("*Transaction Type*          *Amount*          *Balance*");
        for(int k = 0; k < traNumber; k++){
            System.out.println(transactions[k]);
        }
        System.out.println();
    }

    // account summary
    static void accountSummary(String [] transactions){
        System.out.println();
        System.out.println("        ***** ACCOUNT SUMMARY *****");
        System.out.println("Account Number                 :  " + AccNumber);
        System.out.println("Account Holder Name            :  " + AccHolderName);
        System.out.println("Number of Transactions Done    :  " + traNumber);
        System.out.println("Current Account Balance        :  " + AccBalance);
    }

    public static void main(String[] args){

        String [] transactions = new String[1024];
        customerInitialization();
        char cont;

        do{
            System.out.println();
            System.out.println("********** CHOOSE FROM BELOW **********\n1. Deposit Money (1).\n2. Withdraw Money (2).\n3. Print Transactions (3).\n4. Account Summary (4).");
            System.out.println();
            System.out.print("Enter your choice number: ");
            int choice = scan1.nextInt();
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
            System.out.println();
            System.out.println("Press 'y' or 'Y' to continue.");
            cont = scan.next().charAt(0);

        }while(cont == 'y' || cont == 'Y');

    }
}
=======
// importing libraries
import java.util.Scanner;

public class lab4{

    // defining global variables.
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static String AccHolderName;
    static int AccNumber;
    static double AccBalance;
    static int traNumber = 0; 

    // customer initilization
    static void customerInitialization(){
        System.out.println();
        System.out.println("          Initializing Customer          ");
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

    // depositing money
    static double depositMoney(String [] transactions){
        System.out.println();
        System.out.print("Enter Deposit Amout: ");
        double deposit = scan.nextFloat();
        AccBalance += deposit;
        transactions[traNumber] = "Deposit " + "                   "+ deposit + "               "+ AccBalance;
        System.out.println("New Balance: " + AccBalance);
        traNumber++;
        return AccBalance;
    }

    // withdrawing money
    static double withdrawMoney(String [] transactions){
        System.out.print("Enter Withdraw Amount: ");
        double withdraw = scan.nextFloat();
        if(withdraw > AccBalance){
            System.out.println("Insufficient Balance.");
            transactions[traNumber] = "Transaction Failed" + "";
            traNumber++;
        }else{
            AccBalance -= withdraw;
            transactions[traNumber] = "Withdraw " + "                   "+ withdraw + "               "+ AccBalance;
            System.out.println("New Balance: " + AccBalance);
            traNumber++;
        }
        return AccBalance;
    }

    // printing transactions
    static void printTransactions(String [] transactions){
        System.out.println();
        System.out.println("                    ***** TRANSACTIONS *****");
        System.out.println("*Transaction Type*          *Amount*          *Balance*");
        for(int k = 0; k < traNumber; k++){
            System.out.println(transactions[k]);
        }
        System.out.println();
    }

    // account summary
    static void accountSummary(String [] transactions){
        System.out.println();
        System.out.println("        ***** ACCOUNT SUMMARY *****");
        System.out.println("Account Number                 :  " + AccNumber);
        System.out.println("Account Holder Name            :  " + AccHolderName);
        System.out.println("Number of Transactions Done    :  " + traNumber);
        System.out.println("Current Account Balance        :  " + AccBalance);
    }

    public static void main(String[] args){

        String [] transactions = new String[1024];
        customerInitialization();
        char cont;

        do{
            System.out.println();
            System.out.println("********** CHOOSE FROM BELOW **********\n1. Deposit Money (1).\n2. Withdraw Money (2).\n3. Print Transactions (3).\n4. Account Summary (4).");
            System.out.println();
            System.out.print("Enter your choice number: ");
            int choice = scan1.nextInt();
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
            System.out.println();
            System.out.println("Press 'y' or 'Y' to continue.");
            cont = scan.next().charAt(0);

        }while(cont == 'y' || cont == 'Y');

    }
}
>>>>>>> 7ea548fccf8db486797a7775c13c916a0dc7061e
