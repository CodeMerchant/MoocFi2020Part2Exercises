
public class Main {

    public static void main(String[] args) {
      /*  Book book1 = new Book("JK Rowling", "Harry Potter - The Philosophers Stone", 3);
        Book book2  = new Book("John Maxwell", "The 4 Pillars of Leadership", 5);
        
        CD cd1 = new CD("Frank Ocean", "Nostalgia, Ultra", 2011);
        CD cd2 = new CD("Lorde", "Pure Heroine", 2013);
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(cd1);
        System.out.println(cd2);
        */
        Box box = new Box(10);
        
        box.add(new Book("JK Rowling", "Harry Potter - The Philosophers Stone", 2));
        box.add(new Book("John Maxwell", "The 4 Pillars of Leadership", 1));
        box.add(new Book("Kent Beck", "Test Driven Dev", 0.7));
        
        box.add(new CD("Frank Ocean", "Nostalgia, Ultra", 2011));
        box.add(new CD("Lorde", "Pure Heroine", 2013));
        box.add(new CD("Kanye West", "Late Registration", 2006)); 
        
        System.out.println(box);
    }

}
