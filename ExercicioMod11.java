/**
 * @author cauevinnicius
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ExercicioMod11 {

    public static void main(String[] args) {
        System.out.println("*** Modulo 11: Coleções - Exemplo de Lista de Nomes com ArrayList ***");
        ListaNomesArrayList();

    }
    // ArrayList: busca rápida por elementos; inclusão e exclusão lentas.
    private static void ListaNomesArrayList() {
        System.out.println("Digite os nomes abaixo. Digite 'fim' para encerrar a lista.");
        String nomes;
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        while (true) {
            nomes = scanner.nextLine();
            if (nomes.equalsIgnoreCase("fim")) {
                break;
            }
            lista.add(nomes);
        }
        Collections.sort(lista);
        System.out.println("Lista de nomes ordenados: \n" + lista);
    }
}
