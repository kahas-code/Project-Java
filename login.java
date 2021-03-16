import java.util.Scanner;
public class login{
	public static void main(String[] args){
		Scanner uname=new Scanner(System.in);
		Scanner pw=new Scanner(System.in);

		String nama_pengguna[]={"khairul", "beni", "iwan"}, nama; 
		String passwd[]={"202013035", "202013025", "202013028"}, sandi;
		System.out.println("==========================================================");
		System.out.println("                  Selamat Datang di                       ");
		System.out.println("                 Aplikassi Sederhana                      ");
		System.out.println("==========================================================");
		System.out.println("Masukkan Nama Pengguna :");
		nama = uname.nextLine();
		System.out.println("Masukkan Sandi");
		sandi=pw.nextLine();

		if (nama.equals(nama_pengguna[0]) && sandi.equals(passwd[0])) {
			menu();
		}
		else if (nama.equals (nama_pengguna[1]) && sandi.equals(passwd[1])) {
			menu();
		}
		else if (nama.equals(nama_pengguna[2]) && sandi.equals(passwd[2])) {
			menu();
		}
		else {
			System.out.println("Maaf Nama Pengguna atau sandi Anda salah");
		}
	}

	static void menu(){
		int menu;
		Scanner h1=new Scanner(System.in);
		System.out.println("==========================================================");
		System.out.println("                  Selamat Datang di                       ");
		System.out.println("                 Aplikassi Sederhana                      ");
		System.out.println("                        Java                              ");
		System.out.println("==========================================================");
		System.out.println("Silahkan pilih Aplikasi :");
		System.out.println("1. Aplikasi Kasir");
		System.out.println("2. Aplikasi Perhitungan Luas");
		System.out.println("3. Aplikasi Perhitungan Volume");
		System.out.println("4. Aplikasi Pengurutan Data");
		System.out.println("5. Menu Keluar");
		System.out.println("==========================================================");
		menu=h1.nextInt();
		if (menu==1) {
			Kasir();	
		}
		else if (menu==2){
			PerhitunganLuas();	
		}
		else if (menu==3){
			PerhitunganVolume();	
		}
		else if (menu==4){
			PengurutanData();	
		}
		else if (menu==5){
			System.exit(0);	
		}
		else {
			System.out.println("Maaf tidak ada Menu untuk inputan Anda");
			menu();
		}
	}
	static void Kasir(){
		int menu;
		Scanner h1=new Scanner(System.in);
		System.out.println("==========================================================");
		System.out.println("                  Selamat Datang di                       ");
		System.out.println("                     POLKAM MART                          ");
		System.out.println("                        Kasir                             ");
		System.out.println("==========================================================");
		System.out.println("Silahkan pilih menu :");
		System.out.println("1. Menu Penjualan");
		System.out.println("2. Menu Stok");
		System.out.println("3. Menu Tambah Data");
		System.out.println("4. Menu Utama");
		System.out.println("5. Menu Keluar");
		System.out.println("==========================================================");
		menu=h1.nextInt();
		if (menu==1) {
			Penjualan();	
		}
		else if (menu==2){
			Stok();	
		}
		else if (menu==3){
			TambahData();	
		}
		else if (menu==4){
			menu();	
		}
		else if (menu==5){
			System.exit(0);	
		}
		else {
			System.out.println("Maaf tidak ada Menu untuk inputan Anda");
			menu();
		}
	}
		static void Penjualan(){
			String barang[]={"Popmie", "Es Lilin", "Kerupuk"};
			int harga[]={5000, 1000, 500}, total;
			int jumlah[]=new int[3];
			Scanner h1=new Scanner(System.in);
			System.out.println("==========================================================");
			System.out.println("                     POLKAM MART                          ");
			System.out.println("                        Kasir                             ");
			System.out.println("==========================================================");
			System.out.println("  Nama barang                                   harga       ");
			System.out.println("  "+barang[0]+"                                        Rp."+harga[0]);
			System.out.println("  "+barang[1]+"                                      Rp."+harga[1]);
			System.out.println("  "+barang[2]+"                                       Rp."+harga[2]);
			System.out.print("Masukkan jumlah barang pertama: ");
			jumlah[0]=h1.nextInt();
			System.out.print("Masukkan jumlah barang kedua: ");
			jumlah[1]=h1.nextInt();
			System.out.print("Masukkan jumlah barang ketiga: ");
			jumlah[2]=h1.nextInt();

			total=(harga[0]*jumlah[0])+(harga[1]*jumlah[1])+(harga[2]*jumlah[2]);
			int jmlh;
			jmlh=jumlah[0]+jumlah[1]+jumlah[2];

			System.out.println("     List barang            harga barang         jumlah      ");
			System.out.println("     "+barang[0]+"                 Rp. "+harga[0]+"               "+jumlah[0]);
			System.out.println("     "+barang[1]+"               Rp. "+harga[1]+"               "+jumlah[1]);
			System.out.println("     "+barang[2]+"                Rp. "+harga[2]+"                "+jumlah[2]);
			System.out.println("      Total                                       Rp. "+total);
			System.out.print("Masukkan pembayaran: ");
			int bayar;
			bayar=h1.nextInt();
			System.out.println("Kembalian : Rp. "+(bayar-total));	
			Kasir();
		}
		static void Stok(){
			Scanner pauser=new Scanner(System.in);
			System.out.println("==========================================================");
			System.out.println("                     POLKAM MART                          ");
			System.out.println("                        Kasir                             ");
			System.out.println("==========================================================");
			System.out.println("  Nama barang                                 jumlah      ");
			System.out.println("   Popmie                                       10        ");
			System.out.println("  Es Lilin                                      15        ");
			System.out.println("  Kerupuk                                       20        ");
			System.out.println("==========================================================");
			pauser.nextLine();
			System.out.println("\033[H\033[2J");
			System.out.flush();
			Kasir();
		}
		static void TambahData(){
			Scanner terima=new Scanner(System.in);
			Scanner input=new Scanner(System.in);
			System.out.println("==========================================================");
			System.out.println("                     POLKAM MART                          ");
			System.out.println("                        Kasir                             ");
			System.out.println("==========================================================");
			System.out.print("Masukkan banyaknya data yang ingin di inputkan : ");
			int n=input.nextInt();
			String barang[]=new String[n];
			int harga[]=new int [n];
			int jumlah[]=new int[n];
			for (int i=0;i<n ;i++ ){
				System.out.print("Masukkan Nama barang ke "+(i+1)+" : ");
				barang[i]=terima.nextLine();
				System.out.print("Masukkan Harga barang ke "+(i+1)+" : ");
				harga[i]=input.nextInt();
				System.out.print("Masukkan jumlah barang ke "+(i+1)+" : ");
				jumlah[i]=input.nextInt();
				System.out.println("Penginputan barang ke "+(i+1)+"telah selesai");
				System.out.println("======================================");
			}
			System.out.println();
			int total=0;	
			System.out.println("Barang yang diinputkan adalah sebagai berikut");
			for (int i=0;i<n ;i++ ) {
				System.out.println("Nama barang ke "+(i+1)+" "+barang[i]+"  Harga barang ke "+(i+1)+" "+harga[i]+"  Jumlah barang ke "+(i+1)+" "+jumlah[i]);
				total =total +(harga[i]*jumlah[i]);
			}
			System.out.println("Total harga adalah Rp."+total);	
			Kasir();
		}
	static void PerhitunganLuas(){
		Scanner terima=new Scanner(System.in);
		String perhitungan[]={"Luas Segitiga", "Luas Persegi", "Luas Persegi Panjang", "Luas Layang-layang", "Luas Lingkaran", "Luas Jajar-genjang", "Luas Belah Ketupat", "Luas Trapesium", "Menu Utama"};
		System.out.println("============================================================================");
		System.out.println("=                    Program Menghitung Luas Bangun Datar                  =");
		System.out.println("============================================================================");
		System.out.println("Silahkan Pilih Program yang ingin digunakan");
		for (int i=0;i<perhitungan.length; i++ ) {
			System.out.println(i+". "+perhitungan[i]);
		}
		System.out.println("6. Keluar");
		System.out.print("Pilih :");
		int pilih;
		pilih=terima.nextInt();

		switch(pilih){
			case 1:
				System.out.println("=========================================");
				System.out.println("=        Perhitungan Luas Segitiga      =");
				System.out.println("=========================================");
				System.out.println(" ");
				int panjang, alas, luas;
				System.out.print("Masukkan Alas : ");
				alas=terima.nextInt();
				System.out.print("Masukkan Tinggi : ");
				panjang=terima.nextInt();
				luas=(panjang * alas)/2;
				System.out.println(" ");
				System.out.println("Luas Segitiga Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;			
			
			case 2:
				System.out.println("=========================================");
				System.out.println("=        Perhitungan Luas Persegi       =");
				System.out.println("=========================================");
				System.out.println(" ");
				int sisi;
				System.out.print("Masukkan Panjang Sisi : ");
				sisi=terima.nextInt();
				luas=(sisi * 2);
				System.out.println(" ");
				System.out.println("Luas Persegi Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;				
			
			case 3:
				System.out.println("=========================================");
				System.out.println("=   Perhitungan Luas Persegi Panjang    =");
				System.out.println("=========================================");
				System.out.println(" ");
				int lebar;
				System.out.print("Masukkan Panjang : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan lebar : ");
				lebar=terima.nextInt();
				luas=(panjang * lebar);
				System.out.println(" ");
				System.out.println("Luas Persegi Panjang Anda adalah:"+luas+"cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;			
			
			case 4:
				System.out.println("=========================================");
				System.out.println("=    Perhitungan Luas Layang-layang     =");
				System.out.println("=========================================");
				System.out.println(" ");
				int diagonal_1, diagonal_2;
				System.out.print("Masukkan Panjang Diagonal 1 : ");
				diagonal_1=terima.nextInt();
				System.out.print("Masukkan Panjang Diagonal 2 : ");
				diagonal_2=terima.nextInt();
				luas=(diagonal_2*diagonal_1)/2;
				System.out.println(" ");
				System.out.println("Luas Layang-layang Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;
			
			case 5:
				System.out.println("=========================================");
				System.out.println("=      Perhitungan Luas Lingkaran       =");
				System.out.println("=========================================");
				System.out.println(" ");
				int r;
				Double pi=3.14, luaslingkaran;
				System.out.println("Masukkan Jari-jari Lingkaran : ");
				r=terima.nextInt();
				luaslingkaran=(pi*r*r);
				System.out.println(" ");
				System.out.println("Luas Lingkaran Anda adalah : "+luaslingkaran+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;	
			case 6:
				System.out.println("=========================================");
				System.out.println("=    Perhitungan Luas Jajar Genjang     =");
				System.out.println("=========================================");
				System.out.println(" ");
				System.out.println("Masukkan Panjang Alas : ");
				panjang=terima.nextInt();
				System.out.println("Masukkan Tinggi : ");
				alas=terima.nextInt();
				luas=(panjang*alas);
				System.out.println(" ");
				System.out.println("Luas Jajar Genjang Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;	
			case 7:
				System.out.println("=========================================");
				System.out.println("=    Perhitungan Luas Belah Ketupat     =");
				System.out.println("=========================================");
				System.out.println(" ");
				System.out.print("Masukkan Panjang Diagonal 1 : ");
				diagonal_1=terima.nextInt();
				System.out.print("Masukkan Panjang Diagonal 2 : ");
				diagonal_2=terima.nextInt();
				luas=(diagonal_2*diagonal_1)/2;
				System.out.println(" ");
				System.out.println("Luas Belah Ketupat Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;
			case 8:
				System.out.println("=========================================");
				System.out.println("=      Perhitungan Luas Trapesium       =");
				System.out.println("=========================================");
				System.out.println(" ");
				int a, b, t;
				System.out.println("Masukkan Sisi Atas : ");
				a=terima.nextInt();
				System.out.println("Masukkan Sisi Bawah : ");
				b=terima.nextInt();
				System.out.println("Masukkan Tinggi : ");
				t=terima.nextInt();
				luas=t*(a+b)/2;
				System.out.println(" ");
				System.out.println("Luas Trapesium Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;	
			case 9:
				menu();
			case 10: 
				System.exit(0);
				break;
			default:
				System.out.print("Maaf tidak ada Menu untuk inputan Anda");
				PerhitunganLuas();
			
		}
	}	
	static void PerhitunganVolume(){
		Scanner terima=new Scanner(System.in);
		String perhitungan[]={"Volume Pisma Segitiga","Volume Limas Segi Empat", "Volume Limas Segitiga", "Volume Kubus","Volume Balok","Volume Tabung","Volume Kerucut", "Volume Bola", "Menu Utama"};
		System.out.println("============================================================================");
		System.out.println("=                    Program Menghitung Luas Bangun Datar                  =");
		System.out.println("============================================================================");
		System.out.println("Silahkan Pilih Program yang ingin digunakan");
		for (int i=0;i<perhitungan.length; i++ ) {
			System.out.println(i+". "+perhitungan[i]);
		}
		System.out.println("6. Keluar");
		System.out.print("Pilih :");
		int pilih;
		pilih=terima.nextInt();

		switch(pilih){
			case 1:
				System.out.println("=========================================");
				System.out.println("=  Perhitungan Volume Prisma Segitiga   =");
				System.out.println("=========================================");
				System.out.println(" ");
				int panjang, alas, tinggi, volume;
				System.out.print("Masukkan Tinggi Segitiga : ");
				alas=terima.nextInt();
				System.out.print("Masukkan Alas Segitiga : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan tinggi Prisma Segitiga : ");
				tinggi=terima.nextInt();
				volume=(panjang * alas*tinggi)/2;
				System.out.println(" ");
				System.out.println("Luas Prisma Segitiga Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;			
			
			case 2:
				System.out.println("=========================================");
				System.out.println("=  Perhitungan Volume Limas Segi Empat  =");
				System.out.println("=========================================");
				System.out.println(" ");
				int lebar;
				System.out.print("Masukkan Panjang segi empat : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan lebar segi empat : ");
				lebar=terima.nextInt();
				System.out.print("Masukkan tinggi limas  : ");
				tinggi=terima.nextInt();
				volume=(panjang*lebar*tinggi)/3;
				System.out.println(" ");
				System.out.println("Luas Limas Segi empat Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;				
			
			case 3:
				System.out.println("=========================================");
				System.out.println("=  Perhitungan Volume Limas Segitiga    =");
				System.out.println("=========================================");
				System.out.println(" ");
				System.out.print("Masukkan Tinggi Segitiga : ");
				alas=terima.nextInt();
				System.out.print("Masukkan Alas Segitiga : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan tinggi limas Segitiga : ");
				tinggi=terima.nextInt();
				volume=tinggi*((alas*panjang)/2)/3;
				System.out.println(" ");
				System.out.println("volume limmas segitiga Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;			
			
			case 4:
				System.out.println("=========================================");
				System.out.println("=       Perhitungan Volume Kubus        =");
				System.out.println("=========================================");
				System.out.println(" ");
				int sisi;
				System.out.print("Masukkan Panjang Sisi :");
				sisi=terima.nextInt();
				volume=(sisi * 3);
				System.out.println(" ");
				System.out.println("Luas Kubus Anda adalah : "+volume+"cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;
			
			case 5:
				System.out.println("=========================================");
				System.out.println("=       Perhitungan Volume Balok        =");
				System.out.println("=========================================");
				System.out.println(" ");
				System.out.println("Masukkan Panjang :");
				panjang=terima.nextInt();
				System.out.print("Masukkan Lebar :");
				lebar=terima.nextInt();
				System.out.print("Masukkan Tinggi :");
				tinggi=terima.nextInt();
				volume=(panjang * lebar * tinggi);
				System.out.println(" ");
				System.out.println("Luas Balok Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;	
			case 6:
				System.out.println("=========================================");
				System.out.println("=       Perhitungan Volume Tabung       =");
				System.out.println("=========================================");
				System.out.println(" ");
				int r;
				Double pi, volumed;
				pi=3.14;
				System.out.println("Masukkan Jari-jari: ");
				r=terima.nextInt();
				System.out.println("Masukkan Tinggi : ");
				tinggi=terima.nextInt();
				volumed=(pi*r*r*tinggi);
				System.out.println(" ");
				System.out.println("Luas Jajar Genjang Anda adalah : "+ volumed +" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;	
			case 7:
				System.out.println("=========================================");
				System.out.println("=       Perhitungan Volume Kerucut      =");
				System.out.println("=========================================");
				System.out.println(" ");
				pi=3.14;
				System.out.println("Masukkan Jari-jari: ");
				r=terima.nextInt();
				System.out.println("Masukkan Tinggi kerucut: ");
				tinggi=terima.nextInt();
				volumed=(pi*r*r*tinggi)/3;
				System.out.println(" ");
				System.out.println("Luas Belah Ketupat Anda adalah : "+volumed+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;
			case 8:
				System.out.println("=========================================");
				System.out.println("=        Perhitungan Volume Bola        =");
				System.out.println("=========================================");
				System.out.println(" ");
				pi=3.14;
				System.out.println("Masukkan Jari-jari Bola : ");
				r=terima.nextInt();
				volumed=(4*pi*r*r*r)/3;
				System.out.println(" ");
				System.out.println("Luas Trapesium Anda adalah : "+volumed+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;				
			case 9:
				menu();
			case 10: 
				System.exit(0);
				break;
			default:
				System.out.print("Maaf tidak ada Menu untuk inputan Anda");
				PerhitunganVolume();
		}
	}
	static void PengurutanData(){
		Scanner terima=new Scanner(System.in);
		int n;
		System.out.println("=========================================");
		System.out.println("=             Pengurutan Data           =");
		System.out.println("=========================================");
		System.out.println();
		System.out.println("Masukkan jumlah data yang ingin diurutkan");
		n=terima.nextInt();
		int data[]=new int [n];
		System.out.println("Masukkan isi data yang ingin diurutkan");
		for (int i=0; i<n; i++ ){
			data[i]=terima.nextInt();
		}
		System.out.println("Proses input data selesai");
		System.out.println("=========================================");
		System.out.println();
		System.out.print("Data yang Anda masukkan adalah : ");
		for (int j=0;j<n;j++ ){
			System.out.print(data[j]+" ");
		}
		System.out.println();
		int tmp;
		for (int i=0;i<data.length;i++){
			for (int j=0;j<(data.length-1);j++ ) {
				if (data[j]>data[j+1]){
					 tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}
		System.out.print("Data sesudah dirutkan : ");
		for (int k=0;k<n ;k++ ) {
			System.out.print(data[k]+" ");
		}
		System.out.println();
		System.out.println("Proses pengurutan data selesai");
		System.out.println("=========================================");
		menu();
	}
}