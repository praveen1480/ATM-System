import java.util.Scanner;
//encapsulation class
class Account{
    private String
            accountNumber;
    private String
            accountHolder;
    private double balance;

    public Account(String accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    //getter balance

    public double getBalance() {
        return balance;
    }
    //deposit method
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("deposit"+amount);
        }
        else{
            System.out.println("invalid deposit amount");
        }

    }
    //withdraw method
    public boolean withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("withraw"+amount);
            return true;
        }
        else{
            System.out.println("not sufficient balance");
            return false;
        }
    }
    //account details
    public void displayAccountInfo(){
        System.out.println("accountHolder:"+accountHolder);
        System.out.println("accountNumber:"+accountNumber);
    }
}
//ATM class with amount
public class ATMSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account useraccount = new Account("8279627301","Praveen Singh",1000.00);
        int choice;
        do{
            System.out.println("<<<<ATM Menu>>>>");
            System.out.println("check balance");
            System.out.println("deposit");
            System.out.println("withraw");
            System.out.println("Account Info");
            System.out.println("exit");
            System.out.println("enter your choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("current balance:"+useraccount.getBalance());
                    break;
                case 2:
                    System.out.println("enter deposit amount:");
                    double dep = sc.nextDouble();
                    useraccount.deposit(dep);
                    break;
                case 3:
                    System.out.println("enter withdaw amount:");
                    double with = sc.nextDouble();
                    useraccount.withdraw(with);
                    break;
                case 4:
                    useraccount.displayAccountInfo();
                   break;
                case 5:
                    System.out.println("thank you have a nice day");
                    break;
                default:
                    System.out.println("try again");
            }
        }while (choice!=5);
        sc.close();
    }
}


