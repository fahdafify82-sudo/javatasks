package services.implment;

import Model.Account;
import Model.WalletSystem;
import services.AccountServices;
import services.ApplicationServices;

import java.util.Scanner;

public class AppplicationServicesImplementation implements ApplicationServices {
    private Scanner sc = new Scanner(System.in);
    private AccountServices accountServices = new AccountServicesImplementation();
    @Override
    public void Start() {
        System.out.println("Welcome to " + WalletSystem.name);
        Integer count=0;
        while(true) {

            System.out.println("Enter your choice ");
            System.out.println("1-login   2-register account  3-exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            boolean exit = false;

            switch (choice) {
                case 1:
                    System.out.print("u choose 1");
                    break;
                case 2:
                    System.out.print("enter ur name");
                    String name=sc.next();
                    System.out.print("enter ur age");
                    int  age=sc.nextInt();
                    System.out.print("enter ur password");
                    String password=sc.next();
                    System.out.print("enter ur phone number");
                    int   phone=sc.nextInt();
                    System.out.print("enter ur email");
                    String email=sc.next();
                    Account account=new Account(name,password,email,phone,age);
                    account=accountServices.createAccount(account);
                    if(account!=null)
                    {
                        System.out.println("Account created successfully");
                    }
                    else
                    {
                        System.out.println("Account not created");
                    }
                    break;
                case 3:
                    System.out.print("u choose exit");
                    exit=true;
                    break;

                default:
                    System.out.println("Wrong choice");
                    count++;

            }
            if (exit=true) {
                break;
            }
            if(count==3) {
                System.out.println("contact admi  if problem");
                break;
            }
        }


    }
}
