class StudentDetails
{
    String name;
    int age;
    int energy;//1-10
    String mood;
    float attendance;

    // Constructor
    StudentDetails(String name, int age, int energy, String mood, float attendance)
    {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;
        this.attendance = attendance;
    }

    void skipClass()
    {
        if (energy < 2)
        {
            System.out.println("Skip the class");
        }
    }

    void study()
    {
        if (mood.equals("ambitious"))
        {
            System.out.println("I am going to achieve that ambition");
        }
    }

    void takeTest()
    {
        if (attendance > 85.0)
        {
            System.out.println("Take the test");
        }
    }

    void sleep()
    {
        if(energy<2 && mood=="sleepy")
        {
            System.out.println("Student is sleeping");
        }
    }
}

public class Student
{
    public static void main(String[] args)
    {
        StudentDetails s = new StudentDetails("Shalini", 20, 3, "ambitious", 89.0f);
        s.skipClass();
        s.study();
        s.takeTest();
        s.sleep();
    }
}