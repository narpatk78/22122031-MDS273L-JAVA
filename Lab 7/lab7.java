// importing reqired libraries.
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class lab7{

    // loading the dataset into a two dimensional array
    static String [][] IrisData(String filepath){
        String data [][] = new String [151][6];
        try{
            File file = new File(filepath);
            Scanner fileN = new Scanner(file);
            int c = 0;
            while(fileN.hasNextLine()){
                String temp = fileN.nextLine();
                String [] arrq = temp.split(",");
                data[c] = arrq;
                c++;
            }
            fileN.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }

    // calculating the mean
    static float [] OverallMean(String [][] data, int s, int e){ 
        float meanArray [] = new float[4];
        float sum [] = new float [4];
        float arrSum = 0.0f;
        for(int i=0; i<4; i++){
            for(int j=s; j<e;j++){  
                arrSum += Float.parseFloat(data[j+1][i+1]);
            }
            sum[i] = arrSum;
            arrSum = 0.0f;
        }
        for(int l=0; l<4;l++){
            float num = (sum[l])/(e-s+1); 
            meanArray[l] = num;
        }
        return meanArray;
    }

    // getting the attributes array
    static float [][] attributeArr(String [][] data, int s, int e){ 
        float attArr [][] = new float [4][e-s+1];
        for(int i=1;i<=4;i++){

            if(s==1&&e==150){
                float arr [] = new float [e-s+1];
                for(int j =s; j<=e;j++){ 
                    arr[j-1] = Float.parseFloat(data[j][i]);
                }
                attArr[i-1] = arr;
            }
            else if(s==1&&e==50){
                float arr [] = new float [e-s+1];
                for(int j =s; j<=e;j++){
                    arr[j-1] = Float.parseFloat(data[j][i]);
                }
                attArr[i-1] = arr;
            }
            else if(s==51&&e==100){
                float arr [] = new float [e-s+1];
                for(int j =s; j<=e;j++){ 
                    arr[j-51] = Float.parseFloat(data[j][i]);
                }
                attArr[i-1] = arr;
            }
            else if(s==101&&e==150){
                float arr [] = new float [e-s+1];
                for(int j =s; j<=e;j++){ 
                    arr[j-101] = Float.parseFloat(data[j][i]);
                }
                attArr[i-1] = arr;
            }
        }
        return attArr;
    }

    // sorting the attributes arrays
    static float [][] OverallSorted(String [][] data, int s, int e){
        float sorted [][] = attributeArr(data,s,e);
        for(int i=0; i<4;i++){
            Arrays.sort(sorted[i]);
        }
        return sorted;
    }

    // getting the median of the sorted attributes
    static float [] OverallMedian(float [][] sorted){
        float median []= new float [4];
        for(int i=0;i<sorted.length;i++){
            if(sorted[i].length%2==1){
                int index = (sorted[i].length/2) + 1;
                median[i] = sorted[i][index];
            }
            else{
                int index = (sorted[i].length/2);
                median[i] = (sorted[i][index] + sorted[i][index+1])/2;
            }
        }
        return median;
    }

    // getting the mode of the attributes arrays
    static float [] overallMode(float [][] attarray) {
        float [] rowModes = new float [attarray.length];
        for (int i = 0; i < attarray.length; i++) {
            float [] row = attarray[i];
            float mode = -1.0f;
            int maxCount = 0;
            for (int j = 0; j < row.length; j++) {
                int currentCount = 0;
                for (int k = 0; k < row.length; k++) {
                    if (row[k] == row[j]) {
                        currentCount++;
                    }
                }
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = row[j];
                }
            }
            rowModes[i] = mode;
        }
        return rowModes;
    }

    // getting the overall structure
    static String [][] OverallSummaryStructure(String [][] data, int s, int e){
        float mean[] = OverallMean(data,s,e);
        float attarray[][] = attributeArr(data,s,e);
        float mode[] = overallMode(attarray);
        float sorted[][] = OverallSorted(data,s,e); 
        float median[] = OverallMedian(sorted);
        String structure [][] = new String[5][6];
        structure[0][0]= "Attribute";
        structure[0][1]= "Mean";
        structure[0][2]= "Median";
        structure[0][3]= "Mode";
        structure[0][4]= "Min";
        structure[0][5]= "Max";
        for(int i=1; i<=4; i++){
            for (int j=0;j<=5;j++){
                switch(j){
                    case 0:
                    structure[i][j] = data[0][i];
                    break;
                    case 1:
                    structure[i][j] = Float.toString(mean[i-1]);
                    break;
                    case 2:
                    structure[i][j] = Float.toString(median[i-1]);
                    break;
                    case 3:
                    structure[i][j] = Float.toString(mode[i-1]);
                    break;
                    case 4:
                    structure[i][j] = Float.toString(sorted[i-1][0]);
                    break;
                    case 5:
                    structure[i][j] = Float.toString(sorted[i-1][sorted[0].length-1]);
                    break;
                }
            }   
        }
        return structure;
    }

    public static void main(String args []){

        Scanner sc = new Scanner(System.in); // scanner object 

        // file path for the iris dataset
        String filepath = "C:\\Users\\Narpat\\22122031-MDS273L-JAVA\\Lab 7\\Iris.csv";
        // getting the 2D array for the dataset
        String data[][] = IrisData(filepath);
        // menu driven program
        boolean con;
        do{
            con = true;
            System.out.println("\nSelect from the Following:");
            System.out.println("1. Overall Summary of the Iris Dataset (1).");
            System.out.println("2. Summary of Individual Species (2)");
            System.out.println("3. Exit (3)\n");
            System.out.print("Your Choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();

            if(choice == 1){
                // overall summary
                System.out.println("Iris Dataset Summary\n");
                String structure [][] = OverallSummaryStructure(data,1,150);
                for(int i = 0; i<5;i++){
                    for (int j=0; j<6;j++){
                        System.out.print(structure[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            else if(choice ==2){
                boolean con2;
                do{
                    con2 = true;
                    System.out.println("Select the Species whose Summary is to be Displayed.");
                    System.out.println("1. Iris Setosa\n2. Iris Versicolor\n3. Iris Virginica\n4. Exit\n");
                    System.out.print("Your Choice: ");
                    int ch = Integer.parseInt(sc.nextLine());
                    System.out.println();

                    switch(ch){
                        case 1: // setosa summary
                            System.out.println("Iris Setosa Summary\n");
                            String structure1 [][] = OverallSummaryStructure(data,1,50);
                            for(int i = 0; i<5;i++){
                                for (int j=0; j<6;j++){
                                    System.out.print(structure1[i][j] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                            break;
                        case 2: // versicolor summary
                            System.out.println("Iris Versicolor Summary\n");
                            String structure2 [][] = OverallSummaryStructure(data,51,100);
                            for(int i = 0; i<5;i++){
                                for (int j=0; j<6;j++){
                                    System.out.print(structure2[i][j] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                            break;
                        case 3: // virginica summary
                            System.out.println("Iris Virginica Summary\n");
                            String structure3 [][] = OverallSummaryStructure(data,101,150);
                            for(int i = 0; i<5;i++){
                                for (int j=0; j<6;j++){
                                    System.out.print(structure3[i][j] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                            break;
                        case 4:
                            con2 = false;
                            break;    
                        default:
                            System.out.println("Invalid Species. Try Again.");
                            System.out.println();
                    }
                }
                while(con2);
            }
            else if(choice==3){
                con = false;
                break;
            }
            else{
                System.out.println("Invalid Choice. Try Again.");
                System.out.println();
            }

        }
        while(con);
        sc.close();
    }
}