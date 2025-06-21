public class second_largestnumber {
    public static int function(int[] arry){
        int max=arry[0],second_largestnumbe=arry[0];
        for(int i=1;i<=(arry.length-1);i++){
            if(max<arry[i]){
                second_largestnumbe=max;
                max=arry[i];
            }
            else if(second_largestnumbe<arry[i] && max!=arry[i]){
                second_largestnumbe=arry[i];
            }
        }
        if(arry.length<2){
            return -1;
        }
        return second_largestnumbe;
    }
    public static void main(String[] args) {
        int arry[]={21,21,-111,1,-24,154,154,55,55};
        int a=function(arry);
        System.out.println( "second_largestnumbe : "+a);
    }
}
