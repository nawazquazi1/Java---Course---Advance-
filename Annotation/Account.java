package Annotation;

import java.lang.annotation.Annotation;
// class level annotation
 class Test{
    public static void main(String[] args) throws ClassNotFoundException {
        Account account=new Account("B-111","Moh.Akib Nawaz Quazi","Saving",150000);
        System.out.println(account);
        Class<?> accountClass= Class.forName("Annotation.Account");
        Bank annotation=accountClass.getAnnotation(Bank.class);
        System.out.println("Bank Details");
        System.out.println("------------");
        System.out.println("Bank Id :"+ annotation.id());
        System.out.println("Bank Name :"+ annotation.name());
        System.out.println("Bank Branch :"+ annotation.branch());
        System.out.println("Bank Website :"+ annotation.website());
        System.out.println("----------------------");
    }
}
@Bank
//@Bank(id = "B-222",name = "ICICI",website = "WWW.iciciBank.com")
public class Account {
   private String accNo;
   private String accHolderName;
   private String accType;
   private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", accHolderName='" + accHolderName + '\'' +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }
    public Account(String accNo, String accHolderName, String accType, int balance){
       this.accNo=accNo;
       this.accHolderName=accHolderName;
       this.accType=accType;
       this.balance=balance;
   }
}
