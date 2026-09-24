abstract class Animal
{
    abstract void sound();
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog is barking");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.sound();
    }
}