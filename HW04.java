import java.util.*;
/**
 * HW04 class for main method and static functions involved HW04 assignment.
 * @author MIDN Anna Klemeyer
 */

public class HW04 {
  /**
   * reads (and returns) geyser in the following format
   * <name> <initBlowProb> <days>
   */
  public static Geyser read(Scanner sc) {
    String name = sc.next();
    double baseF = 1.0 - sc.nextDouble();
    int days = sc.nextInt();
    
    
    Geyser g = new Geyser(name, baseF, days);
    return g;
  }

  /**
   * Simulate day d for array G of geysers & output results
   */
  public static void simDay(int d, Geyser[] G, Random r) {
    int k = 0;

    System.out.print("Day " + d + ":");

    for (int i = 0; i < G.length; i++) {
      if (G[i].simDay(r) != -1) {
        System.out.print((k++ > 0 ? ", " : " ") + G[i].getName());
      }
    }
    System.out.println();
  }

  /**
   * This program can be run in one of two ways, either as
   * java HW06    -or-   java HW06 <seedval>
   * The first ways is the usual, the seed for the random
   * number generator is the current time.  The second way
   * is good for testing, since the same seed should always
   * yield the same output.
   */
  public static void main(String[] args) {
    //  initialize and read in Geysers
    long seed = System.currentTimeMillis();

    if (args.length > 0) {
      seed = Integer.parseInt(args[0]);
    }
    Random  r  = new Random(seed);
    Scanner in = new Scanner(System.in);
    int     N  = in.nextInt();
    Geyser[] G = new Geyser[N];

    for (int i = 0; i < N; i++) {
      G[i] = read(in);
    }

    // Simulate 20 days
    for (int d = 1; d <= 20; d++) {
      simDay(d, G, r);
    }
  }
}
