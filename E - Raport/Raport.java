
import java.util.Scanner;


public class Raport extends MainRaport{
    
    
public void P() {

     double Bindo[] = new double[5];
     double Mat[] = new double[5];
     double Fisika[] = new double[5];
     double Bing[] = new double[5];
     double Rata[] = new double[5];
      String PredikatBindo = null;
      String PredikatMat = null;
      String PredikatBing = null;
      String PredikatFisika = null;
      String Hasil;
      String Nama[] = new String[5];
      String Kelas[] = new String[5];
     int Absen[] = new int[5];
     int Pilih;
     boolean ulang = true;

      Scanner titoo = new Scanner(System.in);

       System.out.println( " " );

    while (ulang) {
       
       System.out.println( " " );
       
       System.out.println( "              E - R A P O R T             " );
        
       System.out.println( " " );
       
       System.out.println( " 1.   PROFILE   " );
       
       System.out.println( " 2.   NILAI  " );
       
       System.out.println( " 3.   HASIL    " );
       
       System.out.println( " 4.   KELUAR         " );
       
       System.out.println( " " );
       
       System.out.print( " SILAHKAN PILIH : " );
       
      Pilih = titoo.nextInt();

      
    switch (Pilih) {
    
        
    case 1 :
      
     for (int z = 1; z < 5; z++) {
     
      System.out.println( " " );
      
      System.out.println( "        PROFILE       " );
      
      System.out.println( " " );
      
      System.out.print( " Masukkan Nama Siswa : " );
      
       Nama[z] = titoo.next();
      
      System.out.println( " " );
      
      System.out.print( " Masukkan Kelas Siswa : " );
      
       Kelas[z] = titoo.next();
      
      System.out.println( " " );
      
      System.out.print( " Masukkan Absen Siswa : " );
      
       Absen[z] = titoo.nextInt();
      
      System.out.println( " " );
      
    }
    
    break;
    
        
    case 2 :
    
     for (int y = 1; y < 5; y++) {

       System.out.println( " " );  
         
      System.out.println( "        NILAI        " ) ;
      
       System.out.println( " " ) ;
      
      System.out.print( " Masukkan Nilai Bahasa Indonesia : " ) ;
      
       Bindo[y] = titoo.nextDouble();
      
      System.out.print( "  Masukkan Nilai Matematika : " ) ;
      
       Mat[y] = titoo.nextDouble();
      
      System.out.print( " Masukkan Nilai Bahasa Inggris : " ) ;
      
       Bing[y] = titoo.nextDouble();
      
      System.out.print( " Masukkan Nilai Fisika : " ) ;
      
       Fisika[y] = titoo.nextDouble();
      
    //Predikat Nilai B. Indonesia
                        
     if (Bindo[y] >= 92 && Bindo[y] <= 100) {
      PredikatBindo = "A";
     } else if (Bindo[y] >= 84 && Bindo[y] <= 91) {
      PredikatBindo = "B";
     } else if (Bindo[y] >= 75 && Bindo[y] <= 83) {
      PredikatBindo = "C";
     } else if (Bindo[y] < 75 && Bindo[y] >= 0) {
      PredikatBindo = "D";
     } else {
       System.out.println( " Angka Yang Anda Masukkan Salah " );
                        
     }
     
    //Predikat Nilai Matematika
       
     if (Mat[y] >= 92 && Mat[y] <= 100) {
      PredikatMat = "A";
     } else if (Mat[y] >= 84 && Mat[y] <= 91) {
      PredikatMat = "B";
     } else if (Mat[y] >= 75 && Mat[y] <= 83) {
      PredikatMat = "C";
     } else if (Mat[y] < 75 && Mat[y] >= 0) {
      PredikatMat = "D";
     } else {
       System.out.println( " Angka Yang Anda Masukkan Salah " );
       
     }
     
    //Predikat Nilai B. Inggris
     
     if (Bing[y] >= 92 && Bing[y] <= 100) {
      PredikatBing = "A";
     } else if (Bing[y] >= 84 && Bing[y] <= 91) {
      PredikatBing = "B";
     } else if (Bing[y] >= 75 && Bing[y] <= 83) {
      PredikatBing = "C";
     } else if (Bing[y] < 75 && Bing[y] >= 0) {
      PredikatBing = "D";
     } else {
       System.out.println( " Angka Yang Anda Masukkan Salah " );
       
     }
     
    //Predikat Nilai Fisika
     
     if (Fisika[y] >= 92 && Fisika[y] <= 100) {
      PredikatFisika = "A";
     } else if (Fisika[y] >= 84 && Fisika[y] <= 91) {
      PredikatFisika = "B";
     } else if (Fisika[y] >= 75 && Fisika[y] <= 83) {
      PredikatFisika = "C";
     } else if (Fisika[y] < 75 && Fisika[y] >= 0) {
      PredikatFisika = "D";
     } else {
       System.out.println( " Angka Yang Anda Masukkan Salah " );
       
     }

    //Rata-Rata
     
      Rata[y] = (Bindo[y] + Mat[y] + Bing[y] + Fisika[y]) / 5;
     if (Rata[y] >= 75) {
      Hasil = " LULUS ";
     } else {
      Hasil = " TIDAK LULUS ";
     }
       System.out.println( " " ) ;
     }
    
    break;
    
    case 3 :
        
     for (int x = 1; x < 5; x++) {
                        
          System.out.println( " " );

         System.out.println( "                                                            N I L A I  R A P O R T  K E L A S  10                                                            " );
                        
          System.out.println( " " );
                        
         System.out.println( " Nama  : " + Nama[x]);
                        
          System.out.println( " " );
          
         System.out.println( " Kelas : " + Kelas[x] );
          
          System.out.println( " " );
          
         System.out.println( " Absen : " + Absen[x] );
          
          System.out.println( " " );
          
          
         System.out.println( " |   B. Indonesia   |   Predikat   |   " ); 
                        
          System.out.println( " " );
         
         System.out.println( "  |  " + Bindo[x] + "  |  " + PredikatBindo + "  |  " );
                        
          System.out.println( " " );
         
          
         System.out.println( " |   Matematika   |   Predikat   |   " ); 
          
          System.out.println( " " );
          
         System.out.println( "  |  " + Mat[x] + "  |  " + PredikatMat + "  |  " );
          
          System.out.println( " " );
          
          
         System.out.println( " |   B. Inggris   |   Predikat   |   " );
          
          System.out.println( " " );
           
         System.out.println( "  |  " + Bing[x] + "  |  " + PredikatBing + "  |  " );
         
          System.out.println( " " );
          
          
         System.out.println( " |   Fisika   |   Predikat   |   " );
         
          System.out.println( " " );
          
         System.out.println( "  |  " + Fisika[x] + "  |  " + PredikatFisika + "  |  " );
          
          System.out.println( " " );
          
          
         System.out.println( " Rata - Rata " );
          
          System.out.println( " " );
          
         System.out.println( "  |  " + Rata[x] + "  |  " );
                        
          System.out.println( " " );
                    
          
     }
    
    break;
    
        
    case 4 :
        
     ulang = false;
    
    break;
    
        
    default:
    
       System.out.println( " " ); 
        
      System.out.println( " Pilihan Anda Salah " );
       
       System.out.println( " " );
    
    }
    
       System.out.println( " " );
    
      System.out.println( " Kembali Ke menu utama " );
      
       System.out.println( " " );
    
     
}

    }

}
