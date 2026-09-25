public class Sum
{
    public static void main(String[] args)
    {
        int[][] array={{1,2,3},{4,5,6}};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                System.out.print(array[i][j]);
                sum=sum+array[i][j];
            }
            System.out.println();
        }
        System.out.println("SUM:"+sum);
    }
}