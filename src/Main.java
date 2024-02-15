import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomFunction customFunction = new CustomFunction();
        List<List<Integer>> pairs = findSolution(customFunction, 10);
        System.out.println("Pairs for z=10: " + pairs);

    }
    public static List<List<Integer>> findSolution(CustomFunction customfunction, int z)
    {
        int x = 1;
        int y = 1000;

        List<List<Integer>> pairs = new ArrayList<List<Integer>>();

        while(x <= 1000 && y >= 1)
    {
            int value = CustomFunction.f(x,y);
            if( value == z)
            {
                List<Integer> pair =  new ArrayList<>();
                pair.add(x);
                pair.add(y);
                pairs.add(pair);
                
                x++;
                y++;
            }
            else if (value < z)
            {
                x++;
            }
            else
            {
                y--;
            }

    }
        return pairs;
    }


}
