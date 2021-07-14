import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayerSelection {
public static ArrayList<Player> playerList = new ArrayList<Player>();
public static String name,type;
public static int age,runsScored,wickets;


    static void addPlayer() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the name: ");
            String name = sc.nextLine();

            System.out.println("Enter the age: ");
            int age = sc.nextInt();


            while (true) {
                System.out.println("Enter the type: 1- Spin bowler, 2-Seam bowler, 3-Batsman, 4-Keeper ");
                int typeOption = sc.nextInt();
                if (typeOption == 1) {
                    type = ("Spin Bowler");
                    break;
                } else if (typeOption == 2) {
                    type = ("Seam Bowler");
                    break;
                } else if (typeOption == 3) {
                    type = ("Batsman");
                    break;
                } else if (typeOption == 4) {
                    type = ("Keeper");
                    break;
                }
                else{
                    System.out.println("Invalid option:Please enter an valid option");
                }
            }

            int runsScored;
            System.out.println("Enter the number of runs scored : ");
            runsScored = sc.nextInt();

            int wickets;
            System.out.println("Enter the number of wickets taken : ");
            wickets = sc.nextInt();

            double runRate;
            System.out.println("Enter the run rate : ");
            runRate = sc.nextInt();
            sc.nextLine();

            double strikeRate;
            System.out.println("Enter the run rate : ");
            strikeRate = sc.nextInt();

            Player player = new Player(name, age, type, runsScored, wickets, runRate, strikeRate);
            playerList.add(player);
            break;

        }}


    static void displayBestTwoBatsman() {
        for (int i = playerList.size() - 1; i >= 0; i--) {
                if ((playerList.get(i).runsScored) < (playerList.get(i + 1).runsScored)) {
                    Player player = playerList.get(i);
                    playerList.set(i, playerList.get(i + 1));
                    playerList.set(i + 1, player);

            }
        }
        System.out.println("Two Best Batsmen");
        int count = 0;
        while (count == 2) {
            System.out.println(playerList.get(count).Name);
            count+=1;
        }
    }

    static void displayBestTwoBowlers() {
        for (int i = playerList.size() - 1; i >= 0; i--) {

                if ((playerList.get(i).wickets) < (playerList.get(i + 1).wickets)) {
                    Player player = playerList.get(i);
                    playerList.set(i, playerList.get(i + 1));
                    playerList.set(i + 1, player);
                }

        }
        System.out.println("----------Two Best Bowlers----------");
        int count = 0;
        while (count == 2) {
            System.out.println(playerList.get(count).Name);
        }
    }
    static void displayBestKeeper(){
        System.out.println(Arrays.toString(new ArrayList[]{(playerList)}));

    }

    public static void displayMenu() {//main menu to guide the user to choose options
        System.out.println("Main Menu:");
        System.out.println("Insert A to Add a player");
        System.out.println("Insert B to Display two best batsmen");
        System.out.println("Insert C to Display two best bowlers");
        System.out.println("Insert D to Display best keeper");
        System.out.println("Insert Q to Quit the program");
    }

    //progran starts
    public static void main(String[] args) {
        Player player = new Player();
        PlayerSelection.displayMenu();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter menu option:");
            String menuOption= sc.nextLine();
            label:
            while(true){
                switch (menuOption) {
                    case "a":
                        PlayerSelection.addPlayer();
                        System.out.println("Do you want to continue adding players?(y for yes, n for no):");
                        String vaidation = sc.nextLine();
                        if (vaidation.equals("y")) {
                            PlayerSelection.addPlayer();
                        } else if (vaidation.equals("n")) {
                            break label;
                        }

                        break;
                    case "b":
                        PlayerSelection.displayBestTwoBatsman();
                        break label;
                    case "c":
                        PlayerSelection.displayBestTwoBowlers();
                        break label;
                    case "d":
                        PlayerSelection.displayBestKeeper();
                        break label;
                    case "q":
                        System.out.println("Program ended!!!");
                        break label;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

            }
        }

    }
}



