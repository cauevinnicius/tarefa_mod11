/**
 * @author cauevinnicius
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioMod11 {

    public static void main(String[] args) {
        System.out.println("*** Modulo 11: Coleções ***");
        ListaNomesArrayList();
        ListaNomesLinkedList();
        ListaNomesHashSet();
        ListaNomesTreeSet();
    }
    // ArrayList: busca rápida por elementos; inclusão e exclusão lentas.
    private static void ListaNomesArrayList() {
        System.out.println("***Exemplo de Lista de Nomes com ArrayList***");
        List<String> lista = new ArrayList<String>();
        lista.add("João Silva");
        lista.add("Maria Madalena");
        lista.add("Fernando Santos");
        lista.add("Cláudio Miro");
        Collections.sort(lista);
        System.out.println(lista);
    }

    //LinkedList: busca lenta por elementos; inclusão e exclusão rápidas.
    private static void ListaNomesLinkedList() {
        System.out.println("***Exemplo de Lista de Nomes com LinkedList***");
        List<String> lista = new LinkedList<>();
        lista.add("Rodrigo");
        lista.add("Glauco");
        lista.add("Fernanda");
        lista.add("Aquiles");
        Collections.sort(lista);
        System.out.println(lista);
    }

    //HashSet: busca rápida. Lista não ordenada. Não repete valores. Incompatível com o collections.sort
    private static void ListaNomesHashSet() {
        System.out.println("***Exemplo de Lista de Profissões com HashSet***");
        Set<String> lista = new HashSet<>();
        lista.add("Barbeiro");
        lista.add("Médica");
        lista.add("Engenheiro");
        lista.add("Jogador");
        System.out.println(lista);
    }

    //TreeSet: mais lento que o HashSet. Não repete valores. Lista definida pela ordem natural. Incompatível com o collections.sort
    private static void ListaNomesTreeSet() {
        System.out.println("***Exemplo de Lista de Livros com TreeSet***");
        Set<String> lista = new TreeSet<>();
        lista.add("Caçador de Pipas");
        lista.add("A Menina de Roubava Livros");
        lista.add("Biblioteca da Meia Noite");
        lista.add("How to kill a Mockinbird");
        System.out.println(lista);
    }
}
