package collections.task1;
/*
Zaimplenentuj klasę SDAArrayList<T>. która będzie implementować logikę ArrayList<T>
w tym celu zaimplenemtuj obsługę metod:
add
remove
get
display

 */
public class Main {
    public static void main(String[] args) {

        SDAArrayList<Integer> arrayList = new SDAArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(11);
        System.out.println(arrayList.get(0));
        System.out.println();
        System.out.println(arrayList.get(2));
        System.out.println();
        arrayList.remove(1);
        System.out.println();
        arrayList.display();
    }
}
