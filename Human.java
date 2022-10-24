public class Human {
    String name;
    private int age;
    private String cityOfLife;
    String position;

    public Human (String name, int age, String cityOfLife, String position) {
        int currentYear = 2022;
        this.name = name;
        this.age = currentYear - age;
        this.cityOfLife = cityOfLife;
        this.position = position;
    }

    private int getAge () {
        return age;
    }

    public String getCityOfLife () {
        return cityOfLife;
    }

    public void setAge(int age) {
        if (age < 0 || age == 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public void setCityOfLife(String cityOfLife) {
        if (cityOfLife == null) {
            System.out.println("Информация не указана");
        }
        this.cityOfLife = cityOfLife;
    }
    public void informationOgHuman () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfLife + ". Я родился (ась) в " + age + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }

}
