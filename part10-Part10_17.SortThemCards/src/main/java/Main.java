
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // test your code here
        Hand hand = new Hand();
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));
       
        //hand.sort();
        //hand.print();
        
        Hand hand2 = new Hand();
        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));
        
        int comparison = hand.compareTo(hand2); //hand1's sum is 30. hand2's sum is 33. hand1 - hand2 will return -3 which means hand2 has a greater hand
        
        if(comparison < 0){
            System.out.println(comparison); //not necessary. Added it so you can see what's happening
            System.out.println("better hand is");
            hand2.print();
        } else if(comparison > 0){
            System.out.println(comparison);
            System.out.println("better hand is");
            hand.print();
        } else {
            System.out.println("hands are equal");
        }
        
        System.out.println("");
        //testing part 5
        List<Card> cards = new ArrayList<>();
        
        cards.add(new Card(3,Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14,Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2,Suit.SPADE));
        
        BySuitInValueOrder sortByVal = new BySuitInValueOrder();
        
        Collections.sort(cards, sortByVal);
        cards.stream()
                .forEach(card -> System.out.println(card));
        
        System.out.println("");
        //testing part 6
        Hand hand3 = new Hand();
        hand3.add(new Card(12, Suit.HEART));
        hand3.add(new Card(4, Suit.SPADE));
        hand3.add(new Card(2, Suit.DIAMOND));
        hand3.add(new Card(14, Suit.SPADE));
        hand3.add(new Card(7, Suit.HEART));
        hand3.add(new Card(2, Suit.SPADE));
        
        hand3.sortBySuit();
        hand3.print();
        
    }
}
