public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        int year = 2020;
        boolean leapYear = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        if (leapYear)
            System.out.println(year + " год является високосным.");
        else
            System.out.println(year + " год не является високосным.");
    }
    public static void task4() {
        int deliveryDistance = 101;
        int timeDelivery;
        if (deliveryDistance < 20) {
            timeDelivery = 1;
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            timeDelivery = 2;
            System.out.println("Потребуется дней:  " + timeDelivery);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            timeDelivery = 3;
            System.out.println("Потребуется дней: " + timeDelivery);
        }else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5(){
        int monthNumber = 7;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }else {
            System.out.println("Данные не корректны");
        }
        }

}


