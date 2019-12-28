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

    public Room getRoomByCoordinates(int x, int y) throws IllegalArgumentException{
        if(!validCoordinates(x, y)){
            throw new IllegalArgumentException();
        }
        return map[x][y];
    }

    public boolean validCoordinates(int x, int y){
        if(this.map.length > x && x >= 0){
            if(this.map[0].length > y && y >= 0){
                return true;
            }
        }
        return false;
    }
}
