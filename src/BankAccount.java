import java.util.Date;
import java.util.Locale;

public class BankAccount {

        private String accNum;
        private double balance;
        private String name;
        private String email;
        private String phonenumber;

        public void deposit (double depositamount){
                this.balance += depositamount;
                System.out.println("Deposit of " + depositamount + "being process. New balance is " + this.balance );
        }

        public void withdrawal (double withdrawalamount){
                if (this.balance - withdrawalamount <= 0){
                        System.out.println("Only have " + this.balance + "in your account. The process cannot be proceed");
                }
                else{
                         this.balance -= withdrawalamount;
                        System.out.println("Withdrawal amount " + withdrawalamount + " being process. Remaining balance: " + this.balance);
                }
        }

        public String getAccNum() {
                return accNum;
        }

        public void setAccNum(String accNum) {
                this.accNum = accNum;
        }

        public double getBalance() {
                return balance;
        }

        public void setBalance(double balance) {
                this.balance = balance;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhonenumber() {
                return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
                this.phonenumber = phonenumber;
        }
}
