import java.util.*;
public class pat1 {
    public static void main(String args[]){
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==1){
                for(j=1;j<=n;j++){
                    System.out.print(j+" ");
                }
            }
            else{
                for(j=n;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
