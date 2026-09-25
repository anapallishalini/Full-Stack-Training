import java.util.LinkedList;
public class Main
{
    public static void main(String[] args)
    {
        LinkedList<String> students=new LinkedList<>();
        students.add("shalini");
        students.add("suhitha");
        students.add("yogitha");
        System.out.println(students);

        students.addFirst("siri");
        students.addLast("Rajitha");
        System.out.println(students);

        students.add(2, "Varam");
        System.out.println(students);

        System.out.println("first:"+students.getFirst());
        System.out.println("last:"+students.getLast());

        students.removeFirst();
        students.removeLast();
        System.out.println(students);




    }
}