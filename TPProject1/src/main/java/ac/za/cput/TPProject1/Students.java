package ac.za.cput.TPProject1;
/**
 * Created by louisane Malu on 3/6/2016.
 */
import java.util.HashSet;
import java.util.Set;

public class Students
{
    int studNum;
    String name;
    String surname;
    float fees;
    int age;
    Set<Students>Obj = new HashSet<Students>();
    public Students(int sn, String nm, String snm,  int a, float f)
    {
        studNum = sn;
        name = nm;
        surname = snm;
        age = age;
        fees = f;
    }
    public Students()
    {}
    public void setStudNum(int sn)
    {
        studNum = sn;
    }
    public int getStudNum()
    {
        return studNum;
    }
    public void setName(String nm)
    {
        name = nm;
    }
    public String getName()
    {
        return name;
    }
    public void setSurname(String snm)
    {
        surname = snm;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setAge( int a)
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }
    public void setFees( int f)
    {
        fees = f;
    }
    public float getFees()
    {
        return fees;
    }
    public void setStud(Students st, Students st2, Students st3)
    {
        Obj.add(st);
        Obj.add(st2);
        Obj.add(st3);
    }
    public Set<Students> getStud()
    {
        return Obj;
    }
}
