/**
 * Определение идентификатора детской игрушки по ее названию (задача, обратная к Task 4).
 * Если данной игрушки нет, бросить исключение IllegalArgumentException.
 * Реализовать с помощью switch-case.

 Виды игрушек:
 0 – Car.
 1 – Lego.
 2 – Doll.
 3 – Puzzle.

 */
public class Task5 {
    int getToyId(String name){
        int id=0;
        switch (name) {
            case "Car":
                id=0;
                break;
            case "Lego":
                id=1;
                break;
            case "Doll":
                id=2;
                break;
            case "Puzzle":
                id=3;
                break;
            default: {
                throw new IllegalArgumentException("Error");
            }

        }
        return id;
    }}