package Lab_Tow;

import java.util.Arrays;

public class Q_Tow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        
        System.out.println(Arrays.toString(arr2));
    }
}
