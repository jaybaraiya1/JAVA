public class Patterns8{
    public static void main(String[] args){
       for(int i=0;i<=10;i++){
       for(int j=10;j>=i;j--){
        System.out.print(" ");
       }   
       for(int k=0;k<=(i);k++){
        if(i%2==0){
             if(k==0 || k==i){
             System.out.print("* ");
         }
         else{
             System.out.print(" ");
            }
        // System.out.print(" *");
        }
        else{
            System.out.print(" ");
        }
       }
       System.out.print("\n");
    }
    }
    }
    