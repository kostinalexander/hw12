package hw13;

import java.time.LocalDate;

public class Main {




    public static void main(String[] args){
        Author author = new Author("Фёдор", "Достоевский");
        Author author1 = new Author("Пушкин", "Александр");


        Book book = new Book("Война и мир", 1863, author);
        Book book1 = new Book("Евгений онегин", 1833, author1);
        System.out.println(author.getName()+" "+author.getLastName()+ " " + book.getName()+ " "+ book.getAge());
        System.out.println(author1.getName()+" "+author1.getLastName()+ " " + book1.getName()+ " "+ book1.getAge());
        System.out.println(author);
        System.out.println(book.equals(book1));
        System.out.println(author.equals(author1));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(author.hashCode());
        System.out.println(author1.hashCode());

    }



}



