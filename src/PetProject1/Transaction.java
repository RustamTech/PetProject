package PetProject1;

public class Transaction {
    private static int counter = 1;
    private String transactionID;
    private String memberId;
    private int isbn;
    private String type;
    private String date;

    public Transaction(String memberId, int isbn, String type, String date) {
        this.transactionID = "T" + counter++;
        this.memberId = memberId;
        this.isbn = isbn;
        this.type = type;
        this.date = date;
    }

    public String printTransactionDetails() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", memberId='" + memberId + '\'' +
                ", isbn=" + isbn +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

