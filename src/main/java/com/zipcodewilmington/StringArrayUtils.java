package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        Boolean ans = false;
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                ans=true;
            }
        }
        return ans;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int len = array.length;
        String[] output = new String[len];
        for(int i = 0; i<len;i++){
         output[i] = array[len-1-i];
        }
        return output;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean ans = false;
        int len = array.length;
        String[] output= new String[len];
        for(int i =0;i<len;i++){
            output[i] = array[len-1-i];

            if(output[i] == array[i]){
                ans= true;
        }

        }
        return ans;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean ans = false;

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int len = alphabet.length;
        String  StringArray = "";
        char[] ansChecker = new char[len];
        for(String elements:array){
            StringArray+= elements;
        }
        char[] charArray = StringArray.toCharArray();
        for(int i =0; i<alphabet.length;i++){
            for(int j=0; j<array.length;j++){
                if(alphabet[i] == charArray[j]){
                    ansChecker[j] += alphabet[i];
                }
            }
        }
        System.out.println(ansChecker);
        if(ansChecker == alphabet){
            ans=true;
        }
        return ans;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(String elements : array){
            if(elements == value){
                counter ++;

            }        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int counter = array.length;
        for(String elements : array) {
            if (elements.equals(valueToRemove)) {
                counter--;
                System.out.println(counter);
            }
        }
        int counter2 =0;
            String[] ans = new String[counter];
            for(String elements:array){
                if( !elements.equals(valueToRemove) ){
                  ans[counter2]=elements;
                   counter2++;
                 }
                }

        return ans;
        }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return array;
    }


}
