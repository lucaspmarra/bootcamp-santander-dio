package br.com.dio;

import br.com.dio.model.Cat;

public class firstProgram {
    public static void main(String[] args) {
        Cat cat = new Cat("Uni", "tricolor", 1);
        System.out.println(cat);

        Book book = new Book("Mindhunter", 360);
        System.out.println(book);
    }
}

class Book {
    private String name;
    private Integer numPages;

    public Book(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", numPages=" + numPages + '}';
    }
}
