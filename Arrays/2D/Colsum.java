public class Colsum
{
    public static void main(String[] args)
    {
       int[][] array={{1,2,3},{4,5,6}};
        for(int i=0;i<array[0].length;i++)
        {
            int ColSum=0;
            for(int j=0;j<array.length;j++)
            {
                System.out.print(array[j][i]);
                ColSum=ColSum+array[j][i];
            }
            System.out.println();
            System.out.println("Col Sum:"+ColSum);
        }

    }
}