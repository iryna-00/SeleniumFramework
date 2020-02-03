package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGListenersDemo2 {

    @Test
    public void test4(){
        System.out.println("This is test4");
    }

    @Test
    public void test5(){
        System.out.println("This is test5");
    }

    @Test
    public void test6(){
        System.out.println("This is test6");
        throw new SkipException("This test is skipped");
    }
}
