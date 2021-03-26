
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        

        // Implement the random number generation here
        Random lottoNumber = new Random();
        
       /* for (int i = 0; i < 7; i++) {
            int drawnNumber = lottoNumber.nextInt(40) + 1;
          
            if(!containsNumber(drawnNumber)){
               this.numbers.add(drawnNumber);
           }
        } */
        
        while(numbers.size() < 7){
            int drawnNumber = lottoNumber.nextInt(40) + 1;
          
            if(!containsNumber(drawnNumber)){ //making sure there are no duplicates added to the list
               this.numbers.add(drawnNumber);
           }
        }
       
         
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers

        return this.numbers.contains(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LotteryRow other = (LotteryRow) obj;
        return Objects.equals(this.numbers, other.numbers);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.numbers);
        return hash;
    }
}
