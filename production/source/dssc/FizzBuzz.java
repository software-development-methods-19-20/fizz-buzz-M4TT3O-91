package dssc;

public class FizzBuzz {
    public static String test(String input) {
        String test = "";
        test += (Integer.parseInt(input) % 3) == 0 ? "fizz" : "";
        test += (Integer.parseInt(input) % 5) == 0 ? "buzz" : "";
        return test;
    }
}
