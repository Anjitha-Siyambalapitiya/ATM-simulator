import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ArrayList<client> clients = new ArrayList<>();  //create an arraylist including client objects to it, so it can access any client object through the arraylist called clients
        // create client objects
        client client1 = new client("123","mike","Sri lankan","Student", "No-207,Nittambuwa", 21,"male",3333 );
        client client2 = new client("456","jhon","Sri Lankan","Doctor", "No 2, colombo",43, "male",2222 );

        clients.add(client1);
        clients.add(client2);   //add client objects to the arraylist

        savingAccount acc1 = new savingAccount("1000","Rs","Gampaha", 4000000.0);

        client1.getAccounts().add(new account("1001","Rs","Gampaha",100000.0));
        client1.getAccounts().add(acc1);

//        loan loan1 = new loan(2000, 10, "credit");



        Scanner scanner = new Scanner(System.in); //to get inputs


        while(true){ // for work ATM recursively

            client current = null;


                System.out.println("Welcome!");
                System.out.println("Enter the pin: ");
                int inputPin1 = scanner.nextInt();
                scanner.nextLine();

                for(client client4 : clients){
                    if(client4.getPin() == inputPin1){  //check entered pin match with actual pin and search with different objects in the arraylist

                        current = client4;
                        break;
                    }
                }
                if(current == null){
                    System.out.println("Entered pin is wrong");  // for a wrong pin
                    break;
                }
                System.out.println("Select Account :");
                for(account account1 : current.getAccounts()){
                    System.out.println(current.getAccounts().indexOf(account1) + " - " + account1.getNumber());
                }
                int digit = scanner.nextInt();
                scanner.nextLine();

                account account = current.getAccounts().get(digit);
                System.out.println("1- View Balance");  // main menu
                System.out.println("2- Withdraw money");
                System.out.println("3- Deposit money");
                System.out.println("4- Exit");
                int option = scanner.nextInt();
                boolean active = true;
                while(active){
                    switch (option){
                        case 1 :
                            System.out.println(account.getBalance());
                            break;
                        case 2 :
                            System.out.println("Amount: ");
                            double amountW = scanner.nextDouble();
                            scanner.nextLine();
                            account.withdraw(amountW);
                            break;
                        case 3 :
                            System.out.println("Amount: ");
                            double amountD = scanner.nextDouble();
                            account.deposit(amountD);
                            break;
                        case 4 :
                            active = false;
                            break;
                        default:
                            System.out.println("Invalid number");
                    }
                }


        }
    }
}