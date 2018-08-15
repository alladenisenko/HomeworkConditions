/**
 *Определение названия детской игрушки по ее идентификатору.
 * Если данной игрушки нет, бросить исключение IllegalArgumentException.
 * Реализовать с помощью if-else цепочки.

 Виды игрушек:
 0 – Car.
 1 – Lego.
 2 – Doll.
 3 – Puzzle.

 */
public class Task4 {
    String getToyName(int id){
        String getToyName="Null";
        if (id == 0) {
            getToyName="Car";
        }
        if (id == 1) {
            getToyName="Lego";
        }
        if (id == 2) {
            getToyName="Doll";
        }
        if (id == 3) {
            getToyName="Puzzle";
        } else {
            throw new IllegalArgumentException("Not Exist toy id");
        }
        return  getToyName;
    }
}
