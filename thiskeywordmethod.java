import java.util.*;
public class thiskeywordmethod{
    String name;
    thiskeywordmethod(String name){
        this.name=name;
    }
    void dis1(){
        System.out.println(name);
    }
    void agt(){
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String[]args){
        thiskeywordmethod o=new thiskeywordmethod("Jashwitha");
        o.agt();
    }
}
    class teacher{
        public void teach(thiskeywordmethod s){
            s.dis1();
    }
}