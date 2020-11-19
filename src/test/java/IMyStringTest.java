import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IMyStringTest {

    private MyString myString;
    private Object anObject;
    private Boolean result;

    @Test
    public void testSameObject() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = myString;
        // Execute
        this.result = myString.equals(myString);
        // Verify
        assertTrue("Same Object should return true", result);
        // TearDown is implicit by system
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testDifferentType(){
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new String("a");
        // Execute
        this.result = myString.equals(anObject);
        // Verify
        assertFalse("Object that is not an instance of MyString should return false", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeSameString(){
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new MyString("a");
        // Execute
        this.result = myString.equals(anObject);
        // Verify
        assertTrue("Object is of type MyString and same value as variable myString -> should return true", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeDifferentString(){
        // Set Up
        this.myString = new MyString("abc");
        this.anObject = new MyString("aba");
        // Execute
        this.result = myString.equals(anObject);
        // Verify
        assertFalse("Object is of type MyString and has different value as myString -> should return false", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeDifferentLength(){
        // Set Up
        this.myString = new MyString("ab");
        this.anObject = new MyString("aba");
        // Execute
        result = myString.equals(anObject);
        // Verify
        assertFalse("Object is of type MyString, has different length as value of myString -> should return false", result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }



}
