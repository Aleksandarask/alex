import java.util.Scanner;

public class Main {

    static Pot pot = new Pot();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int eggsCounter = 0;
        while(true){
            System.out.println("Program for boiling eggs");
            System.out.println("1. Add egg to pot");
            System.out.println("2. Cook eggs");
            System.out.println("3. Get eggs out of pot");

            var input = scanner.next();

            switch (input){
                case "1":
                    eggsCounter++;
                    System.out.println(eggsCounter + " in the pot");
                    pot.addEgg();
                    break;
                case "2":
                    System.out.println("Eggs are cooking");
                    pot.boil();
                    break;
                case "3":
                    pot.getOut();
            }
        }
    }
}
