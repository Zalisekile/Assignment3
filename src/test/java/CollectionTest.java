import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;



import static org.junit.Assert.*;


public class CollectionTest {
    private Collection<Student> student ;
    private Student stud1,stud2,stud3;

    @Before
    public void setUp() throws Exception
    {
        student = new LinkedList<Student>();
        stud1 = new Student("Patrick",212205587);
        stud2 = new Student("Paul",212205586);
        stud3 = new Student("Pumla",212205573);



        student.add(stud1);
        student.add(stud2);
        student.add(stud3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() throws Exception
    {
        //Checking size if files were added
        assertTrue(student.contains(stud1));

        //Confirming length of treeSet to be 3
        assertTrue(student.size() == 3);

        //Adding the duplicate
        student.add(stud2);
        //Check if set has added the duplicate object
        assertTrue(student.size() == 4);



    }

}