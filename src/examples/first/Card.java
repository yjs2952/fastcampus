package examples.first;

public class Card {

    private int number;
    private String type;

    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {

        String str = number + "";
        if (number == 1) {
            str = "A";
        } else if (number == 11) {
            str = "J";
        } else if (number == 12) {
            str = "Q";
        } else if (number == 13) {
            str = "K";
        }

        return type + "[" + str + "]";
    }
}
