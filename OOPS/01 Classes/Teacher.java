class Teacherdetails
{
    String name;
    String subjectname;
    String patienceLevel;
    Teacherdetails(String name,String subjectname,String patienceLevel)
    {
        this.name=name;
        this.subjectname=subjectname;
        this.patienceLevel=patienceLevel;
    }
    void givingAssignments()
    {
        if(patienceLevel=="high")
        {
            System.out.println("Giving less Assignments");
        }
    }
    void Teachingskills()
    {
        if(subjectname == "Java Full Stack")
        {
            System.out.println("Have a good Teachind skills");
        }
    }
}
public class Teacher
{
    public static void main(String[] args)
    {
        Teacherdetails t=new Teacherdetails("Hemanth sir","Java Full Stack","high" );
        t.givingAssignments();
        t.Teachingskills();
    }
}
