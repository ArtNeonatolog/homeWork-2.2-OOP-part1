public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;
    public Flower(String flowerColor, String country, float cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost < 0 || cost == 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerColor, String country, float cost) {
        this (flowerColor, country, cost, 3 );
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public void setCost(float cost) {
        if (cost < 0 || cost == 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public void informationOfTheFlower () {
        System.out.println("цвет - " + getFlowerColor() +
                ", страна происхождения - " + getCountry() + ", стоимость - " + getCost() + " рублей (я)" + ", срок стояния цветка - " + lifeSpan + " дней (я)");
    }


}
