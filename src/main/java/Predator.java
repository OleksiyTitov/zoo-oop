public class Predator implements Animal<Herbivorous> {
    private String name;

    public Predator(String name) {
        this.name = name;
    }

    @Override
    public void eat(Herbivorous food) {
        System.out.println(name + " eating " + food);
    }
}
