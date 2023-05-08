import java.io.*;
import java.util.Scanner;
// import java.math.RoundingMode;  
// import java.text.DecimalFormat; 

public class lab7{

    // private static final DecimalFormat decfor = new DecimalFormat("0.00");  


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
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }

    static double [] overallMean(String [][] data){
        double meanArray [] = new double[4];
        double sum [] = new double [4];
        double arrSum = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<150;j++){
                arrSum += Double.parseDouble(data[j+1][i+1]);
            }
            sum[i] = arrSum;
            arrSum = 0;
        }
        for(int l=0; l<4;l++){
            double num = (sum[l])/150;
            meanArray[l] = num;
        }
        return meanArray;
    }


    public static void main(String args []){

        String filepath = "C:\\Users\\Narpat\\22122031-MDS273L-JAVA\\Lab 7\\Iris.csv";
        String data[][] = IrisData(filepath);
        double mean[] = overallMean(data);
        for(int j=0; j<mean.length;j++){
            System.out.print("\t"+mean[j]);
        }

    }
}