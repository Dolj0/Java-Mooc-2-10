
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String nameInput = scanner.nextLine();
            
            if (nameInput.equals("")){
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageInput = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            Book newBook = new Book(nameInput, ageInput);
            books.add(newBook);
        }
        
        System.out.println("\n"+books.size()+" books in total.");
        System.out.println("\nBooks: ");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        //Collections.sort(books, (b1, b2)->b1.getAge() - b2.getAge());
        
        books.stream().forEach(b -> System.out.println(b.toString()));
        
    }

}
