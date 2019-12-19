package components;

public class WorldMap {

    private Room[][] map;

    public WorldMap(Room[][] map) {
        this.map = map;
    }

    public Room[][] getMap() {
        return map;
    }

    public void setMap(Room[][] map) {
        this.map = map;
    }

    public Room getRoomByCoordinates(int x, int y) {
        return map[x][y];
    }
}
