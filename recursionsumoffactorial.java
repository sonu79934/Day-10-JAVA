import java.util.*;
class recursionsumoffactorial{
    int sum(int n)
    {
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main(String args[]){
        recursionsumoffactorial ob=new recursionsumoffactorial();
        int res = ob.sum(10);
        System.out.println(res);
    }
}