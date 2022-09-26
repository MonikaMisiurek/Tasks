package exception.task1;
/*
Zaimplementuj metodę divide, która docelowo ma podzielić dwie liczby będące atrybutami metody.
W przypadku, gdy drugi paramter jest równy 0 powinein zostać wyrzucony niedomyślny wyjątek:
"CannotDivideBy0Exception"
 */
public class Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {
        MathUtils.divide(10,0);

    }


}
