import java.io.*;
public class penjualan
{ public static void main(String[]args)throws Exception
 { BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  double sa []= new double [3];
  double sd []= new double [3];
  double st []= new double [3];
  int pil = 0;
  double jml []= new double[3];
  double total; total = 0;
  do{
      System.out.println("============================");
      System.out.println("    Program Penjualan ");
      System.out.println("============================");
      System.out.println("1. Input data pembelian :");
      System.out.println("2. total omset :");
      System.out.println("3. keluar");
      pil = Integer.parseInt(br.readLine());
  switch(pil)
  { case 1:
    System.out.println("======================");
    System.out.println("    Pembelanjaan ");
    System.out.println("======================");
    
    for(int i=0;i<3;i++)
    { System.out.print("Soto ayam : ");
      sa[i]= Double.parseDouble(br.readLine());
      System.out.print("Soto daging : ");
      sd[i]= Double.parseDouble(br.readLine());
      System.out.print("Es teh : ");
      st[i]= Double.parseDouble(br.readLine());
      jml[i]= 8000*sa[i]+7000*sd[i]+1500*st[i];
      System.out.println("total harga = "+jml[i]);
      System.out.println("-----------------------");
     }
    break;
    case 2:
    System.out.println("------------------------------");
     for(int i=0;i<3;i++)
    { total = total + jml[i];
    }
    System.out.println("total omset  |"+total);
    System.out.println("-------------------------------");
    break;
    default: break;
  } }
  while (pil<3);
}
}
