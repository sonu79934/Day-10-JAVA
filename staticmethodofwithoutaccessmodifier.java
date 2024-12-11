import java.util.*;
class staticmethodofwithoutaccessmodifier{
     static String s()
    {
       return "Hello Students";
    }
    public static void main(String args[]){
       String res=s();
       System.out.println(res);
    }
}