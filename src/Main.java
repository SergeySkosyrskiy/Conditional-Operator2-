
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача№1");
int clientOS = 0;
int versionDevice = 2015;
int clientDeviceYear = 2016;
if (clientOS == 1 && clientDeviceYear >= versionDevice) {
    System.out.println("Установите версию приложения для Android по ссылке");
} else if ( clientOS == 1 && clientDeviceYear <= versionDevice ) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
} else if (clientOS==0 && clientDeviceYear >= versionDevice) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        System.out.println("Задача№2");
 int year = 1000;
 if (year > 1584){
 if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0 ) {
             System.out.println(year+ " Год является високосным");
     }
  else {System.out.println( year+ " Год не является високосным");}

    }
    else {System.out.println("В "+year+ " году ещё не был введён високосный год" );}


        System.out.println("Задача№4");
int deliveryDistance = 64;
int day = 1;
if (deliveryDistance <= 20)
{
    System.out.println("Потребуется дней: "+day );}
else if (deliveryDistance >= 20 && deliveryDistance<= 60 ){
        day = day +1;
    System.out.println("Потребуется дней: " +day );
}
else if (deliveryDistance >= 60 && deliveryDistance <= 100 ){
        day = day + 2;
    System.out.println("Потребуется дней: " +day );}
else if (deliveryDistance > 100) {
    System.out.println("Доставки нет" );}
        System.out.println("Задача№5");

int monthNymber = 11;
switch (monthNymber) {
    case 1:
        System.out.println("Зима");
        break;
    case 2:
        System.out.println("Зима");
        break;
    case 12:
        System.out.println("Зима");
        break;
    case 3:
        System.out.println("Весна");
        break;
    case 4:
        System.out.println("Весна");
        break;
    case 5:
        System.out.println("Весна");
        break;
    case 6:
        System.out.println("Лето");
        break;
    case 7:
        System.out.println("Лето");
        break;
    case 8:
        System.out.println("Лето");
        break;
    case 9:
        System.out.println("Осень");
        break;
    case 10:
        System.out.println("Осень");
        break;
    case 11:
        System.out.println("Осень");
        break;
    default:
        System.out.println("Неверный номер месяца");
}









    }

}