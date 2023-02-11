package hw13;

import java.util.Objects;

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
    public String toString() {
        return "Имя " + this.name + " Год создания " + this.age+ "Автор"+ this.author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, author);
    }
}


