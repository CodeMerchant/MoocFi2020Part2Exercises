

/**
 *
 * @author musa
 */
public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private final String gradType;

    private Education(String gradType) {
        this.gradType = gradType;
    }

    public String getGradType() {
        return gradType;
    }

}
