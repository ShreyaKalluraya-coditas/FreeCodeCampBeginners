package FreeCodeCampBeginners;
import java.util.ArrayList;

class User {
    public String name;
    int salary;
    ArrayList<Book> books= new ArrayList<Book>();
    void incrementSal(){
        salary+=2000;
    }
    void borrow(Book book){
        this.books.add(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", books=" + books +
                '}';
    }
}
class Book {
    String bName;
    String authorName;

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
public class DemoOOPS {
    public static void main(String[] args){
        User user =new User();
        user.name = "Shreya";
        System.out.println(user.name);
        user.salary=567842;
        System.out.println(user.salary);
        user.incrementSal();
        Book book=new Book();
        book.bName="DBMS";
        book.authorName="SKalluraya";
        user.borrow(book);
        System.out.println(user.salary);
        System.out.println(user);

    }
}
