package Database;

import Account.Account;

import java.util.ArrayList;


public class dummyAccount {

    private static ArrayList<Account> accountLijst;

    public dummyAccount() {
        this.accountLijst = new ArrayList();
    }

    public void generateAccounts() {
        Account persoon1 = new Account("GivanSaub","#1Geheim");
        Account persoon2 = new Account("DeMan3","#1Geheim");
        Account persoon3 = new Account("Admin", "Admin");
        Account persoon4 = new Account("DeBoys12","#1Geheim");

        accountLijst.add(persoon1);
        accountLijst.add(persoon2);
        accountLijst.add(persoon3);
        accountLijst.add(persoon4);
    }


    public static ArrayList<Account> getAccountLijst() {
        return accountLijst;
    }
}