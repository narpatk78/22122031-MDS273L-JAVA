// importing library for taking user inputs.
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        // taking employee details.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = scan.nextLine();
        System.out.print("Enter Age:");
        int age = Integer.parseInt(scan.nextLine());
        System.out.print("Enter Gender: ");
        char gender = scan.nextLine().charAt(0);
        System.out.print("Enter State: ");
        String state = scan.next();
        System.out.print("Enter Company: ");
        String company = scan.next();

        // printing the basic employee details.
        System.out.println("\n");
        System.out.println("--------------- BASIC EMPLOYEE DETAILS ---------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + Character.toUpperCase(gender));

        System.out.println("\n");
        // printing the gender of the employee using the if condition.
        if (gender == 'm'){
            System.out.println("Gender: MALE");
        }else{
            System.out.println("Gender: FEMALE");
        }

        System.out.println("\n");

        // printing the employee details.
        System.out.println("--------------- EMPLOYEE DETAILS ---------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + Character.toUpperCase(gender));
        System.out.println("State: " + state);
        System.out.println("Company: " + company);
        // printing the region and the preferable work location using switch case.
        switch(state){
            case "Jammu & Kashmir":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in Jammu & Kashmir.");
                break;
            case "Himachal Pradesh":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in Himachal Pradesh.");
                break;
            case "Punjab":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in Punjab.");
                break;
            case "Uttrakhand":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in Uttrakhand.");
                break;
            case "Haryana":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in Haryana.");
                break;
            case "Delhi":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in Delhi.");
                break;
            case "Rajasthan":
                System.out.println("The Employee is from the Western states of India; Preferable work location is in Rajasthan.");
                break;
            case "Gujarat":
                System.out.println("The Employee is from the Western states of India; Preferable work location is in Gujarat.");
                break;
            case "Maharasthra":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Maharasthra.");
                break;
            case "MP":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Madhya Pradesh.");
                break;
            case "UP":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Uttar Pradesh.");
                break;
            case "Chattisgarh":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Chattisgarh.");
                break;
            case "Jarkhand":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Jarkhand.");
                break;
            case "Bihar":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Bihar.");
                break;
            case "Odisha":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in Odisha.");
                break;
            case "Goa":
                System.out.println("The Employee is from the Southern states of India; Preferable work location is in Goa.");
                break;
            case "Telangana":
                System.out.println("The Employee is from the Southern states of India; Preferable work location is in Telangana.");
                break;
            case "AP":
                System.out.println("The Employee is from the Southern states of India; Preferable work location is in Andhra Pradesh.");
                break;
            case "Karnataka":
                System.out.println("The Employee is from the Southern states of India; Preferable work location is in Karnataka.");
                break;
            case "Kerala":
                System.out.println("The Employee is from the Southern states of India; Preferable work location is in Kerala.");
                break;
            case "TN":
                System.out.println("The Employee is from the Southern states of India; Preferable work location is in Tamil Nadu.");
                break;
            case "WB":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in West Bengal.");
                break;
            case "Sikkim":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Sikkim.");
                break;
            case "Assam":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Assam.");
                break;
            case "Arunachal":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Arunachal Pradesh.");
                break;
            case "Nagaland":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Nagaland.");
                break;
            case "Meghalaya":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Meghalaya.");
                break;
            case "Manipur":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Manipur.");
                break;
            case "Mizoram":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Mizoram.");
                break;
            case "Tripura":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in Tripura.");
                break;
        }
        // printing whether the employee works in an MNC or not.
        if (company.equals("Google") || company.equals("Facebook") || company.equals("IBM") ||company.equals("Apple") || 
        company.equals("Samsung") || company.equals("Microsoft")){
            System.out.println("The employee is working in Top MNC Companies.");
        }
        else{
            System.out.println("The employee is not working in Top MNC Companies.");
        }
        System.out.println("\n");
    }
}
