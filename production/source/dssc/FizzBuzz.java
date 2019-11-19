package dssc;

public class FizzBuzz {

    public void FizzBuzzPrint(){
        for (int i = 0; i < 105 ; i++) {
            System.out.println(test(i));
        }
    }

    public static String test(Integer input) {
        String test = "";
        if (input == 0)
            return "";
        else {
            test += (input % 3) == 0 ? "Fizz" : "";
            test += (input % 5) == 0 ? "Buzz" : "";
            test += (input % 7) == 0 ? "Bang" : "";
        }
        return test;
    }
}
