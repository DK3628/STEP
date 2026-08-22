public class IdCard {
    String name;
    int booksIssued;

    // Constructor
    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        // First object
        IdCard card1 = new IdCard("Ravi", 2);

        // Reference copy (same object)
        IdCard card2 = card1;

        // Modify through second reference
        card2.booksIssued = 5;

        // Value seen through first reference
        System.out.println("Books issued through card1: " + card1.booksIssued);

        // Compare references
        System.out.println("card1 == card2 : " + (card1 == card2));

        // Separate object with same values
        IdCard card3 = new IdCard("Ravi", 5);

        // Compare references again
        System.out.println("card1 == card3 : " + (card1 == card3));
    }
}