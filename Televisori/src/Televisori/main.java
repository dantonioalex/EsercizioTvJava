package Televisori;

public class main {

	public static void main(String[] args) throws Exception {
		Samsung tvSam = new Samsung("a52", 30, 12);
		tvSam.SetCanale(6, "Italia1", 690);
		tvSam.SetCanale(9, "La7", 800);
		tvSam.SetCanale(1, "Rai1", 600);
		tvSam.SetCanale(9, "La7", 700);
		System.out.println(tvSam.toString());

	}

}
