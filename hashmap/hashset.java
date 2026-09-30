import java.util.HashSet;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet <Integer> numbers=new HashSet<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(20);
        numbers.add(60);
        System.out.println("set:"+numbers);
        System.out.println("Size:"+numbers.size());
        System.out.println("Contains 20:"+numbers.contains(20));
        System.out.println("Contains 40:"+numbers.contains(40));
        numbers.remove(10);
        System.out.println("After Removing 10:"+numbers);
        numbers.add(40);
        System.out.println("after adding 40:"+numbers);
        System.out.println("\nIteration:");
        for(Integer number:numbers)
        {
            System.out.println(number);
        }
        
        System.out.println("\n Is Empty:"+numbers.isEmpty());
        numbers.clear();
    }
}