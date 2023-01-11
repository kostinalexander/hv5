public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    public static void Task1() {
        System.out.println("Задание1");
        int cliensOS = 0;
        if (cliensOS == 0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Установите версию Android");
        }
    }

    public static void Task2() {
        System.out.println("Задание2");
        int clientOS = 1;
        int clienDeviceYears = 2015;
        if (clientOS == 0 && clienDeviceYears >= 2015) {
            System.out.println("Установите версию для IOS по ссылке");
            if (clientOS == 0 && clienDeviceYears < 2015) {
                System.out.println("Установите облегчённую версию для IOS по ссылке");
            }
        } else if (clientOS > 0 && clienDeviceYears >= 2015) {
            System.out.println("установите версию для Android");
        } else {
            System.out.println("установите облегчённую версию для Android");
        }

    }

    public static void Task3() {
        System.out.println("Задание3");
        int year = 2021;
        if (year % 4 == 0 && year / 100 != 0 || year / 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }


    }

    public static void Task4() {
        System.out.println("Задание4");
        int deliveryRange =20;
        if (deliveryRange>0 && deliveryRange<=20) {
            System.out.println("Доставка займёт сутки");
        }
        if (deliveryRange>20 && deliveryRange<=60){
            System.out.println("Доставка займёт 2-е суток");
        }
        if (deliveryRange>60 && deliveryRange<100){
            System.out.println("Доставка займёт 3-е суток");
        }
        if (deliveryRange>100){
            System.out.println("Доставки не будет");
        }

    }
    public static void Task5() {
        System.out.println("Задание5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 12:
                System.out.println("Декабрь"+" Месяц Зимы");
                break;
            case 1:
                System.out.println("Январь"+ " Месяц Зимы");
                break;
            case 2:
                System.out.println("Февраль"+" Месяц Зимы");
                break;
            case 3:
                System.out.println("Март"+ " Месяц Весны");
                break;
            case 4:
                System.out.println("Апрель"+ " Месяц Весны");
                break;
            case 5:
                System.out.println("Май"+ " Месяц Весны");
                break;
            case 6:
                System.out.println("Июнь"+ "Месяц Лета");
                break;
            case 7:
                System.out.println("Июль"+ "Месяц Лета");
                break;
            case 8:
                System.out.println("Август"+ "Месяц Лета");
                break;
            case 9:
                System.out.println("Сентябрь"+ "Месяц Осени");
                break;
            case 10:
                System.out.println("Октябрь"+ "Месяц Осени");
                break;
            case 11:
                System.out.println("Ноябрь"+ "Месяц Осени");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}

