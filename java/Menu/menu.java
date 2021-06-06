//package Menu;
//
//import CharacterSheet.CharacterSheet;
//import Database.Database;
//import LoginSysteem.LoginSingleton;
//import LoginSysteem.login;
//import LoginSysteem.registerFunction;
//
//import java.util.Scanner;
//
//public class menu {
//    public boolean start;
//
//    public menu() {
//        Database database = new Database();
//
//        loginSingleton.getInstantiate();
//        registerFunction registerFunction = new registerFunction();
//
//        System.out.println("Welkom bij de Charactermancer!");
//        System.out.println("Wil je inloggen of registreren?");
//
//        Scanner scanner = new Scanner(System.in);
//         while (this.start = true) {
//             String antwoord = scanner.nextLine().toLowerCase();
//             switch (antwoord) {
//                 case "inloggen":
//                     login.startLogin(database.getAccounts());
//                     database.setLoggedIn(true);
//                     this.start = false;
//                     break;
//                 case "registreren":
//                     database.addToDatabase(registerFunction.startRegistratie());
//                     database.setLoggedIn(true);
//                     this.start = false;
//                     break;
//                 case "stop":
//                     System.exit(1);
//                     break;
//                 default:
//                     System.out.println("Input niet herkend!");
//             }
//         }
//        while (database.isLoggedIn()) {
//            System.out.println("Wat wil je doen? (OPTIES: \" show alle gebruikers \")");
//            String antwoord2 = scanner.nextLine().toLowerCase();
//            switch (antwoord2) {
//                case "show alle gebruikers":
//                    database.showAccounts();
//
//                case "stop":
//                    database.setLoggedIn(false);
//                    break;
//                case "start charactermancer":
//                     CharacterSheet character = new CharacterSheet(login.account);
//                    break;
//                default:
//                    System.out.println("Input niet herkend!");
//            }
//        }
//
//    }
//}
