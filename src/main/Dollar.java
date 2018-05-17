class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    int times(int multiplier) {
        return amount * multiplier;
    }
}
