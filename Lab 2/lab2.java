// importing required library for taking user inputs.
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] Names = new String[1024]; // creating a string array with maximum length of 1024.
        Boolean condition = false; // initializing the initial boolean condition
        int pos = 0;

        // do while condition for the menu driven program.
        do {
            condition = true;
            System.out.println();
            System.out.println();
            System.out.println("------------------ SELECT AN OPTION ------------------");
            System.out.println("1. Entering Names (1).");
            System.out.println("2. Searching for Names (2).");
            System.out.println("3. Remove a name (3).");
            System.out.println("4. Quit (4).");
            System.out.println();
            System.out.println("Enter your choice: ");
            int option = Integer.parseInt(sc.nextLine()); // taking user input Options.

            switch (option) {

                case 1: {
                    // entering names
                    System.out.println("--------------- ENTERING NAMES ---------------");
                    System.out.print("Enter the Name to be added: ");
                    String name = sc.nextLine();
                    System.out.println();
                    for(String names : Names){
                        if(name.equals(names)){
                            System.out.println("Entered Name already exist in the list.");
                            System.out.println("Try a different Name.");
                            System.out.println();
                        }
                        else{
                            Names[pos] = name;
                        }
                    }
                    pos++;
                    break;

                }

                case 2: {
                    // searching for names
                    int i;
                    System.out.println();
                    System.out.println("--------------- SEARCHING FOR NAMES ---------------");
                    System.out.println("Enter the Name you are Searching for: ");
                    String searchedName = sc.nextLine();
                    System.out.println();
                    for (i = 0; i < Names.length; i++) {
                        if (searchedName.equals(Names[i])) {
                            System.out.println(searchedName + " present in the list.");
                            System.out.println("Name found at position " + (i + 1));
                            break;
                        }
                    }
                    break;
                }

                case 3: {
                    // removing names
                    int j;
                    System.out.println();
                    System.out.println("--------------- REMOVING NAMES ---------------");
                    System.out.println("Enter the Name you want to remove from the list: ");
                    String removeName = sc.nextLine();
                    for (j = 0; j < Names.length; j++) {
                        if (removeName.equals(Names[j])) {
                            for (; j < Names.length - 1; j++) {
                                Names[j] = Names[j + 1];
                            }
                        }
                    }
                    System.out.println("Name successfully removed from the list.");
                    break;
                }

                case 4: {
                    // quitting
                    System.out.println();
                    System.out.println("Quitting!!! ");
                    System.out.println();
                    condition = false;
                    break;
                }
            }
            
        }while (condition);
    }
}


