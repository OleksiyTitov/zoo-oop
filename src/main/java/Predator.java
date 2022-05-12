public class Predator implements Animal<MeatFood>, MeatFood {
    private String name;

    public Predator(String name) {
        this.name = name;
    }

    @Override
    public void eat(MeatFood food) {
        if (!food.getClass().equals(this.getClass())) {
            System.out.println(name + " eating " + food);
        } else {
            System.out.println(name + " doesn't eat his own kind");
        }
    }
}
