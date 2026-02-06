class A{
    int a;
    double b;
    String c;
    private A(){
        a=20;
        b=30.0;
        c="Shivang";
        System.out.println(a+" "+b+" "+c);
    } 
    public static void main(String shivang[]) {
        A s=new A();
        s.close();
    }
} 

// class  B{
//     public static void main(String[] args) {
//         A s=new A();
//     }
// }