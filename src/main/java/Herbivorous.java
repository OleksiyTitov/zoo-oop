public class Herbivorous implements Animal<Plant>, Food {
    private String name;

    public Herbivorous(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(Plant food) {
        System.out.println(name + " eating " + food);
    }
}
