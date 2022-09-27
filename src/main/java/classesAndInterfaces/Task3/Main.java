package classesAndInterfaces.Task3;
/*
Interfejs Validator
Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji
metodę boolean validate(T input) .

Klasa User
Zaimplementuj klasę User, która będzie zawierać: * pola: imię, nazwisko, wiek,
login, hasło * konstruktor bezparametrowy * metody typu setter i getter *
metody typu setter powinny przyjmować w swoim ciele odpowiednią wartość
pola oraz instancję klasy implementującej interfejs validator * metody typu
sette powinny wywoływać metodę validate na podstawie instancji
przekazanego obiektu. Parametrem przekazywanym do metody validate
powinna być wartość pierwszego argumentu

klasy anonimowe
Mechanizmy walidujące klasy Validator powinny zostać zaimplementowane w
postaci klas anonimowych. Ponadto poszczególne klasy anonimowe powinny
weryfikować poniższe zasady:
walidacja imienia: imię nie może być puste ani być nullem, powinno
zaczynać się od wielkiej litery
walidacja nazwiska: nazwisko nie może być puste ani być nullem, powinno
zaczynać się od wielkiej litery
walidacja wieku: wartość powinna mieścić się w przedziale o 0 do 150
login: wartość pola powinna składać się z 10 znaków
hasło: powinno zawierać znak !
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Karolina", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user.setLastName("Nowak", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user.setAge(28, new Validator<Integer>() {
                    @Override
                    public boolean validate(Integer input) {
                        return input >= 0 && input <= 150;
                    }
                }
        );

        user.setLogin("KaNo124578", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("nkbh!we", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);




    }
}
