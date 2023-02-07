package hw13;

public class Main {




    public static void main(String[] args){
        Author author = new Author("Фёдор", "Достоевский");
        Author author1 = new Author("Пушкин", "Александр");





        Book book = new Book("Война и мир", 1863);
        Book book1 = new Book("Евгений онегин", 1833 );
        System.out.println(author.getName()+" "+ author.getLastName()+" Книга "+ book.getName() +"  "+ book.getAge());
        book.setAge(1900);
        System.out.println("book.getAge()=== Война и мир"+ book.getAge() );
        System.out.println(author1.getName()+ " "+ author1.getLastName()+ " Книга "+ book1.getName()+ " "+ book1.getAge());
    }

    }



