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
        void menumakanan();
        void menuminuman();
        void total();
        void print();
    }
    
    class nota implements pesanan
    {
        Scanner userInput = new Scanner(System.in);
        String pembeli;
        int pil, harga, totalmakanan, totalminuman;
        int jml1, jml2, jml3, jml4, jml5, jml6, jml7, jml8, jml9, jml10;
        int totalbakso, totalmieayam, totalnasigoreng, totalmiegoreng, totalmierebus;
        int totalteh, totaljeruk, totaldegan, totalkopi, totalcincau;
    
        @Override
        public void setpembeli()
        {
            System.out.print("Nama Pembeli : ");
            pembeli = userInput.nextLine();
            System.out.print("\n");
            System.out.println("Selamat Datang " + pembeli);
            System.out.print("\n");
        }
    
        @Override
        public void setmakanan()
        {
            System.out.println("MENU MAKANAN : ");
            System.out.println("1. Bakso            RP 10.000");
            System.out.println("2. Mie Ayam         RP 7.000");
            System.out.println("3. Nasi Goreng      RP 13.000");
            System.out.println("4. Mie Goreng       RP 13.000");
            System.out.println("5. Mie Rebus        RP 7.000");
            System.out.print("Masukkan pilihan anda : ");
            pil = userInput.nextInt();
            System.out.print("\n");
    
            if(pil == 1)
            {
                harga = 10000;
                System.out.println("BAKSO");
                System.out.print("Jumlah pesan bakso : ");
                jml1 = userInput.nextInt();
                totalbakso = harga*jml1;
    
            }else if(pil==2)
            {
                harga = 7000;
                System.out.println("MIE AYAM");
                System.out.print("Jumlah pesan mie ayam : ");
                jml2 = userInput.nextInt();
                totalmieayam = harga*jml2;
    
            }else if(pil==3)
            {
                harga = 13000;
                System.out.println("NASI GORENG");
                System.out.print("Jumlah pesan nasi goreng : ");
                jml3 = userInput.nextInt();
                totalnasigoreng = harga*jml3;
    
            }else if(pil==4)
            {
                harga = 13000;
                System.out.println("MIE GORENG");
                System.out.print("Jumlah pesan mie goreng : ");
                jml4 = userInput.nextInt();
                totalmiegoreng = harga*jml4;
    
            }else if(pil==5)
            {
                harga = 7000;
                System.out.println("MIE REBUS");
                System.out.print("Jumlah pesan mie rebus : ");
                jml5 = userInput.nextInt();
                totalmierebus = harga*jml5;
    
            }else{
                System.out.println("MENU TIDAK TERSEDIA!");
            }
        }
    
        @Override
        public void setminuman()
        {
            System.out.println("MENU MINUMAN : ");
            System.out.println("1. Es Teh            RP 3.000");
            System.out.println("2. Es Jeruk          RP 3.000");
            System.out.println("3. Es Degan          RP 8.000");
            System.out.println("4. Es Kopi           RP 4.000");
            System.out.println("5. Es Cincau         RP 3.000");
            System.out.print("Masukkan pilihan anda : ");
            pil = userInput.nextInt();
            System.out.print("\n");
    
            if(pil == 1)
            {
                harga = 3000;
                System.out.println("ES TEH");
                System.out.print("Jumlah pesan teh : ");
                jml6 = userInput.nextInt();
                totalteh = harga*jml6;
    
            }else if(pil==2)
            {
                harga = 3000;
                System.out.println("ES JERUK");
                System.out.print("Jumlah pesan jeruk : ");
                jml7 = userInput.nextInt();
                totaljeruk = harga*jml7;
    
            }else if(pil==3)
            {
                harga = 8000;
                System.out.println("ES DEGAN");
                System.out.print("Jumlah pesan degan : ");
                jml8 = userInput.nextInt();
                totaldegan = harga*jml8;
    
            }else if(pil==4)
            {
                harga = 4000;
                System.out.println("ES KOPI");
                System.out.print("Jumlah pesan kopi : ");
                jml9 = userInput.nextInt();
                totalkopi = harga*jml9;
    
            }else if(pil==5)
            {
                harga = 3000;
                System.out.println("ES CINCAU");
                System.out.print("Jumlah pesan cincau : ");
                jml10 = userInput.nextInt();
                totalcincau = harga*jml10;
    
            }else{
                System.out.println("MENU TIDAK TERSEDIA!");
            }
        }
    
        @Override
        public void menumakanan(){
            System.out.println("Bakso       x " + jml1 + " = " + totalbakso);
            System.out.println("Mie Ayam    x " + jml2 + " = " + totalmieayam);
            System.out.println("Nasi Goreng x " + jml3 + " = " + totalnasigoreng);
            System.out.println("Mie Goreng  x " + jml4 + " = " + totalmiegoreng);
            System.out.println("Mie Rebus   x " + jml5 + " = " + totalmierebus);
        }
    
        @Override
        public void menuminuman() {
            System.out.println("Es Teh      x " + jml6 + " = " + totalteh);
            System.out.println("Es Jeruk    x " + jml7 + " = " + totaljeruk);
            System.out.println("Es Degan    x " + jml8 + " = " + totaldegan);
            System.out.println("Es Kopi     x " + jml9 + " = " + totalkopi);
            System.out.println("Es Cincau   x " + jml10 + " = " + totalcincau);
        }
    
        @Override
        public void total()
        {
            int totalseluruh;
            totalmakanan = totalbakso + totalmieayam + totalnasigoreng + totalmiegoreng + totalmierebus;
            totalminuman = totalteh + totaljeruk + totaldegan + totalkopi + totalcincau;
            totalseluruh = totalmakanan + totalminuman;
            System.out.print("\n");
            System.out.println("TOTAL           = " + totalseluruh);
        }
    
        @Override
        public void print()
        {   System.out.print("\n");
            System.out.println("=======================");
            System.out.println("NOTA WAROENG MAKAN QITA");
            System.out.println("=======================");
            System.out.println("Nama pembeli : " + pembeli);
            System.out.println("\nMenu makanan : ");
            menumakanan();
            System.out.println("\nMenu minuman : ");
            menuminuman();
            total();
            System.out.println("=======================");
            System.out.println("     TERIMA KASIH      ");
            System.out.println("=======================\n");
        }

        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            int pilihmenu, lagi;
            nota nota = new nota();
            System.out.println("\n**WAROENG MAKAN QITA**");
            nota.setpembeli();
            do{
                System.out.println("PESAN APA? ");
                System.out.println("1. Makanan");
                System.out.println("2. Minuman");
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
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan anda : ");
                lagi = userInput.nextInt();
                System.out.print("\n");
            }while(lagi == 1);
            nota.print();
        }
    }
