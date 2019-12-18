package components;

public class App {

    public static void main(String[]args){

       Game game = setupGame();

        System.out.println("Welcome to your text adventure.");

        int x = game.getPlayer().getX();
        int y = game.getPlayer().getY();

        System.out.println("You are in the room with the coordinates: x = " +x + " and y = " + y);

        Room currentRoom = game.getMap().getRoomByCoordinates(x,y);

        currentRoom.showNorth();
        currentRoom.showEast();
        currentRoom.showSouth();
        currentRoom.showWest();


    }

    public static Game setupGame(){
        Room westishRoom = new Room(Crossing.WALL, Crossing.OPEN_DOOR, Crossing.WALL, Crossing.WALL);
        Room eastishRoom = new Room(Crossing.WALL, Crossing.WALL, Crossing.WALL, Crossing.OPEN_DOOR);

        Room[][] rooms = new Room[1][2];
        rooms[0][0] = westishRoom;
        rooms[0][1] = eastishRoom;

        Map map = new Map(rooms);

        Player player = new Player(0,0);

        Game game = new Game(player, map);

        return game;
    }

}
