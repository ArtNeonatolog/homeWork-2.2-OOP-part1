public class Main {


    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void PrintCalculateCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for(Flower flower: flowers) {
            if (flower.lifeSpan < minimumLifeSpan){
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            flower.informationOfTheFlower();
        }
        totalCost = totalCost * 1.1;
        System.out.println();
        System.out.printf("Стоимость букета - " + "%.2f", totalCost);
        System.out.println();
        System.out.println("Срок стояния букета - " + minimumLifeSpan);
    }
    private static void task2() {
        System.out.println("Задание 2");
        Flower rose = new Flower (null, "Голландия", 35.59f, 0);
        rose.informationOfTheFlower();
        Flower chrisantema = new Flower (null, null, 15,5);
        chrisantema.informationOfTheFlower();
        Flower pion = new Flower (null, "Англия", 69.9f, 1);
        pion.informationOfTheFlower();
        Flower hypsofila = new Flower (null,"Турция", 19.5f, 10);
        hypsofila.informationOfTheFlower();

        PrintCalculateCostOfFlowers(rose, rose, rose, chrisantema, chrisantema, chrisantema,
                chrisantema, chrisantema, hypsofila);

    }
    private static void task1() {
        Human human1 = new Human ("Максим", 35, "Минск", "бренд-менеджер");
        human1.informationOgHuman();
        System.out.println();

        Human human2 = new Human ("Аня", 29, "Москва", "методист образовательных программ");
        human2.informationOgHuman();
        System.out.println();

        Human human3 = new Human ("Катя", 28, "Калининград", "продакт-менеджер");
        human3.informationOgHuman();
        System.out.println();

        Human human4 = new Human ("Артем", 27, "Москва", "директор по развитию бизнеса");
        human4.informationOgHuman();
        System.out.println();

        Human human5 = new Human ("Владимир", 21, "Калининград", "сейчас нигде не работает");
        human5.setAge(-4);
        human5.setCityOfLife(null);
        human5.informationOgHuman();
        System.out.println();

    }

}
