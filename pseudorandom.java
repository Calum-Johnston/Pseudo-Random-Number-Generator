import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class pseudorandom{

    int height;
    int width;
    String seed;
    List<Integer> orderedSequence = new ArrayList<Integer>();
    List<Integer> randomSequence = new ArrayList<Integer>();

    public pseudorandom(int height, int width) {
        this(height, width, "default");
    }

    public pseudorandom(int height, int width, String seed){
        this.height = height;
        this.width = width;
        this.seed = seed;
    }

    public void generateRandomList(){
        for(int i = 0; i < width * height; i++){
            orderedSequence.add(i);
        }
        // https://stackoverflow.com/questions/6284589/setting-a-seed-to-shuffle-arraylist-in-java-deterministically
        // https://stackoverflow.com/questions/27346809/getting-a-range-off-user-input-for-random-generation
        Collections.shuffle(orderedSequence, new Random(seed.hashCode()));
    }

            
    public static void main(String[] args) {
        pseudorandom test = new pseudorandom();
        for(int i = 0; i < 100; i++){
            System.out.println(test.generateNewNumber() % 1000000);
        }
    }
}
