//Class Main
public class Main implements Pesan {  
    //Main Class  
    //class main dapat mengimplementasi method yang
    //telah di deklarasikan di interface pesan
 
public static void main(String[] args) {  //method void main utama
     
   
    Main ps = new Main();
 //inisialiasi obyek ps
        ps.tampilPesan1();
        ps.tampilPesan2();
        ps.tampilPesan3();
     
     //tampil method pesan
     
    }
     public void tampilPesan1(){
 
        System.out.println("Tampilkan pesan 1");
    }
      public void tampilPesan2(){
   
             
        System.out.println("Tampilkan pesan 2");
    }
      public void tampilPesan3(){
       
        System.out.println("Tampilkan pesan 2");
    }
   
}