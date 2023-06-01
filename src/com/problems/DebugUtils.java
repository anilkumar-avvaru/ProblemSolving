package com.problems;
public class DebugUtils {

    private String getNCharString(int n, char ch){
        String spacedString;
        try{
            spacedString = new String(new char[n]).replace('\0', ch);
        }catch (Exception ex){
            spacedString = "";
        }
        return spacedString;
    }

    public void printTwoDimensionalArray(int[][] arr){
        prettyPrintTwoDimensionalArray(arr);
    }

    public void printTwoDimensionalArray(int[][] arr, String arrayName){
        prettyPrintTwoDimensionalArray(arr, arrayName);
    }

    private int prettyPrintTwoDimensionalArray(int[][] arr){
        return prettyPrintTwoDimensionalArray(arr, null);
    }
    private int prettyPrintTwoDimensionalArray(int[][] arr, String arrName){
        try{
            arrName = (arrName==null || arrName.trim().length()==0)?"--NoName--":arrName.trim();
            int x = arr.length;
            int y = arr[0].length;
            int[] maxVerticalLengths = new int[y];
            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    String tmp = Integer.toString(arr[i][j]);
                    maxVerticalLengths[j] = Math.max(maxVerticalLengths[j], tmp.length());
                }
            }

            int dashes = 0;
            for(int i=0; i<y; i++){
                dashes += maxVerticalLengths[i];
            }
            String lineSeparator = getNCharString(dashes+y-1, '-');
            System.out.println(lineSeparator);
            System.out.println("The contents for the Array "+arrName+" are : ");
            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    String left = Integer.toString(arr[i][j]);
                    String right = getNCharString(maxVerticalLengths[j]-left.length(), ' ');
                    String result = left+right;
                    System.out.print(result+" ");
                }
                System.out.println();
            }
            System.out.println(lineSeparator+"\n");
        }catch (Exception ex){
            return -1;
        }
        return 1;
    }
}