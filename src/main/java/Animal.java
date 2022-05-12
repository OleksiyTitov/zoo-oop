public interface Animal<F extends Food> {
    String getName();

    void eat(F food);
}
