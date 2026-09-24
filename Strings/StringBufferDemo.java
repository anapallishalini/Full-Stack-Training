public class StringBufferDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Java");
        System.out.println("original:"+sb);

        sb.append("programming");
        System.out.println("After append:"+sb);

        sb.insert(5," is ");
        System.out.println("After Insert:"+sb);

        sb.replace(0,4,"python");
        System.out.println("After replace:"+sb);

        sb.delete(0,7);
        System.out.println("After Delete:"+sb);
    }
}