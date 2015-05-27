import java.io.*; 
public class balikakata
  { public static void main(String[] args) throws Exception
  { BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
  String x;
  int i; 
  System.out.print("Masukan kata  : ");
  x = br.readLine();
  System.out.print("hasil balik : ");
  for(i=x.length()-1; i>=0; i--)
  { System.out.print(x.charAt(i));
  } System.out.print("\n"); 
} 
}
