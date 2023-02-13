
// importing required libraries.
import java.util.Scanner;

public class lab3 {

    static Scanner scan = new Scanner(System.in);
    static int j = 0;
    static String[] studentNames = new String[1024]; // static global string array.
    static String[] details = { "Name", "Register Number", "Email", "Class", "Department" }; // static global details
                                                                                             // array.

    // function to collect student details.
    static String[] collectDetails() {
        String[] studentDetail = new String[5];
        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter Student " + details[i] + ": ");
            String detail = scan.nextLine();
            studentDetail[i] = detail;
        }
        studentNames[j] = studentDetail[0];
        return studentDetail;
    }

    // function to display the details of all the students.
    static void name(String arr[][]) {
        System.out.println("************ DETAILS OF ALL STUDENTS ************");
        for (int r = 0; r < j; r++) {
            System.out.println();
            System.out.println("STUDENT " + (r + 1) + ":");
            System.out.println("Name: " + arr[r][0]);
            System.out.println("Register Number: " + arr[r][1]);
            System.out.println("Email: " + arr[r][2]);
            System.out.println("Class: " + arr[r][3]);
            System.out.println("Department: " + arr[r][4]);
            System.out.println();

        }
    }

    // function to display the details of the name of a particular student.
    static void displayDetails(String arr[][]) {
        System.out.print("Enter the Name of the Student whose details are to be found: ");
        String searchName = scan.nextLine();
        for (int k = 0; k <= studentNames.length; k++) {
            if (studentNames[k].equalsIgnoreCase(searchName)) {
                System.out.println();
                System.out.println("********** DETAILS **********");
                System.out.println("Name: " + arr[k][0]);
                System.out.println("Register Number: " + arr[k][1]);
                System.out.println("Email: " + arr[k][2]);
                System.out.println("Class: " + arr[k][3]);
                System.out.println("Department: " + arr[k][4]);
                System.out.println();
                break;
            }
        }

    }

    public static void main(String[] args) {

        String arr[][] = new String[1024][5]; // multi-dimensional array containing the details of all the students.
        int arrLength = 0;
        char cont = 'y';

        do { // do-while for the menu-driven program.
            System.out.println();
            System.out.println("------------------ SELECT AN OPTION ------------------");
            System.out.println("1. Collect Student Details (1).");
            System.out.println("2. Displaying Student Detials (2).");
            System.out.println("3. Searching the Details of a Student (3).");

            System.out.println();
            System.out.print("Enter your choice: ");
            int option = Integer.parseInt(scan.nextLine());
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("***** COLLECTING DETAILS *****");
                    System.out.println();
                    String[] d = collectDetails();
                    arr[arrLength] = d;
                    arrLength++;
                    j++;
                    System.out.println();
                    break;

                case 2:
                    displayDetails(arr);
                    break;

                case 3:
                    name(arr);
                    break;
            }

            System.out.println("Press 'y' to continue, and anything else to quit.");
            cont = scan.nextLine().charAt(0);

        } while (cont == 'y' || cont == 'Y');
    }
}
