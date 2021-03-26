
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> listOfRows = new ArrayList<>();

        for (int[] square1 : this.square) {
            int sum = 0;
            for (int j : square1) {
                sum += j;
            }
            listOfRows.add(sum);
        }

        return listOfRows;
    }

    public ArrayList<Integer> sumsOfColumns() {

        ArrayList<Integer> listOfColumns = new ArrayList<>();

        for (int i = 0; i < this.square.length; i++) {
            int sum = 0;

            for (int j = 0; j < this.square[i].length; j++) {
                sum += this.square[j][i];
            }

            listOfColumns.add(sum);

        }
        return listOfColumns;
    }

    //thanks to @KiwiCode-s on GitHub -NB! please ensure you understand the code
    // whenever you do a Ctrl C, Ctrl V
    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> listOfDiagonals = new ArrayList<>();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < this.square.length; i++) {

            for (int j = 0; j < this.square.length; j++) {
                if (i == j) {
                    leftSum += this.square[i][j];
                }
                if (i + j == this.square.length - 1) {
                    rightSum += square[i][j];
                }
            }

        }

        listOfDiagonals.add(leftSum);
        listOfDiagonals.add(rightSum);

        return listOfDiagonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
