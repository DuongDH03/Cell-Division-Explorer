import cell.*;
import division.*;

public class CellDivisionExplorer {

	public static void main(String[] args) {
		Prokaryotic eu1 = new Prokaryotic("POg", null);
		System.out.println(eu1.getAsexual());
		System.out.println(eu1.getSexual());
		System.out.println(eu1.getImageDirectory());
	}

}
