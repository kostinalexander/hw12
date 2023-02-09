package hw13;

public class Book {
    private String name;
    private int age;
    private Author author;


    public Book(String name, int age, Author author){
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

}


