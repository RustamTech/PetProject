package PetProject1;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private final List<Transaction> transactions = new ArrayList<>();
    private final Member.MemberShip memberShip = new Member().new MemberShip();
    private final Book.Catalog catalog = new Book("").new Catalog();

    public void borrowBook(String memberId, int isbn, String date) {
        Member member = memberShip.searchMember(memberId);
        Book book = catalog.searchBook(isbn);
        if (member != null && book != null && !book.isTaken()) {
            member.borrowBook(book);
            Transaction transaction = new Transaction(memberId, isbn, "borrow", date);
            transactions.add(transaction);
            System.out.println("Book successfully borrowed: " + transaction.printTransactionDetails());
        } else {
            System.out.println("Cannot borrow book. It might already be borrowed or member/book not found.");
        }
    }

    public void returnBook(String memberId, int isbn, String date) {
        Member member = memberShip.searchMember(memberId);
        Book book = catalog.searchBook(isbn);
        if (member != null && book != null && book.isTaken()) {
            member.returnBook(book);
            Transaction transaction = new Transaction(memberId, isbn, "return", date);
            transactions.add(transaction);
            System.out.println("Book successfully returned: " + transaction.printTransactionDetails());
        } else {
            System.out.println("Cannot return book. It might not be borrowed or member/book not found.");
        }
    }

    public Book.Catalog getCatalog() {
        return catalog;
    }

    public Member.MemberShip getMemberShip() {
        return memberShip;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
