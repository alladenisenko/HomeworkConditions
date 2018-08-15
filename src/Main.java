
public class Main {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        System.out.println("Max="+task1.max(3,5));
        System.out.println("Min="+task1.min(4,6));
        Task2 task2 = new Task2();
        task2.isAge(0);
        Task3 task3 = new Task3();
        task3.parseAge("21");
        Task4 task4 = new Task4();
        System.out.println(task4.getToyName(2));
        Task5 task5 = new Task5();
        System.out.println(task5.getToyId("Lego"));
    }
}
