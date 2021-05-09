import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public String accountNaam;
    public String accountWachtwoord;
    public ArrayList<Account> dataLijst;
    public boolean loggedIn;

    public login(){
        dummyAccount data = new dummyAccount();
        data.generateAccounts();
        this.dataLijst = data.getAccountLijst();
    }

    public void startLogin(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul uw gebruikers naam");
        String accountNaam = scanner.nextLine();
        System.out.println("Vul uw wachtwoord");
        String accountWachtwoord = scanner.nextLine();

        for (int i = 0; i < this.dataLijst.size(); i++){
            String dataAccountNaam = dataLijst.get(i).getAccountUsername();
            String dataAccountWachtwoord = dataLijst.get(i).getAccountWachtwoord();

            System.out.println(dataAccountNaam);
            System.out.println(dataAccountWachtwoord);

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
