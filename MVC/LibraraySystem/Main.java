public class Main{
    public static void main(String[] args){

        //Create model
        Book model = new Book(
            "Harry Potter",
            "J.K. Rowling",
            1001
        );

        //create view
        LibraryView view = new LibraryView();

        //create controller
        LibraryController controller = new LibraryController(model, view);

        //Display original details 
        System.err.println("Original Book Deatails");
        System.out.println("---------------");

        controller.updateView();

        //update Book Details
        controller.setBookTitle("The Hobbit");
        controller.setBookAuthor("J.R.R. Tolkien");

        //Display Update Detail
        System.out.println("\nUpdate Book Details");
        System.out.println("-------------------");

        controller.updateView();
    }
}
