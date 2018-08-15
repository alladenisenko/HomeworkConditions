/**
 * Task 1* (MinMaxCalculator)
 Нахождение минимума/максимума двух чисел.
 int max(int a, int b)
 int min(int a, int b)
 Входные аргументы	Тип результата
 int a, int b	int / int
 Пример
 Входные аргументы	Результат
 5, -2	             max = 5, min = -2

 */
public class Task1 {
    int max(int a, int b){
        int max=a;
        if (b>a) {
           max=b;
        }
        return max;
    }
    int min (int a, int b){
        int min=a;
        if (b<a) {
            min=b;
        }
        return min;
    }
}
