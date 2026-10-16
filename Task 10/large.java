

public class large {
    public static void main(String[] args){
        int[] arr={10,30,20,45,54};

        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
