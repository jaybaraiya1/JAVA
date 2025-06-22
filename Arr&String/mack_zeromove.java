public class mack_zeromove{
    public static void pushZerosToEnd(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==0){
                        if(arr[j]!=0){
                            arr[i]=arr[j];
                            arr[j]=0;
                        }
                    }
            }
        }
        for(int i=0;i<arr.length;i++){
       System.err.print(arr[i]);
       System.err.println(i);
        }
        
    }
    public static void main(String[] args){
            int[] arr={1,0,2,0,3,1,5};
        pushZerosToEnd(arr);
    }
}