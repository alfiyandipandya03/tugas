/*
NAMA  : Alfiyandi Pandya Khalfani
KELAS : IF 1
NIM   : 10119007

*/
public class IF1_10119007_Latihan5_KambingGlobal {
	//variabel
	int jumlahKambing = 88;

public void getJumlahKambing() {
	System.out.println("Jumlah Kambing: " + jumlahKambing);
}

public void tambahKambing() {
	jumlahKambing = jumlahKambing + 5;
	System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
}
public static void main(String[] args) {
	KambingGlobal kambingSusu = new KambingGlobal();
	kambingSusu.getJumlahKambing();
	kambingSusu.tambahKambing();
	kambingSusu.getJumlahKambing();
}
}