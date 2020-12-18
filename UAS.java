/*  TUGAS UAS PEMROGRAMAN BERORIENTASI OBJEK
    APLIKASI SEDERHANA NOTA MAKANAN
    KHARISMAHARANI AISYAH PUTRI
    19051397015
    D4 MANAJEMEN INFORMATIKA 2019A  */
import java.util.*;
interface pesanan
{
    void setpembeli();
    void setmakanan();
    void setminuman();
    void total();
    void print();
}

class nota implements pesanan
{
    Scanner userInput = new Scanner(System.in);
    String pembeli;
    int pil, jml, harga, totalmakanan, totalminuman;
    int totalbakso, totalmieayam, totalnasigoreng, totalmiegoreng, totalmierebus;
    int totalteh, totaljeruk, totaldegan, totalkopi, totalcincau;

    @Override
    public void setpembeli()
    {
        System.out.print("Nama Pembeli : ");
        pembeli = userInput.nextLine();
        System.out.println("Selamat Datang " + pembeli);
        System.out.print("\n");
    }

    @Override
    public void setmakanan()
    {
        System.out.println("MENU MAKANAN : ");
        System.out.println("1. BAKSO            RP 10.000");
        System.out.println("2. MIE AYAM         RP 7.000");
        System.out.println("3. NASI GORENG      RP 13.000");
        System.out.println("4. MIE GORENG       RP 13.000");
        System.out.println("5. MIE REBUS        RP 7.000");
        System.out.print("Masukkan pilihan anda : ");
        pil = userInput.nextInt();
        System.out.print("\n");

        if(pil == 1)
        {
            harga = 10000;
            System.out.println("BAKSO");
            System.out.print("Jumlah pesan bakso : ");
            jml = userInput.nextInt();
            totalbakso = harga*jml;
            System.out.println("Total harga : " + totalbakso);
        }else if(pil==2)
        {
            harga = 7000;
            System.out.println("MIE AYAM");
            System.out.print("Jumlah pesan mie ayam : ");
            jml = userInput.nextInt();
            totalmieayam = harga*jml;
            System.out.println("Total harga : " + totalmieayam);
        }else if(pil==3)
        {
            harga = 13000;
            System.out.println("NASI GORENG");
            System.out.print("Jumlah pesan nasi goreng : ");
            jml = userInput.nextInt();
            totalnasigoreng = harga*jml;
            System.out.println("Total harga : " + totalnasigoreng);
        }else if(pil==4)
        {
            harga = 13000;
            System.out.println("MIE GORENG");
            System.out.print("Jumlah pesan mie goreng : ");
            jml = userInput.nextInt();
            totalmiegoreng = harga*jml;
            System.out.println("Total harga : " + totalmiegoreng);
        }else if(pil==5)
        {
            harga = 7000;
            System.out.println("MIE REBUS");
            System.out.print("Jumlah pesan mie rebus : ");
            jml = userInput.nextInt();
            totalmierebus = harga*jml;
            System.out.println("Total harga : " + totalmierebus);
        }else{
            System.out.println("MENU TIDAK TERSEDIA!");
        }
    }

    @Override
    public void setminuman()
    {
        System.out.println("MENU MINUMAN : ");
        System.out.println("1. ES TEH            RP 3.000");
        System.out.println("2. ES JERUK          RP 3.000");
        System.out.println("3. ES DEGAN          RP 8.000");
        System.out.println("4. ES KOPI           RP 4.000");
        System.out.println("5. ES CINCAU         RP 3.000");
        System.out.print("Masukkan pilihan anda : ");
        pil = userInput.nextInt();
        System.out.print("\n");

        if(pil == 1)
        {
            harga = 3000;
            System.out.println("TEH");
            System.out.print("Jumlah pesan teh : ");
            jml = userInput.nextInt();
            totalteh = harga*jml;
            System.out.println("Total harga : " + totalteh);
        }else if(pil==2)
        {
            harga = 3000;
            System.out.println("JERUK");
            System.out.print("Jumlah pesan jeruk : ");
            jml = userInput.nextInt();
            totaljeruk = harga*jml;
            System.out.println("Total harga : " + totaljeruk);
        }else if(pil==3)
        {
            harga = 8000;
            System.out.println("DEGAN");
            System.out.print("Jumlah pesan degan : ");
            jml = userInput.nextInt();
            totaldegan = harga*jml;
            System.out.println("Total harga : " + totaldegan);
        }else if(pil==4)
        {
            harga = 4000;
            System.out.println("KOPI");
            System.out.print("Jumlah pesan kopi : ");
            jml = userInput.nextInt();
            totalkopi = harga*jml;
            System.out.println("Total harga : " + totalkopi);
        }else if(pil==5)
        {
            harga = 3000;
            System.out.println("CINCAU");
            System.out.print("Jumlah pesan cincau : ");
            jml = userInput.nextInt();
            totalcincau = harga*jml;
            System.out.println("Total harga : " + totalcincau);
        }else{
            System.out.println("MENU TIDAK TERSEDIA!");
        }
    }

    @Override
    public void total()
    {
            int totalseluruh;
            totalmakanan = totalbakso + totalmieayam + totalnasigoreng + totalmiegoreng + totalmierebus;
            totalminuman = totalteh + totaljeruk + totaldegan + totalkopi + totalcincau;
            totalseluruh = totalmakanan + totalminuman;
            System.out.print("\n");
            System.out.println("Makanan : " + totalmakanan);
            System.out.println("Minuman : " + totalminuman);
            System.out.println("Total   : " + totalseluruh);
    }

    @Override
    public void print()
    {   System.out.print("\n");
        System.out.println("=======================");
        System.out.println("NOTA WAROENG MAKAN QITA");
        System.out.println("=======================");
        System.out.println("Nama pembeli : " + pembeli);
        total();
        System.out.println("=======================");
        System.out.println("      TERIMAKASI       ");
        System.out.println("=======================");
        
    }

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int pilihmenu, lagi;
    nota nota = new nota();
        do {
            System.out.println("\n**WAROENG MAKAN QITA**");
            nota.setpembeli();
            System.out.println("PESAN APA? ");
            System.out.println("1. MAKANAN");
            System.out.println("2. MINUMAN");
            System.out.print("Masukkan pilihan anda : ");
            pilihmenu = userInput.nextInt();
            System.out.print("\n");
            if(pilihmenu == 1)
            {
                nota.setmakanan();
            }else if(pilihmenu == 2)
            {
                nota.setminuman();
            }
            System.out.println("\nPESAN LAGI?");
            System.out.println("1. YA");
            System.out.println("2. TIDAK");
            System.out.print("Masukkan pilihan anda : ");
            lagi = userInput.nextInt();
        }while(lagi == 1);
        nota.print();
    }
}

