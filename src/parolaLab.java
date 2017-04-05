import java.util.Scanner;

/**
 * Created by dan on 3/29/2017.
 */


public class parolaLab {

    public static void main(String[] args) {


        String[][]array = {{"Dan", "user1"}, {"Geta", "user2"}, {"Raluca", "user3"}, {"Ilinca", "user4"}};

        Scanner input = new Scanner(System.in);
        System.out.println("Log in  ");
        boolean nimerit = false;
        while (!nimerit) {

            System.out.print("username: ");
            String user = input.next();

            System.out.print("password: ");
            String password = input.next();


            nimerit = isCombinatiaBuna(user, password);
            if (nimerit) {
                lansez();
            }
        }
    }


    public static void lansez() {
        System.out.println("You are loggin");
        // voi cauta acasa cum lansez notepad sau orice alt program
        // (e la fel pt orice program) din java
    }


    public static boolean isCombinatiaBuna( user password) {

        // return true daca is alea din db altfel false
        if (user.equals(user) & password.equals(password)) {
            return true;
        }
        return false;
    }

    }
















