import java.util.Scanner;


public class Main {
    static String[] agendaPersoane = new String[2];// variabila globala
    static int index;

    public static void main(String[] args) {



        int optiune = -1;

        do {
            optiune = readIntConsole("Alegeti ceva gen 1 pt afisare , 2 pt adaugare sau 7 pt iesire");

            if (optiune == 1)
                afisare();
            else if (optiune == 2) {

                String numele = readStringConsole("Numele:");

                adaugare(numele);


                //userul vede un meniu si alege ceva
                // daca a ales iesire se termine
                //daca a ales afisare se afiseaza
            } else if (optiune == 3) {

                String numele = readStringConsole("Numele:");

                stergere(numele);


                //userul vede un meniu si alege ceva
                // daca a ales iesire se termine
                //daca a ales afisare se afiseaza
            } else if (optiune == 4) {

                String numeleV = readStringConsole("Numele:");
                String numeleN = readStringConsole("Numele nou:");

                modificare(numeleV, numeleN);

                //userul vede un meniu si alege ceva
                // daca a ales iesire se termine
                //daca a ales afisare se afiseaza
            }

        }
        while (optiune != 7);

    }

    public static void afisare() {
        System.out.println("--Persoane--");
        for (int i = 0; i < agendaPersoane.length; i++) {
            System.out.println(agendaPersoane[i]);
        }
    }

    public static void adaugare(String nume) {
        if (index < agendaPersoane.length) {
            agendaPersoane[index] = nume;
            index++;
        }
        else {
            for (int i= 0; i < agendaPersoane.length; i++){
                agendaPersoane[i]=nume;
                break;
            }
        }
    }

    public static void modificare(String vechiulNume, String noulNume) {
        //cautare
        //daca exista sa modific alfel sa-i zic ca nu exista
        int gasit = cautare(vechiulNume);
        if (gasit != -1)
            agendaPersoane[gasit] = noulNume;

    }

    public static void stergere(String nume) {
        int gasit = cautare(nume);
        if (gasit != -1)
            agendaPersoane[1] = null;
    }

    public static int cautare(String nume) {
        int indexFound = -1;

        for (int i = 0; i < agendaPersoane.length; i++) {
            if (nume.equals(agendaPersoane[i])) {
                indexFound = i;

            }

        }
        return indexFound;
    }




            public static int readIntConsole (String label){
                System.out.print(label);
                int input = new Scanner(System.in).nextInt();
                return input;
            }

            public static String readStringConsole (String label){
                System.out.print(label);
                String input = new Scanner(System.in).nextLine();
                return input;
            }
}


