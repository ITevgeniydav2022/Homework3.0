public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 24;
        if (age >= 18) {
            System.out.println("Поздравляем! Вы достигли совершеннолетия!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно чутка подождать!");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и ходит в универ");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ходит на работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int allSeats = 60;
        int standingSeats = capacity - allSeats;
        int allSeatsUsed = 59;
        int standingUsed = 40;
        if (allSeatsUsed < allSeats) {
            System.out.println("Есть еще " + (allSeats - allSeatsUsed) + " сидячих мест ");
        }
        if (allSeatsUsed == allSeats) {
            System.out.println("Сидячих мест нет!");
        }
        if (standingUsed < standingSeats) {
            System.out.println("Есть ещё " + (standingSeats - standingUsed) + " стоячих мест ");
        }
        if (standingUsed == standingSeats) {
            System.out.println("Стоячих мест нет!");
        }
        // Задание 4
        System.out.println("Задание 4");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Поздравляем! Вы достигли совершеннолетия!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно чутка подождать!");
        }
        // Задание 5
        System.out.println("Задание 5");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и ходит в универ");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ходит на работу");
        }
        // Задание 6
        System.out.println("Задание 6");
        int capacity1 = 102;
        int allSeats1 = 60;
        int standingSeats1 = capacity1 - allSeats1;
        int allSeatsUsed1 = 60;
        int standingUsed1 = 42;
        if (allSeatsUsed1 < allSeats1) {
            System.out.println("Есть еще " + (allSeats1 - allSeatsUsed1) + " сидячих мест ");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (standingUsed1 < standingSeats1) {
            System.out.println("Есть ещё " + (standingSeats1 - standingUsed1) + " стоячих мест ");
        } else {
            System.out.println("Стоячих мест нет!");
        }
        // Задание 7
        System.out.println("Задание 7");
        int age2 = 19;
        if (age2 >= 2 && age2  <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад ");
        } else if (age2 > 6 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу ");
        } else if (age2 > 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу ");
        }
        // Задание 8
        System.out.println("Задание 8");
        int age3 = 15;
        if (age3 < 5) {
            System.out.println(" Ребёнок не может кататься на аттракционе ");
        } else if (age3 < 14) {
            System.out.println(" Ребенок может кататься на аттракционе, только в сопровождении взрослого ");
        } else {
            System.out.println(" Ребенок может кататься на аттракционе ");
        }

        // Задание 9
        System.out.println("Задание 9");
        int one = 10;
        int two = 10;
        int three = 10;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }
}

