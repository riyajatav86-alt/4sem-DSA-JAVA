

public class leaderarray {
    public static void main(String[] args) {
        int []arr={3,20,7,15,6,5,5,2};
        int n=arr.length;
        int [] arr1=new int[n];
        int j=0;
        int cmax=arr[n-1];
        arr1[j++]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>cmax){
                arr1[j++]=arr[i];
                arr1[j++]=arr[i];
                cmax=arr[i];

            }
        }
        for

    }
    
}
