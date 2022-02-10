public class Card {
    public static int makeCard(int face, int suit) {
        return 20 * suit + face;
    }

    public static int cardToSuit(int card) {
        return card / 20;
    }

    public static int cardToFace(int card) {
        return card % 20;
    }

    public static String cardToString(int card) {
        String[] suits = { "\u2663", "\u2666", "\u2665", "\u2660" };
        String[] faces = { "", "", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        return faces[cardToFace(card)] + suits[cardToSuit(card)];
    }

    public static void main(String[] args) {
        int c1 = makeCard(10, 0);
    
        System.out.println(cardToString(c1));

    }
}