import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class esercizio26di1 {
    private static void agregar(Set list, int x, int z, int y, int p) {
        list.add(x);
        list.add(z);
        list.add(y);
        list.add(p);
    }

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        agregar(list, 3, 6, 9, 12);
        System.out.println(list);

        Integer y = 5;


        Iterator<Integer> iterar= list.iterator();
        while (iterar.hasNext()){
            if (y == iterar.next()){
                iterar.remove();
            }
        }
        System.out.println(list);

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
