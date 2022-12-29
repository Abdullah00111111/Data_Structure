package Lab_Tow;

import java.util.Arrays;
import java.util.Random;

public class Q_Three {
    
    static String[] remove(String [] arr){
        
        Random r = new Random();
        while(arr.length > 0){
            String []a = new String[arr.length -1];
            int index = r.nextInt(arr.length);
            for(int i = 0; i < index; i++){
                a[i] = arr[i];
            }
            for(int i = index; i < arr.length - 1; i++){
                a[i] = arr[i + 1];
            }
            arr = a;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        String[] array = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        array = remove(array);
        System.out.println(Arrays.toString(array));
    }    
}

