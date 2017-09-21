import static java.lang.String.valueOf;

public class FizzBuzz {

    public String  get(int number){
        return number % 15 == 0 ? "FizzBuzz" : number % 5 == 0 ? "Buzz" : number % 3 == 0 ? "Fizz" : valueOf(number);
    }
}
