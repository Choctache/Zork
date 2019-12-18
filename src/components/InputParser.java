package components;

import java.util.Scanner;

public class InputParser {

    private Scanner console;

    public InputParser(){
        this.console = new Scanner(System.in);
    }

    public String getString(){
        return this.console.nextLine();
    }

}
