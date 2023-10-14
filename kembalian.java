public class kembalian {

    public static void main(String[] args) {
      int jumlah = 250000;
      int sisaKembalian = (jumlah - 81500);
  
      // hitung kembalian
      int limaPuluh = (sisaKembalian / 50000);
      int sisa = sisaKembalian % 50000;
      int duaPuluh = (sisa / 20000);
      sisa = sisa % 20000;
      int sepuluh = (sisa / 10000);
      sisa = sisa % 10000;
      int seribu = (sisa / 1000);
      sisa = sisa % 1000;
      int limaRatus = (sisa / 500);
      sisa = sisa % 500;
      
  
  
  
      //cetak hasil
      System.out.println("total = " + jumlah);
      System.out.println("lima puluh " + limaPuluh);
      System.out.println("dua puluh " + duaPuluh);
      System.out.println("sepuluh " + sepuluh);
      System.out.println("seribu " + seribu);
      System.out.println("lima ratus rupiah " + limaRatus);
      System.out.println("sisa kembalian " + sisaKembalian);
    }
  }