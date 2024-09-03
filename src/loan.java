public class loan {

    private double amount;

    private double interest;

    private int duration;

    private String payMethod;

    private static int x;

    loan(double amount, int duration, String payMethod){
        this.amount = amount;
        this.duration = duration;
        this.payMethod = payMethod;
    }
//getters for loan attribiutes


    public double getAmount() {
        return amount;
    }

    public double getInterest() {
        return interest;
    }

    public void increaseloan(double x){
        amount = amount + x;
    }

//    public void setDuration(int duration) {
//        this.duration = duration;
//    }

//    public void setPayMethod(String payMethod){
//        this.payMethod = payMethod;
//    }
}
