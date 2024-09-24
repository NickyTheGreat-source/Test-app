import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    //write unit test to check reverseString method ( that we created in src/java/reverseString)

    @Test
    public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null)); //if we want to use method from the
        //other class we need to make method in other class static (className.method)
        System.out.println("reversedTestWithNull passes");
    }

    @Test
    public void reverseTestWithDigits(){
        Assert.assertEquals("cbA321", ReverseString.reverseString("123Abc"));
        System.out.println("reversedTeastWithDigits passes");
    }

    @Test
    public void reverseTestHappyPath(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
        System.out.println("reversedTestHappy passes");
    }
}
