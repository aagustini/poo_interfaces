import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class App {

public static void main(String[] args) {
	
/* 	List<String> lstr = new LinkedList<>();

	lstr.add("Patinhas");
	lstr.add("Zezinho");
	lstr.add("Donald");
	lstr.add("Luisinho");
	lstr.add(0,"Huginho");

	for (String s : lstr) System.out.print(s + " ");
	System.out.println("\n\nOrdenando...");

    Collections.sort(lstr);

    for (String s : lstr) System.out.print(s + " ");
		System.out.println("\n");
*/

	List<Pais> paises = new ArrayList<>();
	// = new LinkedList<>();

	Pais p1 = new Pais("ZR", "Zaire", 2300, "Frances");
	Pais p2 = new Pais("BR", "Brasil", 8500, "Portugues");


	paises.add(p1);
	paises.add(p2);
	paises.add(0, new Pais("CN", "China", 9500, "Chines"));
	paises.add(new Pais("SP", "Espanha", 500, "Espanhol"));
	paises.add(new Pais("UK", "Inglaterra", 130, "Ingles"));


	System.out.println("\n\nLista de paises...");
	for (Pais p : paises) System.out.println(p.toString());

    System.out.println("\n\nOrdenando...");

	//Collections.sort(paises);

	
	// com classses comparadoras
	//Collections.sort(paises, new ComparadorCodigo());
	//Collections.sort(paises, new ComparadorLingua());
	//Collections.sort(paises, new ComparadorLinguaReversa());

	// com classes internas anonimas
	//Collections.sort(paises, Pais.getComparadorCodigo());
	//Collections.sort(paises, Pais.getComparadorAreaReverso());

	// a partir de java 8...
	// usamos lambda expressions
	//Collections.sort(paises, (Pais p1,Pais p2)->p1.getArea()-p2.getArea());
	Collections.sort(paises,
	                 (pais1,pais2)->pais1.getArea() - pais2.getArea());


	for (Pais p : paises) System.out.println(p.toString());

	System.out.println("\n");

	}
}
