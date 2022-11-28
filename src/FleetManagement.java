import java.util.ArrayList;
import java.util.Scanner;

public class FleetManagement {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Boat> fleet = new ArrayList<>();
        Boat myBoats = new Boat();

        if (args.length > 0) {
            initFromCSVFile();
        } else {
            initFromObjectFile();
        }


        String boatType;
        String name;
        int yearMade;
        String model;
        int length;
        double price;
        double expenses;

        System.out.println("Welcome to the Fleet Management System");
        System.out.println("--------------------------------------");
        System.out.print("\n");

    }

    writeFleetToObjectFile();

    initFromCSVFile(){


    }
    //add new boat to arraylist
    void addBoat(Boat newFleet, ArrayList<Boat> fleet){
        fleet.add(newFleet);
    }

    // remove boat from arraylist
    void removeBoat(int index, ArrayList<Boat> fleet){
        if (index > fleet.size()){
            System.out.print("Cannot find boat " + getClass().getName());
        } else {
            fleet.remove(index);
        }
    }

    void displayBoat(ArrayList<Boat> fleet){
        int index;

        for (index = 0; index < fleet.size(); index++){
            System.out.print(fleet.get(index));

        }

    }




    // Switch Statement Method for Menu Options
    private static void menuOptions(String boatType, String name, int yearMade, String model, int length, double price, double expenses) {

        char response;

        do {
            System.out.print("(P)rint, (A)dd, (R)emove, (E)xpense, e(X)it : ");
            response = Character.toUpperCase(keyboard.next().charAt(0));

            while (response != 'P' && response != 'A' && response != 'R' && response != 'X' && response !='E') {
                System.out.print("Invalid menu option, try again              : ");
                response = Character.toUpperCase(keyboard.next().charAt(0));
            }

            switch(response) {
                case 'P':

                    break;

                case 'A':
                    break;

                case 'R':
                    break;

                case 'E':
                    break;

                case 'X':
                    break;

            }

        } while (response == 'P' && response == 'A' && response == 'R' && response =='E');
    }


    }







