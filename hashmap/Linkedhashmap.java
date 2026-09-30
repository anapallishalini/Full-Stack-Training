//LinkedHashMap Example
import java.util.LinkedHashMap;
import java.util.Map;
public class Linkedhashmap
{
    public static void main(String[] args)
    {
        LinkedHashMap <Integer,String> students=new LinkedHashMap<>();
        students.put(103,"shalini");
        students.put(101,"siri");
        students.put(102,"Rajitha");
        students.put(104,"suhitha");
        students.put(105,"yogitha");
        System.out.println("Map:"+students);

        System.out.println("Student 102:"+students.get(102));
        System.out.println("Size:"+students.size());
        System.out.println("Contains key 103:"+students.containsKey(103));
        System.out.println("contains value Rajitha:"+students.containsValue("Rajitha"));

        students.put(102,"Ananya");
        System.out.println("After updating:"+students);

        students.remove(104);
        System.out.println("After removing 104:"+students);

        System.out.println("\n using KeySet():");
        for(Integer key:students.keySet())
        {
            System.out.println(key+"->"+students.get(key));
        }
        System.out.println("\n using entrySet()");
        for (Map.Entry<Integer,String> entry:students.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}

