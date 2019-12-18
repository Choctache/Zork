package components;


public class App {

    public static void main(String[] args) {

        Game game = setupGame();
        runGame(game);

    }

    public static Game setupGame() {
        Room westishRoom = new Room(Crossing.WALL, Crossing.OPEN_DOOR, Crossing.WALL, Crossing.WALL);
        Room eastishRoom = new Room(Crossing.WALL, Crossing.WALL, Crossing.WALL, Crossing.OPEN_DOOR);

        Room[][] rooms = new Room[1][2];
        rooms[0][0] = westishRoom;
        rooms[0][1] = eastishRoom;

        Map map = new Map(rooms);

        Player player = new Player(0, 0);

        InputParser parser = new InputParser();

        Game game = new Game(player, map, parser);

        return game;
    }

    public static void printPossibleCommands(){
        System.out.println("You can use the following commmands: " +
                "\n\t- <sn>: show north" +
                "\n\t- <se>: show east" +
                "\n\t- <ss>: show south" +
                "\n\t- <sw>: show west" +
                "\n\t- <en>: enter north" +
                "\n\t- <ee>: enter east" +
                "\n\t- <es>: enter south" +
                "\n\t- <ew>: enter west" +
                "\n\t- <help>: show commands" +
                "\n\t- <q>: quit game");
        System.out.println();
    }

    public static void runGame(Game game){

        System.out.println("Welcome to your text adventure.");
        printPossibleCommands();

        int x = game.getPlayer().getX();
        int y = game.getPlayer().getY();
        Room currentRoom = game.getMap().getRoomByCoordinates(x, y);

        System.out.println("You are in the room with the coordinates: x = " + x + " and y = " + y);
        String command = "";

        do {
            System.out.println("What do you want to do? ");
            command = game.getParser().getString();

            switch (command) {
                case "sn":
                    currentRoom.showNorth();
                    break;
                case "se":
                    currentRoom.showEast();
                    break;
                case "ss":
                    currentRoom.showSouth();
                    break;
                case "sw":
                    currentRoom.showWest();
                    break;
                case "ee":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setY(y + 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }
                    break;
                case "ew":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setY(y - 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }
                    break;
                case "es":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setX(x + 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }
                    break;
                case "en":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setX(x - 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }
                    break;
                case "help":
                    printPossibleCommands();
                    break;
                case "q":
                    System.out.println("Tank you for playing Zork.");
                    return;
            }
        }while(true);

    }

}
