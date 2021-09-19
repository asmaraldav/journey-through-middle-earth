import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

/** Dies ist die Klassse GameMaster */
public class GameMaster {

    public static void main(String[] eingabe) {
        
        if (eingabe.length != 2) {
            System.out.println("Please append the size (X*Y) of the map as individual commandline parameters!\n");
            return;
        }

        Map testMap = new Map(Integer.parseInt(eingabe[0]), Integer.parseInt(eingabe[1]));

        Random r = new Random();
        
        /**randomly generated x y coordinates */
        int x = r.nextInt(Integer.parseInt(eingabe[0]));
        int y = r.nextInt(Integer.parseInt(eingabe[1]));

        /**randomised items */
        Item ring = new Item("Ring");
        Item schwert = new Item("Schwert");
        Item zaubertrank = new Item("Zaubertrank");
        Item blume = new Item("Blume");

    
        Wizard spieler = new Wizard();

        /**placements of items and obstacles */
        testMap.placeMapItem(4, 1, schwert);
        testMap.placeMapItem(8, 3, ring);
        testMap.placeMapItem(5, 7, blume);
        testMap.placeMapItem(2, 5, zaubertrank);

        testMap.placeMapObstacle(x, y);
        testMap.placeMapObstacle(x, y);


        /**start of game  */
        System.out.println("Welcome to Middle Earth.");
        System.out.println("You have chosen a 10x10 map.");
        System.out.println("You have chosen the wizard as your hero.");
        System.out.println("Observe the map and choose your path carefully.");
        
        testMap.printMap(spieler);


        /** Player can either choose walk, drop, take, map and inv */

        for (int i = 0; i < 100; ++i) {

            Scanner input = new Scanner(System.in);
            System.out.println("What do you want to do next?");
            String command = input.nextLine();

            /**ending it early */
            if (command.equals("end game")) {
                break;
            }

            /** command inv to open player inventory*/
            if (command.equals("inv")) {

                Wizard inventory = new Wizard();

                inventory.printInventory();

            }

            /**command map to open the current map*/
            if (command.equals("map")) {
                testMap.printMap(spieler);
            }

            /**command walk NESW*/
            if (command.equals("walk E")) {
                
                int currentX = spieler.getX();

                int locationX = currentX + 1;
                int locationY = spieler.getY();

                spieler.setLocation(locationX, locationY);

                testMap.printMap(spieler);

            }

            if (command.equals("walk W")) {
                
                int currentX = spieler.getX();

                int locationX = currentX - 1;
                int locationY = spieler.getY();

                spieler.setLocation(locationX, locationY);

                testMap.printMap(spieler);
            }

            if (command.equals("walk S")) {
                
                int currentY = spieler.getY();

                int locationX = spieler.getX();
                int locationY = currentY - 1;

                spieler.setLocation(locationX, locationY);

                testMap.printMap(spieler);
            }

            
            if (command.equals("walk N")) {
                
                int currentY = spieler.getY();

                int locationX = spieler.getX();
                int locationY = currentY + 1;

                spieler.setLocation(locationX, locationY);

                testMap.printMap(spieler);
            }

            /** command take to take items */


            if (command.equals("take")) {

            }

        
            /** drop take to drop items */

            if (command.equals("drop")){
                
            }

        }

    }

}