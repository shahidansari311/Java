public class index3 {
    public static void main(String args[]) {
        int abc = Integer.parseInt(args[0]);
        if(abc==1){
            System.out.printf("%d is not a prime number.",abc);
            return;
        }
        for(int i=2;i*i<=abc;i++){
            if(abc%i==0){
                System.out.printf("%d is not a prime number.",abc);
                return;
            }
        }
        System.out.printf("%d is prime number",abc);
    }
}
