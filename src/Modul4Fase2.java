import java.util.ArrayList;
import java.util.Scanner;
public class Modul4Fase2 {

	public static void main(String[] args) {
		int euro5=5;
		int euro10=10; 
		int euro20=20;
		int euro50=50;
		int euro100=100;
		int euro200=200;
		int euro500=500;
		int total=0;
		String eleccio;
		int resp=1;
		String[] menu = new String[2];
		Integer[] preu = new Integer[2];
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<menu.length;i++) 
		{
			System.out.println("Introdueix el nom del "+(i+1)+" plat del menu: ");
		    String nomPlat= sc.nextLine();
		    	menu[i]= nomPlat;
		    	System.out.println("Introdueix el preu del "+(i+1)+" plat del menu: ");
				Integer preuPlat = sc1.nextInt();	
				preu[i]=preuPlat;
			
				
		}
		for(int i=0;i<menu.length;i++) 
		{
			System.out.println("EL preu del plat n?mero "+i+" "+menu[i]+" ?s : "+preu[i] );
		}
		
		
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		ArrayList<String> comanda = new  ArrayList <String>();
		System.out.println(" ");
		while  (resp==1) {
			
			System.out.println("Introdueixi el nom del plat que vol deman?:");
			eleccio=sc3.nextLine();
			
			comanda.add(eleccio);
		
			
			System.out.println("Si vols demanar un altre plat marca el n?mero 1, si vols acabar de demanar, introdueix cualsevol altre n?mero");	
			resp=sc4.nextInt();
			
			}
		sc.close();
		sc1.close();
		sc3.close();
		sc4.close();
		
	}
	

}
