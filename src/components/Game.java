package components;

public class Game {

    private Player player;
    private WorldMap map;
    private InputParser parser;

    public Game(Player player, WorldMap map, InputParser parser) {
        this.player = player;
        this.map = map;
        this.parser = parser;
    }

    public InputParser getParser() {
        return parser;
    }

    public void setParser(InputParser parser) {
        this.parser = parser;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public WorldMap getMap() {
        return map;
    }

    public void setMap(WorldMap map) {
        this.map = map;
    }

    public int getCurrentX(){
        return this.player.getX();
    }

    public int getCurrentY(){
        return this.player.getY();
    }

    public Room getCurrentRoom(int x, int y)throws IllegalArgumentException{
        return this.map.getRoomByCoordinates(x, y);
    }

}
