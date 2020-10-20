/*
NAMA  : Alfiyandi Pandya Khalfani
KELAS : IF 1
NIM   : 10119007

*/
public class IF1_10119007_Latihan6_KambingStatic {
	//variabel
	public static int jumlahKambing;
}
public class KambingStatic {
	//NAMA_KAMBING sebagai konstanta
	public static final String NAMA_KAMBING = "MIDUN";

	public static void main(String[] args) {
		Mamalia.jumlahKambing = 485000;
		System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
	}
}