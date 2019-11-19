package test;

import dssc.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void ThreeIsFizz(){assertThat(FizzBuzz.test("3"), is("fizz")); }
    @Test
    void FiveIsBuzz(){assertThat(FizzBuzz.test("5"), is("buzz")); }

}