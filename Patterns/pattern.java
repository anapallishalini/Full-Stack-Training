public class pattern
{
    public static void main(String[] args)
    {
        // outer loop is for No. of rows
        for(int i=1;i<=4;i++)
        {
            // inner loop is for No. of columns
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}