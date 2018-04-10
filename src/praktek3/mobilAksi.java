
package praktek3;
public class mobilAksi {
 public static void main(String[] args){
     mobil m = new mobil();
     
     m.setMerk("dahon");
     m.setWarna("hijau");
     m.setHarga(10000);

     
     m.cetakInfo();
     
     System.out.println("merknya \t; ");
     System.out.println(m.getMerk());
     System.out.println("Warnanya \t; ");
     System.out.println(m.getWarna());
      System.out.println("Harganya \t; ");
     System.out.println(m.getHarga());
     
     Mobilmobil mm = new Mobilmobil();
     
  
     mm.setMerk("hulala");
     mm.setWarna("pelangi");
     mm.setHarga(1000);
     mm.setJenismobil("listrik");
     mm.cetakInfo();
     System.out.println("jenis \t:"+mm.getJenismobil());
     mm.throttle();
    
 }
}
