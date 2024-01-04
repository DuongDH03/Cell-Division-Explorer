import cell.*;
import division.*;

public class CellDivisionExplorer {

	public static void main(String[] args) {
		Eukaryotic eu1 = new Eukaryotic("POg", null);
		System.out.println(eu1.getAsexual().getDivision());
		System.out.println(eu1.getSexual().getDivision());
		System.out.println(eu1.getImageDirectory());
		System.out.print(eu1.getAsexual().getVideoDirectory());
	}

}
