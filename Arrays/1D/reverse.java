public class reverse
{
    public static void main(String[] args)
    {
        int[] array={1,2,3,4};
        System.out.println("Reversed array is:");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}