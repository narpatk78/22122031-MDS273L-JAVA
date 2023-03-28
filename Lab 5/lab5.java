<<<<<<< HEAD

// importing the required libraries.
import java.util.Scanner;

public class lab5 {

    // static array containing capital characters.
    static char characters[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    static char space = ' ';
    static Scanner scan = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    // function to encrypt a plain text.
    static String cipherText(String plainText) {
        String cipher = "";
        for (int i = 0; i < plainText.length(); i++) {
            char xxx = plainText.charAt(i);
            int j = 0;
            String x = String.valueOf(xxx);
            while (j < characters.length) {
                char zzz = characters[j];
                if (x.equals(String.valueOf(space))) {
                    cipher = cipher.concat(String.valueOf(space));
                    break;
                } else if (x.equals(String.valueOf(zzz))) {
                    if (j < 3) {
                        zzz = characters[j + 23];
                        cipher = cipher.concat(String.valueOf(zzz));
                    } else if (j >= 3 && j <= 25) {
                        zzz = characters[j - 3];
                        cipher = cipher.concat(String.valueOf(zzz));
                    }
                    break;
                } else {
                    j = j + 1;
                }
            }
        }
        return cipher;
    }

    // function to decrypt an encrypted text.
    static String plainText(String cypherText) {
        String plain = "";
        for (int i = 0; i < cypherText.length(); i++) {
            char xxx = cypherText.charAt(i);
            int j = 0;
            String x = String.valueOf(xxx);
            while (j < characters.length) {
                char zzz = characters[j];
                if (x.equals(String.valueOf(space))) {
                    plain = plain.concat(String.valueOf(space));
                    break;
                } else if (x.equals(String.valueOf(zzz))) {
                    if (j > 22) {
                        zzz = characters[j - 23];
                        plain = plain.concat(String.valueOf(zzz));
                    } else if (j <= 22) {
                        zzz = characters[j + 3];
                        plain = plain.concat(String.valueOf(zzz));
                    }
                    break;
                } else {
                    j = j + 1;
                }
            }
        }
        return plain;
    }

    public static void main(String[] args) {

        // menu- driven program.
        char cont;
        do {
            System.out.println();
            System.out.println("********** ENCRYPTION - DECRYPTION **********");
            System.out.println("--- SELECT FROM OPTION BELOW ---");
            System.out.println("1. Encryption of Plain Text (1).\n2. Decryption of Cypher Text (2).");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Text you want to Encrypt: ");
                    String plain = scan.nextLine();
                    plain = plain.toUpperCase();
                    String plainToCipher = cipherText(plain);
                    System.out.println("Encrypted Text: " + plainToCipher);
                    break;

                case 2:
                    System.out.print("Enter the Text you want to Decrypt: ");
                    String cypher = scan.nextLine();
                    cypher = cypher.toUpperCase();
                    String cypherToPlain = plainText(cypher);
                    System.out.println("Decrypted Text: " + cypherToPlain);
                    break;

            }
            System.out.println();
            System.out.print("Press 'y' to continue, and anything else to exit!: ");
            cont = scan.nextLine().charAt(0);

        } while (cont == 'y' || cont == 'Y');

    }

}
=======

// importing the required libraries.
import java.util.Scanner;

public class lab5 {

    // static array containing capital characters.
    static char characters[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    static char space = ' ';
    static Scanner scan = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    // function to encrypt a plain text.
    static String cipherText(String plainText) {
        String cipher = "";
        for (int i = 0; i < plainText.length(); i++) {
            char xxx = plainText.charAt(i);
            int j = 0;
            String x = String.valueOf(xxx);
            while (j < characters.length) {
                char zzz = characters[j];
                if (x.equals(String.valueOf(space))) {
                    cipher = cipher.concat(String.valueOf(space));
                    break;
                } else if (x.equals(String.valueOf(zzz))) {
                    if (j < 3) {
                        zzz = characters[j + 23];
                        cipher = cipher.concat(String.valueOf(zzz));
                    } else if (j >= 3 && j <= 25) {
                        zzz = characters[j - 3];
                        cipher = cipher.concat(String.valueOf(zzz));
                    }
                    break;
                } else {
                    j = j + 1;
                }
            }
        }
        return cipher;
    }

    // function to decrypt an encrypted text.
    static String plainText(String cypherText) {
        String plain = "";
        for (int i = 0; i < cypherText.length(); i++) {
            char xxx = cypherText.charAt(i);
            int j = 0;
            String x = String.valueOf(xxx);
            while (j < characters.length) {
                char zzz = characters[j];
                if (x.equals(String.valueOf(space))) {
                    plain = plain.concat(String.valueOf(space));
                    break;
                } else if (x.equals(String.valueOf(zzz))) {
                    if (j > 22) {
                        zzz = characters[j - 23];
                        plain = plain.concat(String.valueOf(zzz));
                    } else if (j <= 22) {
                        zzz = characters[j + 3];
                        plain = plain.concat(String.valueOf(zzz));
                    }
                    break;
                } else {
                    j = j + 1;
                }
            }
        }
        return plain;
    }

    public static void main(String[] args) {

        // menu- driven program.
        char cont;
        do {
            System.out.println();
            System.out.println("********** ENCRYPTION - DECRYPTION **********");
            System.out.println("--- SELECT FROM OPTION BELOW ---");
            System.out.println("1. Encryption of Plain Text (1).\n2. Decryption of Cypher Text (2).");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Text you want to Encrypt: ");
                    String plain = scan.nextLine();
                    plain = plain.toUpperCase();
                    String plainToCipher = cipherText(plain);
                    System.out.println("Encrypted Text: " + plainToCipher);
                    break;

                case 2:
                    System.out.print("Enter the Text you want to Decrypt: ");
                    String cypher = scan.nextLine();
                    cypher = cypher.toUpperCase();
                    String cypherToPlain = plainText(cypher);
                    System.out.println("Decrypted Text: " + cypherToPlain);
                    break;

            }
            System.out.println();
            System.out.print("Press 'y' to continue, and anything else to exit!: ");
            cont = scan.nextLine().charAt(0);

        } while (cont == 'y' || cont == 'Y');

    }

}
>>>>>>> 7ea548fccf8db486797a7775c13c916a0dc7061e
