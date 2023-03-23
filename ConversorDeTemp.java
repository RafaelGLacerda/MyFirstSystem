package lindasfofas;

import java.util.Scanner;

public class lindas {
public static void main(String[] args) {
	
	  
	    	
	    	   Scanner sc = new Scanner(System.in);
	    	   
	    	       int continuar;
	    	       do {
	    	    	   
	    	        double C, K, F, Re, Ra;
	    	        System.out.println("Digite aqui o valor em  Celcius: ");
	                C = sc.nextDouble();
	    	        
	    	        F = C * 1.8 + 32;
	    	        K = C + 273.15;
	    	        Ra = C * 1.8 + 32 + 459.67;
	    	        Re = C * 0.8;
	    	     
	    	        Scanner sc1 = new Scanner(System.in);
	    	        System.out.println("Escolha (1-Fahrenheit) (2-Kelvin) (3-Reaumur) (4-Rankine): ");
	    	        char calculo = sc1.next().charAt(0);
	    	        
	    	        
	    	        switch (calculo) {
	    	        
	    	        case '1':
	    	        	System.out.println(F);
	    	        	break;
	    	        case '2':
	    	        	System.out.println(K);
	    	        	break;
	    	        case '3':
	    	        	System.out.println(Ra);
	    	        	break;
	    	        case '4':
	    	        	System.out.println(Re);
	    	        	break;
	    	        	
	    	        
	    	        }
	    	        Scanner sc2 = new Scanner(System.in);
	    	        System.out.print("continuar? (1)Sim 2()Nao: ");
	    			continuar = sc2.nextInt();
	    	        }
	    	        while (continuar == 1);
	    	        
    }
}

	
	
	
