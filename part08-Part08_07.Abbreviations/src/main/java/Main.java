
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbs = new Abbreviations();

        abbs.addAbbreviation("e.g.", "for example");
        abbs.addAbbreviation("etc.", "and so on");
        abbs.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbs.hasAbbreviation(part)) {
                part = abbs.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println();
    }
}
