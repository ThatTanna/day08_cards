import java.util.ArrayList;
import java.util.List;

public class Card {

    List<String> suit = new ArrayList<>();
    private int value;

    public Card (List<String> suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public List<String> getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    
}
