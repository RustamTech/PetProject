package PetProject1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.println("\n------ Library Menu ------");
            System.out.println("1. Add a new Book to Catalog");
            System.out.println("2. Add a new Member to Membership");
            System.out.println("3. Search for a Book in Library");
            System.out.println("4. Search for a Member in Membership");
            System.out.println("5. Borrow a Book");
            System.out.println("6. Return a Book");
            System.out.println("7. View all Books");
            System.out.println("8. View all Members");
            System.out.println("9. Exit");
            System.out.print("Select Option: ");
            int info = sc.nextInt();
            sc.nextLine();

            switch (info) {
                case 1:
                    System.out.print("Title of Book: ");
                    String title = sc.nextLine();
                    System.out.print("Author of Book: ");
                    String author = sc.nextLine();
                    System.out.print("ISBN of Book: ");
                    int isbn = sc.nextInt();
                    library.getCatalog().addBookToList(title, author, isbn);
                    break;

                case 2:
                    System.out.print("Name of Member: ");
                    String memberName = sc.nextLine();
                    System.out.print("Surname of Member: ");
                    String surName = sc.nextLine();
                    System.out.print("Age of Member: ");
                    int age = sc.nextInt();
                    System.out.print("Balance: ");
                    double balance = sc.nextDouble();
                    library.getMemberShip().addMemberToList(memberName, surName, age, balance);
                    break;

                case 3:
                    System.out.print("ISBN of Book to search: ");
                    isbn = sc.nextInt();
                    Book book = library.getCatalog().searchBook(isbn);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Member ID to search: ");
                    String searchMemberId = sc.nextLine();
                    Member member = library.getMemberShip().searchMember(searchMemberId);
                    if (member != null) {
                        System.out.println("Member found: " + member.getName());
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 5:
                    System.out.print("Member ID: ");
                    String borrowMemberId = sc.nextLine();
                    System.out.print("ISBN of Book: ");
                    int borrowIsbn = sc.nextInt();
                    sc.nextLine(); // Clear newline
                    System.out.print("Date: ");
                    String borrowDate = sc.nextLine();
                    library.borrowBook(borrowMemberId, borrowIsbn, borrowDate);
                    break;

                case 6:
                    System.out.print("Member ID: ");
                    String returnMemberId = sc.nextLine();
                    System.out.print("ISBN of Book: ");
                    int returnIsbn = sc.nextInt();
                    sc.nextLine(); // Clear newline
                    System.out.print("Date: ");
                    String returnDate = sc.nextLine();
                    library.returnBook(returnMemberId, returnIsbn, returnDate);
                    break;

                case 7:
                    System.out.println("List of Books:");
                    for (Book bookItem : library.getCatalog().getListOfBooks().values()) {
                        System.out.println(bookItem);
                    }
                    break;

                case 8:
                    System.out.println("List of Members:");
                    for (Member memberItem : library.getMemberShip().getListOfMembers()) {
                        System.out.println(memberItem.getName());
                    }
                    break;

                case 9:
                    check = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please select again.");
                    break;
            }
        }
        sc.close();
    }
}
