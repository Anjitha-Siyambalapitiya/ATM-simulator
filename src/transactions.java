import java.util.ArrayList;
import java.util.Date;

public class transactions {
    private int id;

    private String bankAccId;

    private Date date;

    private String status;

    //creating an arraylist to store transactions which bank made
    private static ArrayList<transactions> transactions = new ArrayList<>();  //a static attribute, an arraylist of transaction objects

    //transaction should have a number for every transaction
    private static int transNo=0; // a static object which implement a transaction id number

    transactions(account account, String status ) {
        this.date = new Date();
        this.bankAccId = account.getNumber();
        this.status =status;
        this.id = transNo + 1;
        System.out.println(this.transNo + "- " + this.status + "from - "+ this.bankAccId+ " on "+ this.date);
        transactions.add(this);

     // as the transaction id, static transNo variable, and print status of the transaction with the date

    }
}
