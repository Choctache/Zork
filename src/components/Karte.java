package components;

public class Karte {

    private Raum[][] map;

    public Karte(Raum[][] map){
        this.map = map;
    }

    public Raum[][] getMap() {
        return map;
    }

    public void setMap(Raum[][] map) {
        this.map = map;
    }

    public Raum getRoomByCoordinates(int x, int y){
        return map[x][y];
    }
}
