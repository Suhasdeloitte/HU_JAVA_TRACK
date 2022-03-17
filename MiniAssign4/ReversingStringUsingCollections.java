import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversingStringUsingCollections {
    public static void main(String[] args){
        List<String> animals = new ArrayList<>();
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Cheetah");
        animals.add("Snake");
        for (String wild:animals){
            System.out.println(wild);
        }

        Collections.reverse(animals);
        System.out.println(animals);

    }
}
