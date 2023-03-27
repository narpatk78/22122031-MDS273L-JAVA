import java.io.*;
import java.util.Scanner;


class Student {

    Scanner sc = new Scanner(System.in);

    String name;
    String classDiv;
    int regNumber;
    String dept;
    String email;
    long phNumber;


    Student(String name, String classDiv, int regNumber, String dept, String email, long phNumber) {
        this.name = name;
        this.classDiv = classDiv;
        this.regNumber = regNumber;
        this.dept = dept;
        this.phNumber = phNumber;
        this.email = email;
    }


    Student(){
        name = "";
        classDiv = "";
        regNumber = 0;
        dept = "";
        email = "";
        phNumber = 0;
    }


    void displayDetails() {
        System.out.println("********** DETAILS **********");
        System.out.println("Name: " + name);
        System.out.println("Class and Division: " + classDiv);
        System.out.println("Register Number: " + regNumber);
        System.out.println("Email ID: " + email);
        System.out.println("Department: " + dept);
        System.out.println("Phone Number: " + phNumber);
    }


    public String ConverttoString() {
        String details = "Name: " + name + "\n" + "Class and Division: " + classDiv + "\n" +
                "Register Number: " + Integer.toString(regNumber) + "\n" + "Email ID: " + email + "\n" +
                "Department: " + dept + "\n" + "Phone Number: " + Long.toString(phNumber);
        return details;
    }


    void writeToFile(){
        String fileName = name + "_Details.txt";
        String filepath = "C:\\Users\\Narpat\\22122031-MDS273L-JAVA\\Lab 6\\" + fileName;
        try {
            File file = new File(filepath);

            if (file.exists()) {
                System.out.println("File Already exists.");
            }
            else {
                file.createNewFile();
                System.out.println("File Created Successfully.");
            }
            if (file.canWrite()) {
                FileWriter writeInFile = new FileWriter(file);
                writeInFile.write(ConverttoString());
                writeInFile.close();
            }
            else {
                System.out.println("Could not write in file");
            }
        }
        catch (Exception error) {
            System.out.println(error);
        }
    }

}

public class lab6 {

    static Scanner scan = new Scanner(System.in);

    static Student addStudent() {
        System.out.println("############### Enter the Student Details ###############");
        System.out.print("Enter the Student Name: ");
        String name = scan.nextLine();
        System.out.print("Enter the Student Class and Division: ");
        String classDiv = scan.nextLine();
        System.out.print("Enter the Student Register Number: ");
        int regNumber = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the Student Department: ");
        String dept = scan.nextLine();
        System.out.print("Enter the Student Phone Number: ");
        Long phNumber = Long.parseLong(scan.nextLine());
        System.out.print("Enter the Student Email ID: ");
        String email = scan.nextLine();
        Student st1 = new Student(name, classDiv, regNumber, dept, email, phNumber);
        return st1;
    }

    public static void updateDetails(Student[] arr){
        System.out.print("Update Student Details by Name(1) or by Register Number(2)?: ");
        int choice = Integer.parseInt(scan.nextLine());
        if (choice == 1) {
            System.out.print("Enter the Name of the Student whose Details are to be Updated: ");
            String studentName = scan.nextLine();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].name.equalsIgnoreCase(studentName)) {
                    System.out.print("Enter New Student Name: ");
                    arr[i].name = scan.nextLine();
                    System.out.print("Enter New Student Class and Division: ");
                    arr[i].classDiv = scan.nextLine();
                    System.out.print("Enter New Student Register Number: ");
                    arr[i].regNumber = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter New Student Department: ");
                    arr[i].dept = scan.nextLine();
                    System.out.print("Enter New Student Phone Number: ");
                    arr[i].phNumber = Long.parseLong(scan.nextLine());
                    System.out.print("Enter New Student Email ID: ");
                    arr[i].email = scan.nextLine();
                    break;
                }
            }
        } 
        else if (choice == 2) {
            System.out.print("Enter the Register Number of the Student whose Details are to be Updated: ");
            int studentRegNo = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].regNumber == studentRegNo) {
                    System.out.print("Enter New Student Name: ");
                    arr[i].name = scan.nextLine();
                    System.out.print("Enter New Student Class and Division: ");
                    arr[i].classDiv = scan.nextLine();
                    System.out.print("Enter New Student Register Number: ");
                    arr[i].regNumber = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter New Student Department: ");
                    arr[i].dept = scan.nextLine();
                    System.out.print("Enter New Student Phone Number: ");
                    arr[i].phNumber = Long.parseLong(scan.nextLine());
                    System.out.print("Enter New Student Email ID: ");
                    arr[i].email = scan.nextLine();
                    break;
                }
            }
        }        
    }

    public static void searchStudent(Student[] arr) {
        System.out.print("Search Student by Name(1) or by Register Number(2)?: ");
        int choice = Integer.parseInt(scan.nextLine());
        if (choice == 1) {
            System.out.print("Enter the Name of the Student: ");
            String studentName = scan.nextLine();
            Student stFound = new Student();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].name.equalsIgnoreCase(studentName)) {
                    System.out.println("Student Found at Index " + i);
                    stFound = arr[i];
                    stFound.displayDetails();
                    break;
                }
            }
        } 
        else if (choice == 2) {
            System.out.print("Enter the Register Number of the Student: ");
            int studentRegNo = Integer.parseInt(scan.nextLine());
            Student stFound = new Student();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].regNumber == studentRegNo) {
                    System.out.println("Student Found at Index " + i);
                    System.out.println();
                    stFound = arr[i];
                    stFound.displayDetails();
                    break;
                }
            }
        }
    }




    public static void main(String[] args) {

        int stCount = 0;
        Student student[] = new Student[100];
        char cont = 'y';

        do{
            System.out.println("------------ SELECT AN OPTION ------------");
            System.out.println("1. Add a Student and their Details (1).");
            System.out.println("2. Search for a Student(2).");
            System.out.println("3. Update the Details of a Student(4).");
            System.out.println("4. Print all the Student Names(4).");
            System.out.println("5. Print the Details of all the Students(5).");

            System.out.println();
            System.out.print("Enter your choice: ");
            int option = Integer.parseInt(scan.nextLine());
            System.out.println();

            switch (option) {
                case 1:
                    Student s1 = addStudent();
                    student[stCount] = s1;
                    stCount++;
                    System.out.println("Student added successfully.");
                    s1.writeToFile();
                    break;

                case 2:
                    searchStudent(student);
                    break;

                case 3:
                    updateDetails(student);
                    break;
                    
                case 4:
                    System.out.println("Names of the Student Registered:");
                    for (int i = 0; i< stCount; i++) {
                        System.out.print(i+1 +". ");
                        System.out.println(student[i].name);
                    }  
                    break;
                        
                case 5:
                    for (int i = 0; i< stCount; i++) {
                        student[i].displayDetails();
                        System.out.println();
                    }  
                    break;
                        

            }

            System.out.println("Press 'y' to continue, and anything else to quit.");
            cont = scan.nextLine().charAt(0);


        }while(cont == 'y' || cont == 'Y');

    }
}
