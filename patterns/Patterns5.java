public class Patterns5 {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(i+(i-1));k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int l=5;l>0;l--){
            for(int m=5;m>l;m--){
                System.out.print(" ");
            }
            for(int n=0;n<(l+(l-1));n++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}