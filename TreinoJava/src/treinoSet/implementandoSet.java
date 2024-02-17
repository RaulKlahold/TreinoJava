package treinoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class implementandoSet {

	public static void main(String[] args) {
		Set<Classepessoa> set = new HashSet<>();

        set.add(new Classepessoa("Raul"));
        set.add(new Classepessoa("Klahold"));
        set.add(new Classepessoa("Biscaro"));

        Set<Classepessoa> ordena = new TreeSet<>(set);
        Iterator<Classepessoa> it = ordena.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());


	        }

}}
