package OtherPractice;

import java.util.ArrayList;

public class duplicationCheck{

    private static int[] sortedArray   = {1,2,3,4,4,5,6,7,8,9};
    private static int[] unSortedArray = {1,2,3,3,2,1};

    // This method works on unsorted arrays too
    private static void doubleLoop(){
        for ( int i = 0; i < unSortedArray.length; i++ ){
            for ( int j = i+1; j<unSortedArray.length; j++ ){
                if ( unSortedArray[i] == unSortedArray[j] ){
                    System.out.println("Number:"+unSortedArray[i]+" was a match");
                }
            }
        }
    }

    // This method uses the functionality of the ArrayList
    private static void singleLoop(){
       ArrayList<Integer> tmpList = new ArrayList<>();

        for(int num : unSortedArray){
            if( tmpList.contains(num)){
                System.out.println("Number:"+num+" was a match");
            }
            else{
                tmpList.add(num);
            }
        }
    }

    public static void main (String args[]) {

        System.out.println("Single Loop with Array List");
        singleLoop();
        System.out.println("\nDouble Loop with single array");
        doubleLoop();
    }
}