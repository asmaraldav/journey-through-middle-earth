/** Dies ist die Klasse Map */
public class Map {

    private int x;
    private int y;

    private MapObject[][]mapArray;
    
/** Dies ist der Konstruktor der Klasse Map, der die Variablen der Karte übergeben bekommt
 * @param mapX Variable, die die X-Koordinate darstellt
 * @param mapY Variable, die die Y-Koordinate darstellt
 */
    public Map(int mapX, int mapY) {

        mapArray = new MapObject[mapX][mapY];
        
        x = mapX;
        y = mapY;
    }

    /** Diese Methode ermöglicht es, ein Obstacle auf der Karte zu platzieren
     * @param xObstacle x-Koordinate des Obstacles
     * @param yObstacle y-Koordinate des Obstacles
     */
    public void placeMapObstacle(int xObstacle, int yObstacle) {

        Obstacle obstacleToBePlaced = new Obstacle("Hindernis");

        mapArray[xObstacle][yObstacle] = obstacleToBePlaced;        
    }

    /** Diese Methode ermöglicht es, ein Item auf der Karte zu platzieren 
     * @param xItem X-Koordinate für das Item
     * @param yItem Y-Koordinate für das Item
     * @param obj das zu platzierende MapObject
    */
    public void placeMapItem(int xItem, int yItem, MapObject obj) {

        mapArray[xItem][yItem] = obj;
    }

    /** Diese Methode gibt das Item mit zugehörigen Koordinaten zurück
     * @return gibt ein MapObject zurück, also ein Item
     * @param xItem X Koordinate für das Item
     * @param yItem Y Koordinate für das Item
     */
    public MapObject retrieveItem(int xItem, int yItem) {

        return mapArray[xItem][yItem];
    }

    /** Diese Methode checkt, ob sich die Koordinaten des Spielers innerhalb der Karte befinden
     * @return ob er sich noch in der Karte befindet (true) oder ob er sich außerhalb der Karte befindet (False)
     * @param player1 dies ist das Spielerobjekt
     */
    public boolean checkCoordinates(Player player1) {

        if (player1.getX() > x || player1.getY() > y || player1.getX() < x || player1.getY() < y) {
            
            return false;
        } else {

            return true;
        }
    }

    /** Diese Methode druckt die vertikale Grenze der Karte */
    public void printVerticalBorder() {

        for (int i = 0; i < mapArray.length; i++) {

            System.out.print("-");
        }
        System.out.println("");
    }

    /** Diese Methode druckt die Karte
     * @param player dies ist das Spielerobjekt
     */
    public void printMap(Wizard player) {

        printVerticalBorder();

        for (int i = 0; i < mapArray.length; i++) {  
            
            System.out.print("|");

            for (int j = 0; j < mapArray[0].length; j++) {  

                if (player.getX() == j && player.getY() == i) {

                    System.out.print("P");
                } else {
                    if (mapArray[i][j] == null) {
                    
                        System.out.print(" "); 
                    
                    } else {

                        System.out.print(mapArray[i][j].getSymbol());
                    }
                }
            }
            System.out.println("|");
            
        }
        
        printVerticalBorder();
        
    }
}