/**
 Определение корректности заданного возраста. Возраст может принимать значения в диапазоне 1..120.
 boolean isAge(int age)
 Входные аргументы	Тип результата
 int age	boolean
 Пример
 Входные аргументы	Результат
 25	                   true
 0	                    false
 120	                true
 121	                false

 */
public class Task2 {
    boolean isAge(int age){
        boolean isage=true;
        if (age > 0 && age <= 120) {isage = true;}
        else {isage = false;};
        System.out.print("age is " + isage);
        return isage;
    }

}
