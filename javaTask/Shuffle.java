import java.util.*;

class Shuffle {
    static int[] shuffleArr(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            int rand = (int)(Math.floor(Math.random()*n));
            int temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arry = {1, 2, 3, 4, 5, 6, 7};
        int[] result = shuffleArr(arry);
        
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}