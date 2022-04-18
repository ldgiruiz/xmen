package co.com.mutantes.util;

public class ismutant {

	public static boolean isMutant(String[] dna) {

	    int N = dna.length, cont = 0;
	    String letrav = "", letrah = "", letraO = "";

	    for (int y = 0; y < N; y++) {
	      for (int i = 0; i < N; i++) {

	        if (i < (N - 3)) {
	          // vamos a analizar cada cadena de forma Horizontal
	          letrah = dna[y].substring(i, (i + 1));
	          if ((letrah.equals(dna[y].substring(i + 1, i + 2))) && (dna[y].substring(i + 1, i + 2).equals(dna[y].substring(i + 2, i + 3))) &&
	            (dna[y].substring(i + 2, i + 3).equals(dna[y].substring(i + 3, i + 4)))) {
	            cont = cont + 1;
	          }
	          // vamos a analizar cada cadena de forma Vertical
	          letrav = dna[i].substring(y, y + 1);
	          if (letrav.equals(dna[i + 1].substring(y, y + 1)) && dna[i + 1].substring(y, y + 1).equals(dna[i + 2].substring(y, y + 1)) &&
	            dna[i + 2].substring(y, y + 1).equals(dna[i + 3].substring(y, y + 1))) {
	            cont = cont + 1;
	          }
	          // vamos a analizar cada cadena de forma Oblicua
	          if (y < (N - 3)) {
	            letraO = dna[i].substring(y, y + 1);
	            if (letraO.equals(dna[i + 1].substring(y + 1, y + 2)) && dna[i + 1].substring(y + 1, y + 2).equals(dna[i + 2].substring(y + 2, y + 3)) &&
	              dna[i + 2].substring(y + 2, y + 3).equals(dna[i + 3].substring(y + 3, y + 4))) {
	              cont = cont + 1;

	            }
	          }
	        }
	      }
	    }
	    if (cont > 1) {
	      return true;
	    }
	    return false;
	  }
	
}
