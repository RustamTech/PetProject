package PetProject1;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String surName;
    private int age;
    private double balance;
    private List<Book> borrowedBooks;

    public Member() {
        this.borrowedBooks = new ArrayList<>();
    }

    public Member(String name, String surName, int age, double balance) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.balance = balance;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (!book.isTaken()) {
            borrowedBooks.add(book);
            book.setTaken(true);
            System.out.println("Successfully borrowed: " + book.getName());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setTaken(false);
        System.out.println("Successfully returned: " + book.getName());
    }

    public String getName() {
        return name;
    }

    public class MemberShip {
        private List<Member> listOfMembers = new ArrayList<>();

        public void addMemberToList(String name, String surName, int age, double balance) {
            Member member = new Member(name, surName, age, balance);
            listOfMembers.add(member);
            System.out.println("New member added: " + member.getName());
        }

        public Member searchMember(String name) {
            for (Member member : listOfMembers) {
                if (member.getName().equals(name)) {
                    return member;
                }
            }
            return null;
        }

        public List<Member> getListOfMembers() {
            return listOfMembers;
        }
    }
}

