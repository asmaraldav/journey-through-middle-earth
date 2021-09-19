/** Repräsentiert den Spieler */
public interface Player {

   /** Diese Methode ermöglicht es, ein Item in das Inventar aufzunehmen
    * @param itemToBeTaken Item, das aufgenommen werden soll
    */
    public void takeItem(Item itemToBeTaken);

    /** Ermöglicht es, ein Item abzulegen
     * @param itemToBePutDown Item, das abgelegt werden soll
     * @return gibt ein MapObject zurück
    */
    public MapObject putItemDown(String itemToBePutDown);

    /** druckt das Inventar aus */
    public void printInventory();

    /** gibt die X Koordinate zurück
     * @return gibt die X-Koordinate als ganzzahlige Zahl zurück
     */
    public int getX();

    /** gibt die Y Koordinate zurück
     * @return gibt die Y-Koordinate als ganzzahlige Zahl zurück
     */
    public int getY();

    /** Sucht die Location und gibt die Koordinaten zurück
     * @param x X-Koordinate
     * @param y Y-Koordinate
     */
    public void setLocation(int x, int y);   
    
}