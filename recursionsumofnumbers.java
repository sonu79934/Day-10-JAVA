import java.util.*;
class recursionsumofnumbers{
    int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        recursionsumofnumbers ob=new recursionsumofnumbers();
        int res = ob.sum(10);
        System.out.println(res);
    }
}