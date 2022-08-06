public class Student
{
    private String firstName;
    private String lastName;
    private int idNum;

    public Student(String firstName, String lastName, int idNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
    }

    public int getIdNum()
    {
        return idNum;
    }

    public String getName()
    {
        return firstName+lastName;
    }

    public static void main(String[] args)
    {
        Student student = new Student("Anusuya","Kumaravel",1915003);
        System.out.println("Identification Number is : " + student.getIdNum());
        System.out.println("Student Name is : " + student.getName());
    }
}
