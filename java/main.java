import Menu.menu;

class Main{
  private static LoginSysteem.LoginSingleton LoginSingleton;

  public static void main(String[] args) {

    LoginSingleton.getInstantiate();
    menu menu = new menu();

  }
} 
