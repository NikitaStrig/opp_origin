package transport;

public enum Body {
    SEDAN("Седан"),
    HATSHBACK("Хачбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("СУВ"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("ВАН"),
    MINIVAN("Минивен");

    private String BodyType;


    Body(String bodyType) {
        this.BodyType = bodyType;
    }

    public String getBodyType() {
        return BodyType;
    }

    public void setBodyType(String bodyType) {
        BodyType = bodyType;
    }
}


