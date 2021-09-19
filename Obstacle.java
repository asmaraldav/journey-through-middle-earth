/** Dies ist die Klasse Obstacle */
public class Obstacle implements MapObject {
    
    private String name;
    private char symbol = '#';

    /** Dies ist der Konstruktor der Klasse Obstacle, der einen Namen übergeben bekommt
     * @param name Name des Obstacles
     */
    public Obstacle(String name) {
        this.name = name;
        this.symbol = name.charAt(0);
    }

    /** Dies ist der Konstruktor der Klasse Obstacle, der einen Namen und ein Symbol übergeben bekommt
     * @param name Name des Obstacles
     * @param symbol Symbol des Obstacles
     */
    public Obstacle(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {

        return this.name;
    }
    
    public boolean getCollision() {
        return true;
    }

    public boolean isLootable() {
        return false;
    }

    public char getSymbol() {

        return symbol;
    }

}