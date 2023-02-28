import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {

    HesapMakinesi hesapMakinesi;

    @BeforeAll//tüm testlerden önce calışır
    public static void setupClass(){
        System.out.println("Setup class metodu calistirildi");
    }

    @BeforeEach// her metoddan önce bir defa koşar yani çalışır bu yüzden sürekli nesne oluşturmaya gerek kalmaz.
    public void setup(){
       hesapMakinesi=new HesapMakinesi();
       System.out.println("setup metotu calistirildi");
    }
    @Test
     public void toplamaTesti(){

         double toplamaSonucu =hesapMakinesi.toplama(1.5,3.6);
         Assertions.assertEquals(5.1,toplamaSonucu);
     }
     @Test
     public void cikarmaTesti(){

        double cikarmaSonucu=hesapMakinesi.cikartma(4.5,3.0);
        Assertions.assertEquals(1.5,cikarmaSonucu);
     }
     @Test
    public void carpmaTesti(){

        double cikarmaSonucu=hesapMakinesi.carpma(2.0,3.0);
        Assertions.assertEquals(6.0,cikarmaSonucu);
     }

     @AfterEach// her testten sonra çalışır
    public void teardown(){
        System.out.println("teardown metodu calistirildi");
     }

     @AfterAll// tüm testlerden sonra çalıştırıldı
    public static void teardownClass (){

        System.out.println("teardown class metodu calistirildi.");
     }
}
