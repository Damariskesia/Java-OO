package Application;

import entities.AccountDois;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.util.Scanner;

public class ProgramVinteDois {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        AccountDois acc = new AccountDois(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        AccountDois acc1 = bacc;
        AccountDois acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        AccountDois acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);


        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        AccountDois acc6 = new AccountDois(1005, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        AccountDois acc7 = new SavingAccount(1006, "Maria", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        AccountDois acc8 = new BusinessAccount(1007, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        //polimorfismo

        AccountDois x = new AccountDois(1023, "Alex", 1000.0);
        AccountDois y = new SavingAccount(1024, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("X:"+ x.getBalance());
        System.out.println("Y:" + y.getBalance());

        sc.close();
    }
}
