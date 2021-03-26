
public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU myIOU = new IOU();
        myIOU.setSum("Arthur", 51.5);
        myIOU.setSum("Michael", 30);
        
        System.out.println(myIOU.howMuchDoIOweTo("arthur"));
        System.out.println(myIOU.howMuchDoIOweTo("michael"));
    }
}
