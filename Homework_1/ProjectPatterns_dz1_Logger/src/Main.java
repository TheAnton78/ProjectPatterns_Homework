import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
           list.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список: " + showArray(list));
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + showArray(filteredList));
        logger.log("Завершаем программу");
    }

    public static String showArray(List<Integer> list){
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(x -> stringBuilder.append(x).append(" "));
        return stringBuilder.toString();
    }
}
