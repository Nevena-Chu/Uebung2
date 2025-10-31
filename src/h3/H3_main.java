package h3;

public class H3_main {
    public static void main(String[] args) {
        // 3 Variablen deklarieren
        int i = 450;
        int j = 10;
        int k = 23;

        // Ausdrücke aus der Aufgabe
        boolean a1 = (i > j);     
        boolean a2 = (i > 200);   
        boolean a3 = (j > 100);   
        
        // k auf -10 setzen
        k = -10;

        // If-Bedingung
        if (a1 && !a2 && !a3) { //1 wahr, 2 und 3 nicht
            k = 1;
        } else if (a1 && a2 && !a3) { //1 und 2 wahr , 3 nicht
            k = 2;
        } else if (a1 && a2 && a3) { // alle wahr
            k = 3;
        } else if (!a1 && !a2 && !a3) { // alle falsch
            k = 4;
        } else { // sonst
            k = -10;
        }

        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        System.out.println("a1(i>j)=" + a1 + ", a2(i>200)=" + a2 + ", a3(j>100)=" + a3);
    }
}
