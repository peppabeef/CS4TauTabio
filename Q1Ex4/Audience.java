public record Audience(int number, double payment) {
    public Audience {
        if (number < 0) {
            throw new IllegalArgumentException("Number of people in audience most not be a negative quantity");
        }
        if (payment < 0) {
            throw new IllegalArgumentException("Amount payed must not be a negative quantity");
        }
    }
}