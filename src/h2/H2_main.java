package h2;

public class H2_main {

	public static void main(String[] args) {
		// 3 Variablen deklarieren
		        int i = 67;
		        int j = 90;
		        int k = 29;

		        int min;
		        int max;

	  // Minimum finden
		        if (i < j && i < k) {
		            min = i;
		        } else if (j < i && j < k) {
		            min = j;
		        } else {
		            min = k;
		        }

     // Maximum finden
		 if (i > j && i > k) {
		            max = i;
		        } else if (j > i && j > k) {
		            max = j;
		        } else {
		            max = k;
		        }

		        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		        System.out.println("Minimum = " + min);
		        System.out.println("Maximum = " + max);
		    }


	}

