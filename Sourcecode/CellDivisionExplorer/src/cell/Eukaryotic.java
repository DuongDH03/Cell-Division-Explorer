package cell;

import java.util.ArrayList;

import division.*;

public class Eukaryotic extends Cell{
    public Eukaryotic(String cellName, ArrayList<Component> components) {
        super(cellName, components);
        this.asexual = new Mitosis();
        this.sexual = new Meiosis();
        this.imageDirectory = "/resource/images/eukaryotic.png";
    }

}
