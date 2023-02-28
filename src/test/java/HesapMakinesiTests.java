import org.example.HesapMakinesi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HesapMakinesiTests {

    @Test
     public void toplamaTesti(){
         HesapMakinesi hesapMakinesi= new HesapMakinesi();
         double toplamaSonucu =hesapMakinesi.toplama(1.5,3.6);
         Assertions.assertEquals(5.1,toplamaSonucu);
     }
     @Test
     public void cikarmaTesti(){
        HesapMakinesi hesapMakinesi=new HesapMakinesi();
        double cikarmaSonucu=hesapMakinesi.cikartma(4.5,3.0);
        Assertions.assertEquals(1.5,cikarmaSonucu);
     }
     @Test
    public void carpmaTesti(){
        HesapMakinesi hesapMakinesi=new HesapMakinesi();
        double cikarmaSonucu=hesapMakinesi.carpma(2.0,3.0);
        Assertions.assertEquals(6.0,cikarmaSonucu);
     }
}
