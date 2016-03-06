package ac.za.cput.TPProject1;

/**
 * Created by louisane Malu on 3/6/2016.
 */
import junit.framework.TestCase;
import junit.framework.TestResult;

public class StudentTest extends TestCase
{
    Students Stud1 = new Students(213015889,"Louise", "Malu", 25, 5700.2f);
    Students Stud2 = null;
    Students Stud3 = new Students(212010100,"Erin", "Bongvic", 30, 1240.2f);
    Students Stud4 = new Students(213015789,"Sarah", "Smith", 24, 2400.2f);
    Students Stud5 = new Students(213124778, "Eddy","Thomas", 30, 2500.2f);
    Students Stud6 = new Students();

    public void testStudNum()
    {
        assertEquals(213015889,Stud1.getStudNum());
        assertNotSame(213015789,Stud5.getStudNum());
    }
    public void testName()
    {
        assertEquals("Eddy",Stud5.getName());
        assertNotSame("Erin",Stud4.getName());
    }
    public void testSurname()
    {
        assertEquals("Thomas",Stud5.getSurname());
        assertNotSame("Smith",Stud5.getSurname());
    }
    public void testAge()
    {
        assertEquals(30, Stud5.getAge());
        assertNotSame(30, Stud4.getAge());
    }
    public  void TestFloat()
    {
        assertEquals(5700.2f, Stud1.getFees());
        assertNotSame(2500.2f,Stud3.getFees());
    }
    public void testNullness()
    {
        assertNull(Stud2);
        assertNotNull(Stud4);
    }
    public void testEquality()
    {
        Students test = Stud5;
        assertNotSame(Stud2, Stud5);
        assertEquals(Stud5, test);
    }
    public void testList()
    {
        Stud6.setStud(Stud3, Stud4,Stud5);

        assertEquals(true, Stud6.getStud().contains(Stud2));
        assertEquals(false, Stud6.getStud().contains(Stud6));
    }
}
