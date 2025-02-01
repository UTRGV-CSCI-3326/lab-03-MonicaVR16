public class BankAccount {
    public static void main(String[] args) {
        //Initial balance
        double balance = 2175.37;

        //Transactions
        balance -= 302.50;  //withdrew $302.50
        balance += 50.03;  //deposited $50.03
        balance -= balance / 2;  //withdrew half of current balance
        balance += 20.00; //deposited $20.00
        balance -= 1.00;  //withdrew $1.00
        balance *= 2;  //deposited paycheck that doubled current balance
        balance += 1.00; //deposited $1.00

        System.out.printf("Bob's new balance after all transactions: $%.2f\n", balance);


    }
}
