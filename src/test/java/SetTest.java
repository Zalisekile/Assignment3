import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java .util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    private Set<Student> students;
    private Student stud1;
    private Student stud2;
    private Student stud3;

    @Before
    public void setUp() throws Exception {

        students = new HashSet<Student>();
        stud1 = new Student("James",212205587);
        stud2 = new Student("Jonathan",212205586);
        stud3 = new Student("Jabu",212205573);
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() throws Exception
    {
        //Testing if values have been successfully added
        assert(students.contains(stud2));

        //Testing if the length of the link list is actually 3
        assert(students.size() == 3);

        //Adding a duplicate Entry
        students.add(stud2);
        //Checking if the set has added the duplicate object
        assert(students.size() == 3);

    }

    @Test
    public void testRemoval() throws Exception
    {
        //Checking size of Array Before deletion
        assert(students.size() == 3);

        //Removing object
        //Unlike linked list you must specify name of Object
        students.remove(stud1);

        //Checking if set size has been reduced
        assert(students.size()== 2);

    }

    @Test
    public void testIteration() throws Exception
    {
        //creating a count variable
        int x = 0;

        //Creating an iterator
        Iterator<Student> iterator = students.iterator();

        Student dummy;

        while(iterator.hasNext())
        {

            dummy = iterator.next();
            System.out.println("Name:" + dummy.name +"\tStudent Number: " + dummy.studentNumber);
            assert(dummy.equals(students.toArray()[x]));
            x++;
        }

    }



}