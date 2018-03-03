import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.*;

public class MapTest {

    private Map<String,Student> student;
    private Student stud1,stud2,stud3,st;

    @Before
    public void setUp() throws Exception
    {
        student = new HashMap<String,Student>();
        stud1 = new Student("James",212205587);
        stud2 = new Student("Jonathan",212205586);
        stud3 = new Student("Jabu",212205573);
        student.put(stud1.getName(),stud1);
        student.put(stud2.getName(),stud2);
        student.put(stud3.getName(),stud3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPut() throws Exception
    {
        //I want to find Jabu
        assert(student.containsKey("Jabu"));

        //I want to find out if all three students are present
        assert(student.size() == 3);
    }

    @Test
    public void testRemoval() throws Exception
    {
        //Check The  Number of Students is 3 before I delete
        assert(student.size() == 3);
        //Check if James is in the house before I delete him
        assert(student.containsKey("James"));

        //Delete James
        student.remove("James");

        //Checking if number of students has actually shrank
        assert(student.size() == 2);
        // Checking if James is still in the house
        assertFalse("James is still in the house it seems",student.containsKey("James"));
    }

    @Test
    public void testIteration() throws Exception
    {
        //Getting a set of key values
       Set stud = student.entrySet();
       //Creating an iterator for students
      Iterator iterator = stud.iterator();
        //Creating dummy object to store iteration values
        Map.Entry dummy;

      //Looping while the Iterator still has a value
      while(iterator.hasNext())
      {
          //Storing retrieved object into dummy Object
          dummy =(Map.Entry)iterator.next();
          st = (Student) dummy.getValue();
          System.out.println("Name: " + st.getName()+ "\tStudent Number: " + st.getStudentNumber());
          //Checking if dummy object is the same as the matching one in the student Map
          assert(st.equals(student.get(dummy.getKey())));
      }

    }


}