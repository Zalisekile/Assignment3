import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;


public class LinkedListTest {
    private List<Student> students;
    private Student stud1,stud2,stud3;


    @org.junit.Before
    public void setUp() throws Exception
    {
        students = new LinkedList<Student>();
        stud1 = new Student("James",212205587);
        stud2 = new Student("Jonathan",212205586);
        stud3 = new Student("Jabu",212205573);
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);


    }

    @org.junit.After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testAdd() throws Exception
    {

        //Testing if values have been successfully added
        assert(students.contains(stud2));

        //Testing if the length of the link list is actually 3
        assert(students.size() == 3);


    }

    @Test
    public void testRemoval() throws Exception
    {
        //Confirm size is still 3 before removal
        assert(students.size() == 3);
        // Checking if value to be deleted exits
        assert(students.contains(stud1));

        //Removing the student at index 0
        students.remove(0);

        //Checking if size has been reduced by 1
        assert(students.size() == 2);
        //Checking if stud1 object was succesfully deleted
        assertFalse("This means the delete didn't work",students.contains(stud1));
    }

    @Test
    public void testIteration() throws Exception
    {
        int x = 0;
        ListIterator<Student> iterator = students.listIterator();

        Student dummy;

        while (iterator.hasNext())
        {
            dummy = iterator.next();
            System.out.println("Name:" + dummy.getName() +"\tStudent Number: " + dummy.getStudentNumber());
            assert(dummy.equals(students.get(x)));
            x++;
        }
    }

}