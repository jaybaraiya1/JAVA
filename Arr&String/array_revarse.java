class array_revarse{
    public static void reverseArray(int arr[]) {
        // code here
        for(int i=0;i<(arr.length/2);i++){
            int v=arr[i];
            arr[i]=arr[(arr.length-i-1)];
            arr[(arr.length-i-1)]=v;    
        }
       
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,121,84,531};
        reverseArray(arr);
        for(int i=0;i<6;i++){
            System.err.println(arr[i]);
        }
        
    }
}