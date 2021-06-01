package LoginSysteem;

import Account.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
    private String accountNaam;
    private String accountWachtwoord;
    public ArrayList<Account> dataLijst;
    public boolean loggedIn;


    public login(){

    }

    public void startLogin(ArrayList<Account> database){

        this.dataLijst = database;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul uw gebruikers naam");
        String accountNaam = scanner.nextLine();
        System.out.println("Vul uw wachtwoord");
        String accountWachtwoord = scanner.nextLine();

        for (int i = 0; i < this.dataLijst.size(); i++){
            String dataAccountNaam = dataLijst.get(i).getAccountUsername();
            String dataAccountWachtwoord = dataLijst.get(i).getAccountWachtwoord();

            if (dataAccountNaam.equals(accountNaam) && dataAccountWachtwoord.equals(accountWachtwoord)){
                this.loggedIn = true;
                this.accountNaam = accountNaam;
                this.accountWachtwoord = accountWachtwoord;

                System.out.println("Welkom "+ accountNaam + " !");


            }
        }

        if (!loggedIn){
            System.out.println("accountnaam of wachtwoord klopt niet.");
        }
    }
}
