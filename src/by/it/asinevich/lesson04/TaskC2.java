package by.it.asinevich.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        int raw = 2;
        int column = 2;
        while (raw <= 10) {
            switch (raw) {
                case 2:
                    System.out.print("Два ");
                    break;
                case 3:
                    System.out.print("Три ");
                    break;
                case 4:
                    System.out.print("Четыре ");
                    break;
                case 5:
                    System.out.print("Пять ");
                    break;
                case 6:
                    System.out.print("Шесть ");
                    break;
                case 7:
                    System.out.print("Семь ");
                    break;
                case 8:
                    System.out.print("Восемь ");
                    break;
                case 9:
                    System.out.print("Девять ");
                    break;
                case 10:
                    System.out.print("Десять ");
                    break;
            }
            if (column <= 10) {
                switch (column) {
                    case 2:
                        System.out.println("умножить на два равно " + raw * column);
                        break;
                    case 3:
                        System.out.println("умножить на три равно " + raw * column);
                        break;
                    case 4:
                        System.out.println("умножить на четыре равно " + raw * column);
                        break;
                    case 5:
                        System.out.println("умножить на пять равно " + raw * column);
                        break;
                    case 6:
                        System.out.println("умножить на шесть равно " + raw * column);
                        break;
                    case 7:
                        System.out.println("умножить на семь равно " + raw * column);
                        break;
                    case 8:
                        System.out.println("умножить на восемь равно " + raw * column);
                        break;
                    case 9:
                        System.out.println("умножить на девять равно " + raw * column);
                        break;
                    case 10:
                        System.out.println("умножить на десять равно " + raw * column);
                        break;
                }
                column++;
            } else {
                System.out.println();
                raw++;
                column = 1;
            }
        }
    }

}
