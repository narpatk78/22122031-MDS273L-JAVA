import java.io.*;
import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.Arrays;

public class lab7{

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


    static float [] OverallMean(String [][] data){
        float meanArray [] = new float[4];
        float sum [] = new float [4];
        float arrSum = 0.0f;
        for(int i=0; i<4; i++){
            for(int j=0; j<150;j++){
                arrSum += Double.parseDouble(data[j+1][i+1]);
            }
            sum[i] = arrSum;
            arrSum = 0.0f;
        }
        for(int l=0; l<4;l++){
            float num = (sum[l])/150;
            meanArray[l] = num;
        }
        return meanArray;
    }

    static float [] OverallMedian(float [][] overallSorted){
        float median []= new float [4];
        for(int i=0;i<overallSorted.length;i++){
            if(overallSorted[i].length%2==1){
                int index = (overallSorted[i].length/2) + 1;
                median[i] = overallSorted[i][index];
            }
            else{
                int index = (overallSorted[i].length/2);
                median[i] = (overallSorted[i][index] + overallSorted[i][index+1])/2;
            }
        }
        return median;
    }


    static float [][] OverallSortedArr(String [][] data){
        float sorted [][] = new float [4][data.length-1];
        
        int s = 0;
        for(int i=1;i<=4;i++){
            float arr [] = new float [150];
            for(int j =1; j<=data.length-1;j++){
                arr[j-1] = Float.parseFloat(data[j][i]);
            }
            Arrays.sort(arr);
            sorted[i-1] = arr;
        }
        return sorted;
    }

    static String [][] OverallSummaryStructure(String [][] data){
        float mean[] = OverallMean(data);
        float sorted[][] = OverallSortedArr(data);
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
                    structure[i][j] = "Null";
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

        String filepath = "C:\\Users\\Narpat\\22122031-MDS273L-JAVA\\Lab 7\\Iris.csv";
        String data[][] = IrisData(filepath);
        float mean[] = OverallMean(data);
        float sorted[][] = OverallSortedArr(data);
        float median[] = OverallMedian(sorted);
        String structure [][] = OverallSummaryStructure(data);
        for(int i = 0; i<5;i++){
            for (int j=0; j<6;j++){
                System.out.print(structure[i][j] + " ");
            }
            System.out.println();
        }
    }
}