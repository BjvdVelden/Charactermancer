package Menu;

import Database.database;
import LoginSysteem.login;
import LoginSysteem.register;

import java.util.Scanner;

public class menu {
    public boolean start = true;

    public menu() {
        database database = new database();
        login login = new login();
        register register = new register();

        System.out.println("Welkom bij de Charactermancer!");
        System.out.println("Wil je inloggen of registreren?");

        Scanner scanner = new Scanner(System.in);
         while (this.start = true) {
             String antwoord = scanner.nextLine().toLowerCase();
             switch (antwoord) {
                 case "inloggen":
                     login.startLogin(database.getDataLijst());
                     database.setLoggedIn(true);
                     this.start = false;
                     break;
                 case "registreren":
                     database.addToDatabase(register.startRegistratie());
                     database.setLoggedIn(true);
                     this.start = false;
                     break;
                 case "stop":
                     System.exit(1);
                     break;
                 default:
                     System.out.println("Input niet herkend!");
             }
         }
        while (database.isLoggedIn()) {
            System.out.println("Wat wil je doen? (OPTIES: \" show alle gebruikers \")");
            String antwoord2 = scanner.nextLine().toLowerCase();
            switch (antwoord2) {
                case "show alle gebruikers":
                    database.showAccounts();

                case "stop":
                    database.setLoggedIn(false);
                    break;
                default:
                    System.out.println("Input niet herkend!");
            }
        }

    }
}
