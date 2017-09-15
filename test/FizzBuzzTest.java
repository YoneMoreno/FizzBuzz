import org.junit.Assert;
import org.junit.Test;

import static java.lang.String.*;

public class FizzBuzzTest {
    @Test
    public void given_2_expected_2(){
        Assert.assertEquals("2", new FizzBuzz().get(2));
    }

    @Test
    public void given_1_expected_1(){
        Assert.assertEquals("1", new FizzBuzz().get(1));
    }
    @Test
    public void given_3_expected_Fizz(){
        Assert.assertEquals("Fizz", new FizzBuzz().get(3));
    }
    @Test
    public void given_5_expected_Buzz(){
        Assert.assertEquals("Buzz", new FizzBuzz().get(5));
    }
    @Test
    public void given_6_expected_Fizz(){
        Assert.assertEquals("Fizz", new FizzBuzz().get(6));
    }
    @Test
    public void given_10_expected_Buzz(){
        Assert.assertEquals("Buzz", new FizzBuzz().get(10));
    }
    @Test
    public void given_15_expected_FizzBuzz(){
        Assert.assertEquals("FizzBuzz", new FizzBuzz().get(15));
    }
    @Test
    public void given_30_expected_FizzBuzz(){
        Assert.assertEquals("FizzBuzz", new FizzBuzz().get(30));
    }

    public static class FizzBuzz {

        public String  get(int number){
            return number % 15 == 0 ? "FizzBuzz" : number % 5 == 0 ? "Buzz" : number % 3 == 0 ? "Fizz" : valueOf(number);
        }
    }
}
