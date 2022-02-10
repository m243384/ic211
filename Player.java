public class Player {
    String name;
    int card;
    double money;

    public static void main(String[] args) {
        Player aPlayer = new Player();

        /** java has default values for unassigned variables
        */
        
        aPlayer.name = "Halle";
        aPlayer.card = 11;
        aPlayer.money = 5.0;

        System.out.println("A Player: " + aPlayer);
        System.out.println("Halle's money: " + aPlayer.money);
    }
}