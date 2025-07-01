package 과정4.biodome2;

import java.util.ArrayList;
import java.util.List;


class Book {
    public String isbn;
    public String title;
    public String author;
    public boolean isBorrowed;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void changeBorrowed(boolean borrowed){
        if(borrowed) {
            this.isBorrowed = true;
        }else{
            this.isBorrowed = false;
        }
    }


    public void printInfo(){
        System.out.println(title + " " + author);
    }
}


abstract class User {
    public String userId;
    public String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    abstract void borrowBook(Book book);

    abstract void returnBook(Book book);

    abstract void printInfo();
}


class Member extends User {
    public Member(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if(!book.isBorrowed) {
            book.changeBorrowed(true);
            System.out.printf("아용자 '%s'가 '%s' 대출합니다\n", name, book.title);
        }else{
            System.out.println(book.title + "은 대출중입니다.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if(book.isBorrowed) {
            book.changeBorrowed(false);
            System.out.printf("이용자 '%s'가 '%s' 반납합니다\n", name, book.title);
        }
    }

    @Override
    public void printInfo(){
        System.out.println("이용자 '"+name+"'");
    }
}


class Manager extends User {
    public Manager(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if(!book.isBorrowed) {
            book.changeBorrowed(true);
            System.out.printf("관리자 '%s'가 '%s' 대출합니다\n", name, book.title);
        }else{
            System.out.println(book.title + "은 대출중입니다.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if(book.isBorrowed) {
            book.changeBorrowed(false);
            System.out.printf("관리자 '%s'가 '%s' 반납합니다\n", name, book.title);
        }
    }

    @Override
    public void printInfo(){
        System.out.println("관리자 '"+name+"'");
    }


    public void addBook(Book book, Library library) {
        library.books.add(book);
        System.out.printf("관리자 '%s가' 책을 추가합니다. ", name);
        book.printInfo();
    }

    public void removeBook(Book book, Library library) {
        if(!book.isBorrowed){
            library.books.remove(book);
            System.out.printf("관리자 '%s가' 책을 삭제합니다. ", name);
            book.printInfo();
        }else{
            System.out.println("삭제가 불가능합니다.");
        }
    }
}


class Library {
    public List<Book> books = new ArrayList<>();
    public List<User> users = new ArrayList<>();


    public void addMember(Member member) {
        users.add(member);
        System.out.printf("새로운 이용자 '%s'를 등록합니다.\n", member.name);
    }

    public void addManager(Manager manager) {
        users.add(manager);
        System.out.printf("새로운 이용자 '%s'를 등록합니다.\n", manager.name);
    }

    public void printAllBooks(){
        for(Book book : books){
            book.printInfo();
        }
    }


    public void printAllUser(){
        for(User user : users){
            user.printInfo();
        }
    }

    public void searchBook(String author){
        System.out.println("저자 "+author+"의 책 목록:");
        for(Book book : books){
            if(book.author.equals(author)){
                System.out.print("* "+book.title+", ");
                if(book.isBorrowed){
                    System.out.println("대출 불가");
                }else{
                    System.out.println("대츨 가능");
                }

            }
        }
    }
}

public class RuleOfBiodome02{
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("0001", "자바의 구름", "제임스밥");
        Book book2 = new Book("0002", "파이썬 마스터", "한송희");
        Book book3 = new Book("0003", "에너지 플로우", "키네틱스");
        Book book4 = new Book("0004", "화성에서의 기억", "한송희");
        Book book5 = new Book("0005", "야채의 비밀", "송은정");


        Manager manager = new Manager("U001", "세이코");
        Member member1 = new Member("U002", "메리");
        Member member2 = new Member("U003", "만옥");

        library.addMember(member1);
        library.addMember(member2);
        library.addManager(manager);

        manager.addBook(book1, library);
        manager.addBook(book2, library);
        manager.addBook(book3, library);
        manager.addBook(book4, library);
        manager.addBook(book5, library);

        member1.borrowBook(book1);

        Book book6 = new Book("0006","자료구조의 언덕","황수");
        Book book7 = new Book("0007","그곳에 가면","한송희");
        manager.addBook(book6, library);
        manager.addBook(book7, library);

        member2.borrowBook(book1);

        member1.returnBook(book1);

        manager.borrowBook(book7);

        library.searchBook("한송희");

    }
}
