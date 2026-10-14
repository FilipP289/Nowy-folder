package number_guesser;

import java.util.Random;

public class Guesser {
    Random rand;
    
    public int guess(int lowerCap, int upperCap) {
        int answer;

        answer = rand.nextInt(lowerCap, upperCap);
        
        return answer;
    }

    Guesser() {
        this.rand = new Random();
    }
}
