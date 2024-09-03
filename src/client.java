import java.util.ArrayList;

public class client {
    private String id;

    private String name;

    private String nationality;

    private String occupation;

    private String address;

    private int age;

    private String gender;

    private ArrayList<account> accounts = new ArrayList<>();   //put client's account into an arraylist

    private ArrayList<loan> loans = new ArrayList<>();  //put client's loans into an arraylist called loans, when a client get alone an loan object will add to this


    private int pin;

    // client constructor
    client(String id, String name, String nationality, String occupation, String address, int age, String gender, int pin ){
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.pin = pin;
    }

    public void setAccounts(ArrayList<account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<account> getAccounts() {
        return accounts;
    }

    public int getPin() {  // getter of pin
        return pin;
    }

    public void setLoans(loan loan){   //setter of loan(this will add the loan object into the loans arrraylist)
        this.loans.add(loan);
    }
    public void forloan (double amount, int duration, String paymethod){  //when a client get a loan check whether he have an account and issue a loan
        if(accounts.isEmpty()){
            System.out.println("Cannot efford a loan");
        }
        else{
            loans.add(new loan(amount, duration, paymethod ));
        }
    }
}
