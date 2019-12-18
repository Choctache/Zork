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
}
