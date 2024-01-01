package cell;

import java.util.ArrayList;

import division.*;

public class Prokaryotic extends Cell{
    public Prokaryotic(String cellName, ArrayList<Component> components) {
        super(cellName, components);
        this.asexual = new Amitosis();
        this.sexual = null;
        this.imageDirectory = "/resource/images/prokaryotic.png";
    }

}
