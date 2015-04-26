import java.io.*;
public class AyamHarisa
 {

     public static void main(String []args) throws Exception {
     BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
      String nota=""; int jml1 = 0; int jml2 = 0; int jml3 = 0;
      int a1 = 6000; int a2 = 3000; int a3 = 2500;
      int tot1 = 0; int tot2 = 0; int tot3 = 0; int tot4 = 0;
      int bayar = 0; int kembali = 0;
      
      System.out.println("=================================");
      System.out.println("         Ayam Harrisa \t  ");
      System.out.println("=================================");
      System.out.print("NO Nota: ");
      nota=br.readLine();
      System.out.print("Ayam Bakar dibeli  : ");
      jml1=Integer.parseInt(br.readLine());
      System.out.print("Nasi dibeli        : ");
      jml2=Integer.parseInt(br.readLine());
      System.out.print("es teh yang dibeli : ");
      jml3=Integer.parseInt(br.readLine());
      tot1 = jml1*a1;
      tot2 = jml2*a2;
      tot3 = jml3*a3;
      
      System.out.println("Nomer Nota" + nota);
      System.out.println("=========================================================================================");
      System.out.println("| Dipesan      | Jumlah            |Harga perpiece    | Total Harga                     |");
      System.out.println("=========================================================================================");
      System.out.println("| Ayam Bakar   |"+"\t"+ jml1+" \t    |"+"\t"+a1+"         |"+"\t"+tot1 );
      System.out.println("| Gula         |"+"\t"+ jml2+" \t    |"+"\t"+a2+"         |"+"\t"+tot2 );
      System.out.println("| Minyak       |"+"\t"+ jml3+" \t    |"+"\t"+a3+"         |"+"\t"+tot3 );
      tot4=tot1+tot2+tot3;
      System.out.println("------------------------------------------------------------------------------------------");
      System.out.println("| Total Bayar                                  \t"+"= "+tot4);
      System.out.print("| Jumlah dibayar                                   \t"+"= ");
      bayar=Integer.parseInt(br.readLine());
      kembali=bayar-tot4;
      System.out.println("| Uang kembali                                     \t"+"= "+kembali);
      System.out.println("==========================================================================================");
     }
    
    
}
