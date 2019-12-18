package components;

public class Game {

    private Spieler player;
    private Karte map;

    public Game(Spieler player, Karte map) {
        this.player = player;
        this.map = map;
    }

    public Spieler getPlayer() {
        return player;
    }

    public void setPlayer(Spieler player) {
        this.player = player;
    }

    public Karte getMap() {
        return map;
    }

    public void setMap(Karte map) {
        this.map = map;
    }

    public int getCurrentX(){
        return this.player.getX();
    }

    public int getCurrentY(){
        return this.player.getY();
    }

    public Raum getCurrentRoom(int x, int y){
        return this.map.getRoomByCoordinates(x, y);
    }

}
