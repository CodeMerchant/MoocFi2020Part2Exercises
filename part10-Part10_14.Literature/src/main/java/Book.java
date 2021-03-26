

/**
 *
 * @author musa
 */
public class Book {

    private String nameOfBook;
    private int ageRecommendation;

    public Book(String nameOfBook, int ageRecommendation) {
        this.nameOfBook = nameOfBook;
        this.ageRecommendation = ageRecommendation;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public String toString() {
        return getNameOfBook() + "(recommended for " + getAgeRecommendation() + " year-olds or older)";
    }

}
