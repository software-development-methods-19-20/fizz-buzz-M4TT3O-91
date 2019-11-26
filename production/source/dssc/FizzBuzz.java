package dssc;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static List<Pippo> list;
    {
        list=new ArrayList<>();
        list.add(new Pippo(3,"Fizz"));
        list.add(new Pippo(5,"Buzz"));
        list.add(new Pippo(7,"Bang"));

    }
    private class Pippo{
        public int numero;
        public String string;

        public Pippo(int n , String s){
            this.numero=n;
            this.string=s;
        }
    }

    public static String test(Integer input) {
        String result="";
        for (Pippo item : list) {
            if (input % item.numero == 0)
                result += item.string;
        }
        if(result.length()==0)
            result+=String.valueOf(input);
        return result;
    }
}
