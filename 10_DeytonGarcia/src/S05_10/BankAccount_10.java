/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_10;
import java.util.Scanner;

/**
 *
 * @author deyto
 */
public class BankAccount_10 {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    /**
     *
     */
    public BankAccount_10() {
        accountNumber = "";
        accountHolderName = "";
        balance = 0.0;
    }
    
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextLine();
        
        System.out.print("Enter account holder name: ");
        accountHolderName = scanner.nextLine();
        
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }
    
    public void displayData() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setData();
        account.displayData();
    }
}
