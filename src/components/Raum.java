package components;

public class Raum {

    private Crossing north;
    private Crossing east;
    private Crossing south;
    private Crossing west;

    public Raum(Crossing north, Crossing east, Crossing south, Crossing west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public Crossing getNorth() {
        return north;
    }

    public void setNorth(Crossing north) {
        this.north = north;
    }

    public Crossing getEast() {
        return east;
    }

    public void setEast(Crossing east) {
        this.east = east;
    }

    public Crossing getSouth() {
        return south;
    }

    public void setSouth(Crossing south) {
        this.south = south;
    }

    public Crossing getWest() {
        return west;
    }

    public void setWest(Crossing west) {
        this.west = west;
    }

    public String describeCrossing(Crossing crossing) {
        String desc = "";
        switch (crossing) {
            case WALL:
                desc = "wall.";
                break;
            case OPEN_DOOR:
                desc = "open door.";
                break;
            case CLOSED_DOOR:
                desc = "closed door.";
                break;
        }
        return desc;
    }

    public void showNorth() {

        String desc = describeCrossing(this.north);
        System.out.println("To the north is a " + desc);

        //Todo: list items on north side
    }

    public void showEast() {

        String desc = describeCrossing(this.north);
        System.out.println("To the north is a " + desc);

        //Todo: list items on east side
    }

    public void showSouth() {

        String desc = describeCrossing(this.north);
        System.out.println("To the north is a " + desc);

        //Todo: list items on south side
    }

    public void showWest() {

        String desc = describeCrossing(this.north);
        System.out.println("To the north is a " + desc);

        //Todo: list items on west side
    }

    public boolean isCrossable(Crossing crossing){
        boolean crossable = false;
        switch (crossing) {
            case OPEN_DOOR:
                crossable = true;
                break;
            default:
                break;
        }
        return crossable;
    }

    public boolean isNorthCrossable() {
        return isCrossable(this.north);
    }

    public boolean isEastCrossable() {
        return isCrossable(this.east);
    }

    public boolean isSouthCrossable() {
        return isCrossable(this.south);
    }

    public boolean isWestCrossable() {
        return isCrossable(this.west);
    }
}
