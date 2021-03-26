
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    //Part 5
    @Override
    public int compare(Card card1, Card card2) {

        int order = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        if (order == 0) {
            //call the compareTo method from card class. 
            return card1.compareTo(card2);
        }

        return order;

    }

}
