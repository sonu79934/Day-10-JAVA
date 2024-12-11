import java.util.*;
class A{
    int c;
    String b;
    A()
    {
        this.c=345;
        this.b="Hello Amarnath";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
    public class defaultconstructor{
        public static void main(String[] args){
        A s=new A();
        s.display();
    }
}