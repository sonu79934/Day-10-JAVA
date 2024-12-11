import java.util.*;
public class classmembers{
    void display(){
        System.out.println("Hello Students");
    }
    void dis1(){
        this.display();
    }
    public static void main(String[] args){
        classmembers o=new classmembers();
        o.dis1();
    }
}