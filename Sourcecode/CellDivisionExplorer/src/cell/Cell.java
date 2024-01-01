package cell;

import java.util.ArrayList;

import division.AsexualDivision;
import division.SexualDivision;

public class Cell {
	private String cellName = new String();
	private ArrayList<Component> components = new ArrayList<Component>();
	protected String imageDirectory;
	protected AsexualDivision asexual;
	protected SexualDivision sexual;
	
	public Cell (String cellName, ArrayList<Component> components) {
		super();
		this.cellName = cellName;
		this.components = components;
	}
	
	public String getCellName() {
		return this.cellName;
	}
	
	public ArrayList<Component> getComponents() {
		return this.components;
	}
	
	public String getImageDirectory() {
		return this.imageDirectory;
	}
	
	public AsexualDivision getAsexual() {
		return this.asexual;
	}

	public SexualDivision getSexual() {
		return this.sexual;
	}
	
}
