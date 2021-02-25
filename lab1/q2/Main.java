
public class Main {
    public static void main (String[] args) {
        Creature knight = new Knight ();
        knight.type();
        knight.attack();
        knight.move();
        Creature cyclops = new Cyclops ();
        cyclops.type();
        cyclops.attack();
        cyclops.move();
        Creature birdbeing = new Birdbeing ();
        birdbeing.type();
        birdbeing.attack();
        birdbeing.move();
    }
}
