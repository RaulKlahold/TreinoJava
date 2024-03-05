package treinoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class implementandoSet {

	public static void main(String[] args) {
		Set<Classepessoa> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Digite um nome: ");
        String nome1 = scan.next();
        set.add(new Classepessoa(nome1));
        
        System.out.print("Digite um outro nome: ");
        String nome2 = scan.next();
        set.add(new Classepessoa(nome2));
        
        set.add(new Classepessoa("Biscaro"));

        Set<Classepessoa> ordena = new TreeSet<>(set);
        Iterator<Classepessoa> it = ordena.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());


	        }

}}
