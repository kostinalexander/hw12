package hw13;

public class Main {




    public static void main(String[] args){
        Author author = new Author("Фёдор", "Достоевский");
        Author author1 = new Author("Пушкин", "Александр");


        Book book = new Book("Война и мир", 1863, author);
        Book book1 = new Book("Евгений онегин", 1833, author1);
        System.out.println(author.getName()+" "+author.getLastName()+ " " + book.getName()+ " "+ book.getAge());
        System.out.println(author1.getName()+" "+author1.getLastName()+ " " + book1.getName()+ " "+ book1.getAge());
    }

    }



