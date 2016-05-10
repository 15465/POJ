import MyPack2.*;
import MyPack1.*;

//class Balance {
//	String name;
//	double bal;
//
//	public Balance(String n, double b) {
//		name = n;
//		bal = b;
//	}
//
//	public void show() {
//		if (bal < 0)
//			System.out.println("==>");
//		System.out.println(name + "----: USD " + bal);
//	}
//}

class TestBalance {
	public static void main(String args[]) {

		// poniewaz klasa Balance w pakiecie MyPack2 jest publiczna
		// mozemy jej uzywac oraz wywolywac jej publiczny konstruktor
		MyPack1.Balance current[] = new MyPack1.Balance[3];

		current[0] = new MyPack1.Balance("J.F.K", -8888.8888);
		current[1] = new MyPack1.Balance("W. Tell", 9989.9989);
		current[2] = new MyPack1.Balance("T.B.", 1212.1212);

		// takze metoda show jest dostępna
		for (int i = 0; i < 3; i++)
			current[i].show();
	}
}
