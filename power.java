class power{
    static int pow(int b,int ex)
    {
        if(ex==0) return 1;
        return b*pow(b,ex-1);
    }
    public static void main(String args[])
    {
        int res=pow(2,2);
        System.out.println(res);
    }
}