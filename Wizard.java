/** Die ist die Klasse Wizard */
public class Wizard implements Player {

    private int maxInventarStorage = 4;
    private Item[] inventarContent = new Item[maxInventarStorage];
    private int inventarStorageAvailable = 4;
    private int x = 0;
    private int y = 0;
    
    
    /** Diese Methode gibt an, ob das Item aufgenommen werden kann oder nicht
     * @param itemToBeTaken Item, das aufgenommen werden soll, sofern Platz im Inventar vorhanden ist
     */
    public void takeItem(Item itemToBeTaken) {

        if (inventarStorageAvailable > 0) {

            for (int i = 0; i < (inventarContent.length - 1); i++) {

                if (inventarContent[i] == null) {

                    inventarContent[i] = itemToBeTaken;
                }
            }
            
            inventarStorageAvailable = inventarStorageAvailable - 1;

        } else {

            System.out.println("Your inventory is fully stocked. You cannot put this item in your inventory unless you put an item down.");
        }
    }

    /** Diese Methode legt ein Item ab und macht Platz im Inventar frei
     * @param itemToBePutDown das Item, was aus dem Inventar entfernt werden soll
     * @return es wird das MapObject, das abgelegt wird, zurück gegeben
     */
    public MapObject putItemDown(String itemToBePutDown) {
       
        for (int i = 0; i < (inventarContent.length - 1); i++) {

            if (inventarContent[i].getName() == itemToBePutDown) {

                Item returnItem = inventarContent[i];

                inventarContent[i] = null;

                inventarStorageAvailable = inventarStorageAvailable + 1;

                return returnItem;

            }
        }

        System.out.println("This item is not in your inventory. It cannot be put down.");

        return null; 
    }

    /** Diese Methode druckt das Inventar des Spielers aus */
    public void printInventory() {

        System.out.println("Your inventory contains the following items:");
        
        for (int i = 0; i < (inventarContent.length - 1); i++) {

            System.out.println(inventarContent[i].getName());
        }

    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    /** Diese Methode beinhaltet die Location der x und y Koordinaten
     * @param x X Koordinate der Location
     * @param y Y Koordinate der Location
     */
    public void setLocation(int x, int y) {
        
        this.x = x;
        this.y = y;
    }
}
