public class Herbivorous implements Animal<PlantFood>, MeatFood {
    private String name;

    public Herbivorous(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(PlantFood food) {
        System.out.println(name + " eating " + food);
    }
}
