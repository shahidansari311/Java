import java.util.*;

public class ab {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        System.out.println(diff(s1,s2));
        sc.close();
    }
    public static Character diff(String s1,String s2){
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int n=s2.length();
        for(int i=0;i<n-1;i++){
            if(a1[i]!=a2[i]){
                return a2[i];
            }
        }
        return a2[n-1];
    }
}
