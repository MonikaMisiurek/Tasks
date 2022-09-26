package Task8;
/*
Zaimplemntuj interfejs Movable, który będzie zawierać definicję wspólnych zachowań dla klas
MovablePOint i MovableCircle. Będą to metody:
- void moveUp()
- void moveDown()
- void moveLeft()
- void moveRight()

Klasa MovablePoint powinna implementować interfejs Movable, a ponadto powinna zawierać 4 pola:
-int : x,y, xSpeed, ySpeed
x i y powinny definiować współrzędne punktu, natomiast pola xSpeed, ySpeed powinny określać o ile powinny zmieniać się odpowiednie współrzędne
- metoda moveUp() oraz moveDown() powinny zwiększać/ zmniejszać wartości współrzędnej y o wskazaną wartość ySpeed
- metoda moveRigth() oraz moveLeft() każdorazowo  zwiększają/ zmniejszają wartość współrzędnej x o wskazaną wartość xSpeed

Klasa MovableCircle
powinna implementować interfejs Movable , a ponadto
powinna zawierać (na zasadzie kompozycji) instancję klasy MovablePoint .
Dodatkowo powinna zawierać pole niezbędne do określenia promienia koła.

-metody moveUp() oraz moveDown() powinny każdorazowo zwiększyć/ zmniejszyć wartość współrzędnej y punktu MovablePoint o wskazaną w nim wartość ySpeed
- metody moveLeft oraz moveRight() powinny każdorazowo zwiększyć/ zmniejszyć wartość współrzędnej x punktu MovablePoint o wskazaną w nim wartość : xSpeed

 */
public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(2,2,2,2);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(10,10,3,3,2);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}
