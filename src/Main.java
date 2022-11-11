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
    }
}

