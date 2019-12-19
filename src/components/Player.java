package components;


public class Player {

    private int x;
    private int y;
    private Inventory inventory;


    public Player(int x, int y, Inventory inventory) {
        this.x = x;
        this.y = y;
        this.inventory = inventory;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void changeCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
