
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * Part 2: Hand. Use arraylist to store the cards
 * 
 * 
 */
/**
 *
 * @author musa
 */
public class Hand implements Comparable<Hand> {

    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> cardIterate = cards.iterator();

        while (cardIterate.hasNext()) {
            System.out.println(cardIterate.next());
        }
    }

    //Part 3: Sorting the hand
    public void sort() {
        //Collections.sort(cards, (card1,card2) -> card1.getValue() - card2.getValue());

        Collections.sort(cards);

    }

    //Part6: Sorting hand by suit
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    //Part 4: Comparing hands
    @Override
    public int compareTo(Hand obj) {
        int sumOfFirstHand = cards.stream()
                .map(cardValue -> cardValue.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value);

        int sumOfComparedHand = obj.cards.stream() //cracked my skull trying to get obj.stream() to work. Found the fix thanks to @KiwiCode-s on GitHub
                .map(cardValue -> cardValue.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value);

        int sumOfHands = sumOfFirstHand - sumOfComparedHand;
        return sumOfHands;
    }

}
