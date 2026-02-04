class complex{
    int real,img;
    void print(){
        System.out.println(real +" "+img);
    }
    complex(int r,int i){
        real=r;
        img=i;
    }
    void add(complex c){
        real=real+c.real;
        img=img+c.img;
    }
}
public class class1{
    public static void main(String[] args) {
        complex c1=new complex(10,20);
        c1.print();
        complex c2=new complex(30,40);
        c2.print();
        c1.add(c2);
        c1.print();
    }
}