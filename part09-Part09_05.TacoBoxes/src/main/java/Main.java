
public class Main {

    public static void main(String[] args) {
        
        //Can also do TripleTacoBox tacoB = new TripleTacoBox() if you want.
        //I learned this method (TacoBox boxOfTacos i.e frist creating an interface obj) from TimBuchalka. Both work
        TacoBox boxOfTacos;

        boxOfTacos = new TripleTacoBox();
        System.out.println("Initial amount of tacos in box: " + boxOfTacos.tacosRemaining());
        boxOfTacos.eat();
        boxOfTacos.eat();
        boxOfTacos.eat();
        //testing to see what happens when I try to eat from an empty box
        boxOfTacos.eat();
        System.out.println("Initial amount of tacos in box: " + boxOfTacos.tacosRemaining());

        System.out.println("--endof TripleTacoBox program--");

        boxOfTacos = new CustomTacoBox(5);
        System.out.println("Initial amount of tacos in box: " + boxOfTacos.tacosRemaining());
        boxOfTacos.eat();
        boxOfTacos.eat();
        System.out.println("After eating two tacos...");
        System.out.println("Initial amount of tacos in box: " + boxOfTacos.tacosRemaining());

        System.out.println("--endof CustomTacoBox program--");
    }
}
