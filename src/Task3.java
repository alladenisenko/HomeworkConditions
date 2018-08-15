/**
 * Парсинг строки возраста (в строке представлено число типа int). Можно пользоваться стандартными функциями.
 * Если входная строка является числом, что не соответствует диапазону 1..120,
 * бросить исключение IllegalArgumentException
 */
public class Task3 {
    int parseAge(String ageString){;
        int parseInt = Integer.parseInt(ageString);
        if (parseInt > 0 && parseInt <= 120) {
            System.out.println(parseInt);
        } else {
            throw new IllegalArgumentException("Age < 0 or > 120");
    }
    return  parseInt;
}
}