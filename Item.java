/** Dies ist die Klasse Item */
public class Item implements MapObject {
    
    private String name;
    private char symbol;

    /** Dies ist der Konstruktor der Klasse Item, welcher einen Namen übergeben bekommt
     * @param name Name des Items
     */
    public Item(String name) {
        this.name = name;
        this.symbol = name.charAt(0);
    }

    /** Dies ist der Konstruktor der Klasse Item, welcher einen Namen und ein Symbol übergeben bekommt
     * @param name Name des Items
     * @param symbol Symbol des Items
    */
    public Item(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    public String getName() {
        
        return this.name;
    }

    public boolean getCollision() {
        return false;
    }

    public boolean isLootable() {
        return true;
    }

    public char getSymbol() {

        return symbol;
    }

}