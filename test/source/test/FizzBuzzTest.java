package test;

import dssc.FizzBuzz;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test    void EmptyString(){check(0,""); }
    @Test    void ThreeIsFizz(){check(3,"Fizz"); }
    @Test    void FiveIsBuzz(){check(5,"Buzz"); }
    @Test    void Multiple3and5(){check(15,"FizzBuzz");}
    @Test    void SevenIsBang(){check(7,"Bang"); }
    @Test    void Multiple3and7(){check(21,"FizzBang");}
    @Test    void Multiple5and7(){ check(35,"BuzzBang");}
    @Test    void Multiple3and5and7(){check(105,"FizzBuzzBang");}

    private void check(int i, String s) {
        FizzBuzz FizzBuzzBang = new FizzBuzz();
        assertEquals(s, FizzBuzzBang.test(i));
    }

}