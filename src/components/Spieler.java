package components;

public class Spieler {

    private int x;
    private int y;


    public Spieler(int x, int y) {
        this.x = x;
        this.y = y;
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

}
