import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Queue<Task> tasks = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        String option;
        do{
            System.out.println("Wybierz opcję: ");
            System.out.println("1 - dodanie nowego zadania ");
            System.out.println("2 - Pokaż kolejne zadanie ");
            System.out.println("3 - wyjście z programu");
            option = sc.nextLine();
            if(option.equals("1")){
                System.out.println("Podaj nazwę zadania: ");
                String name = sc.nextLine();
                System.out.println("Podaj opis zadania: ");
                String description = sc.nextLine();
                System.out.println("Wybierz ważnośc zadania: ");
                System.out.println(Priority.LOW.getDescription());
                System.out.println(Priority.MODERATE.getDescription());
                System.out.println(Priority.HIGH.getDescription());
                Priority priority = Priority.fromDescription(sc.nextLine());
                Task task = new Task(name, description, priority);
                tasks.offer(task);
            }else if(option.equals("2")){
                System.out.println("Następne zadanie to: ");
                System.out.println(tasks.poll().toString());
            }else if (!option.equals("3"))
                System.out.println("Podana wartość nie znajduje się na liście wyborów ");
        }while(!option.equals("3"));

    }
}