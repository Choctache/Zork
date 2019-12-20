package components;


import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        Game game = setupGame();
        runGame(game);

    }

    public static Game setupGame() {

        Item wRnI = new Item("Book", "A book supposed to be in westish Room in the North");
        HashMap<String, Item> wRnm = new HashMap<>();
        wRnm.put(wRnI.getName(), wRnI);
        Inventory wRn = new Inventory(wRnm);

        Room westishRoom = new Room(Crossing.WALL, Crossing.OPEN_DOOR, Crossing.WALL, Crossing.WALL);
        Room eastishRoom = new Room(Crossing.WALL, Crossing.WALL, Crossing.WALL, Crossing.OPEN_DOOR);

        westishRoom.setNorthInv(wRn);

        Room[][] rooms = new Room[1][2];
        rooms[0][0] = westishRoom;
        rooms[0][1] = eastishRoom;

        WorldMap map = new WorldMap(rooms);

        HashMap<String, Item> inv = new HashMap<>();

        Inventory inventory = new Inventory(inv);

        Player player = new Player(0, 0, inventory);

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
                    }else{
                        System.out.println("There is no possibility to change the room going this way.");
                    }
                    break;
                case "ew":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setY(y - 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }else{
                        System.out.println("There is no possibility to change the room going this way.");
                    }
                    break;
                case "es":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setX(x + 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }else{
                        System.out.println("There is no possibility to change the room going this way.");
                    }
                    break;
                case "en":
                    if (currentRoom.isEastCrossable()) {
                        game.getPlayer().setX(x - 1);
                        x = game.getPlayer().getX();
                        y = game.getPlayer().getY();
                        currentRoom = game.getMap().getRoomByCoordinates(x, y);
                        System.out.println("You have successfully entered the room with coordinates x = " + x + " and y = " + y);
                    }else{
                        System.out.println("There is no possibility to change the room going this way.");
                    }
                    break;
                case "spi":
                    game.getPlayer().getInventory().listInventory();
                    break;
                case "ti":
                    System.out.println("What item would you like to add to your inventory?");
                    String itemName = game.getParser().getString();
                    //TODO implement logic
                    System.out.println(itemName + " was not added to your inventory due to not implemented method.");

                    break;
                case "help":
                    printPossibleCommands();
                    break;
                case "q":
                    System.out.println("Thank you for playing Zork.");
                    return;
                default:
                    System.out.println("try another command");
            }
        }while(true);

    }

}
