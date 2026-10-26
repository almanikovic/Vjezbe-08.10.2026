package zadaci;
import java.util.ArrayList;

public class Game {

    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        this.player = player;
        enemies = new ArrayList<>();
        eventLog = new ArrayList<>();
    }

    // provjera sudara
    public boolean checkCollision(Player p, Enemy e) {

        return p.getX() < e.getX() + e.getWidth()
                && p.getX() + p.getWidth() > e.getX()
                && p.getY() < e.getY() + e.getHeight()
                && p.getY() + p.getHeight() > e.getY();
    }

    // smanjuje health igrača
    public void decreaseHealth(Player p, Enemy e) {

        int oldHealth = p.getHealth();

        int newHealth = oldHealth - e.getDamage();

        if (newHealth < 0) {
            newHealth = 0;
        }

        p.setHealth(newHealth);

        eventLog.add("HIT: Player by " + e.getType()
                + " for " + e.getDamage()
                + " -> HP " + oldHealth + " -> " + newHealth);
    }

    // dodavanje neprijatelja
    public void addEnemy(Enemy e) {
        enemies.add(e);

        eventLog.add("ADD: " + e.getType());
    }

    // pretraga po tipu
    public ArrayList<Enemy> findByType(String query) {

        ArrayList<Enemy> rezultat = new ArrayList<>();

        query = query.trim().toLowerCase();

        for (Enemy e : enemies) {

            if (e.getType().toLowerCase().contains(query)) {
                rezultat.add(e);
            }
        }

        return rezultat;
    }

    // neprijatelji koji se sudaraju sa igračem
    public ArrayList<Enemy> collidingWithPlayer() {

        ArrayList<Enemy> rezultat = new ArrayList<>();

        for (Enemy e : enemies) {

            if (checkCollision(player, e)) {
                rezultat.add(e);
            }
        }

        return rezultat;
    }

    // rješavanje svih sudara
    public void resolveCollisions() {

        ArrayList<Enemy> sudari = collidingWithPlayer();

        for (Enemy e : sudari) {
            decreaseHealth(player, e);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<String> getEventLog() {
        return eventLog;
    }












public static void main(String[] args) {
// TODO Auto-generated method stub

}

}

