import java.util.ArrayList;
import java.util.List;

public class OrdenarLista {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(8);
        lista.add(1);
        lista.add(4);

        System.out.println(lista);

        OrdenarLista ordenarlista = new OrdenarLista();
        List<Integer> listaOrdenada = ordenarlista.ordenar(lista);

        System.out.println(listaOrdenada);
    }

    public List<Integer> ordenar(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }
}
