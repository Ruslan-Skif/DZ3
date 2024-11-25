//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 1;
        System.out.println("Task 1");
        if(age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");
        System.out.println("Task 2");
        int temperOutdoor = 7;
        if(temperOutdoor <= 5){
            System.out.println("На улице " + temperOutdoor + " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperOutdoor + " градусов, можно идти без шапки.");
        }
        System.out.println(" ");
        System.out.println("Task 3");
        int speed = 83;
        if(speed <= 60){
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }
        else{
            System.out.println("Если скорость " + speed + ", придется заплатить штраф.");
        }
        System.out.println(" ");
        System.out.println("Task 4");
        int ageMan = 10;
        if(ageMan >= 2 && ageMan <= 6){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад.");
        }
        if(ageMan >= 7 && ageMan <= 17){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу.");
        }
        if(ageMan >= 18 && ageMan <= 24){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет.");
        }
        if(ageMan > 24){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить на работу.");
        }
        System.out.println(" ");
        System.out.println("Task 5");
        int ageChild = 3;
        if(ageChild < 5){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        }
        if(ageChild >= 5 && ageChild <= 14){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if(ageChild > 14){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println(" ");
        System.out.println("Task 6");
        int capacityNow = 102;
        if(capacityNow < 60){
            System.out.println("Заполненность вагона " + capacityNow + " человек, есть сидячие места.");
        }
        else if(capacityNow >= 60 && capacityNow < 102){
            System.out.println("Заполненность вагона " + capacityNow + " человек, есть стоячие места.");
        }
        else if(capacityNow == 102){
            System.out.println("Заполненность вагона " + capacityNow + " человека. Мест больше нет.");
        }

        System.out.println(" ");
        System.out.println("Task 7");
        int numberOne = 5;
        int numberTwo = 2;
        int numberThree = 4;
        if(numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Первое число - " + numberOne + " наибольшее.");
        }
        else if(numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Второе число - " + numberTwo + " наибольшее.");
        }
        else if(numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("Третье число - " + numberThree + " наибольшее.");
        }
        else {
            System.out.println("Все числа равны.");
        }
    }
}

