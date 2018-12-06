/**
 * Die Klasse implementiert die Lösung von "Türme von Hanoi"
 * @author Thu Thao Tran
 * 		   Paulina Pansow
 *
 */
public class scheibenVerschieben {
    public void bewege(int n, char from_rod, char aux_rod, char to_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Bewege Scheibe 1 von " +  from_rod + " ---> " + to_rod); 
            return; 
        } 
        bewege(n-1, from_rod, to_rod, aux_rod); 
        System.out.println("Bewege Scheibe " + n + " von " +  from_rod + " ---> " + to_rod); 
        bewege(n-1, aux_rod, from_rod, to_rod); 
    } 
}
