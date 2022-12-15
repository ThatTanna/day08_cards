import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> suit = new ArrayList<>();

        suit.add("Spades");
        suit.add("Hearts");
        suit.add("Clubs");
        suit.add("Diamonds");

        List<Card> deck = new ArrayList<>();

        for (String s : suit) {
            for (int value = 1; value <= 13; value++) {
                deck.add(new Card(suit, value));
                System.out.println(value + " of " + s);
            }

        }
        
    }
}