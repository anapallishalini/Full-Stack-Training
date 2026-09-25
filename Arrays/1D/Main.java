public class Main
{
    public static void main(String[] args)
    {
        int[] array={1,2,3,4};
        //int[] array=new int[5];
        array[1]=6;
        array[2]=8;
        int sum=0;
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
            sum=sum+array[i];
            if(array[i]>max)
            {
                 max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("SUM:"+sum);
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}