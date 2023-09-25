public class Main {
    public static void main(String[] args) {
        System.out.println("conditional_operator");


        // Задача 1

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ты совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека " + age + " и меньше ты несовершеннолетний");
        }

        // Задача 2
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");

        }
        // Задача 3

        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }

        // Задача 4

        int human = 25;
        if (human >= 2 && human < 6) {
            System.out.println("Если возраст человека равен " + human + " то ему нужно ходить в детский сад");
        }
        if (human >= 7 && human < 17) {
            System.out.println("Если возраст человека равен " + human + " то ему нужно ходить в школу");
        }
        if (human >= 18 && human <= 24) {
            System.out.println("Если возраст человека равен " + human + " то его место в университете");
        }
        if (human > 24) {
            System.out.println("Если возраст человека равен " + human + " то ему пора ходить на работу");
        }

        // Задача 5

        int child = 18;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + " то он не может кататься на аттракционе");
        }
        if (child > 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + " то он может кататься в сопровождении");
        }
        if (child > 14) {
            System.out.println("Если возраст ребенка равен " + child + " то он может кататься без сопровождения");
        }

        // Задача 6

        int peopleCameIn = 13;
        int railwayСarriage = 102;
        int seats = 60;
        if (peopleCameIn < 60) {
            System.out.println("В вагоне " + (seats - peopleCameIn) + " сидчих мест и " + (railwayСarriage - seats) + " стоячих мест");
        } else if (peopleCameIn >= 60 && peopleCameIn < 102) {
            System.out.println("В вагоне " + (railwayСarriage - peopleCameIn) + " стоячих мест");
        } else {
            System.out.println("мест нет");
        }

        // Задача 7

        int one = 2;
        int two = 4;
        int three = 6;
        if (one == two && one == three)
        {
            System.out.println("если число " + one + " то числа равны");
        } else if (one >= two && one >= three ) {
            System.out.println("если число " + two + " то оно самое большое");
        } else {
            System.out.println("если число " + three + " то оно самое большое");
        }

    }

    }







