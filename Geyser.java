import java.util.*;
/**
 * Geyser class used for methods and constructor of the Geyser object
 * @author MIDN Anna Klemeyer
 */
public class Geyser {
  private String name;
  private double baseProbFactor;
  private int    daysSinceLastBlow;

  /**
   * Geyser constructor
   * @param t The string for the name.
   * @param f The double for the base probability.
   * @param d The int for the number of days.
   */
  public Geyser(String t, double f, int d) {
    this.name = t;
    this.baseProbFactor = f;
    this.daysSinceLastBlow = d;
  }

  
  /** 
   * @return String the name of the referenced Geyser object.
   */
  public String getName() {
    return this.name;
  }


  
  /** 
   * @return double The base probability of the Geyser.
   */
  public double getProbFactor() {
    return this.baseProbFactor;
  }
  
  /** 
   * @return int The number of days since the Geyser has blown.
   */
  public int getDays() {
    return this.daysSinceLastBlow;
  }
  
  /** 
   * @param d The number of days since the Geyser has blown.
   */
  public void setDays(int d) {
    this.daysSinceLastBlow = d;
  }

  /**
   * Simulate one day.  If g doesn't blow, return -1
   * if g blows, return number of days since last blow
   */
  public int simDay(Random r) {
    this.setDays(this.getDays() + 1);
    int tmp = this.getDays();
    double factor = this.getProbFactor();
    double blowProb = 1.0 - (Math.pow(factor, tmp));

    if (r.nextDouble() <= blowProb) {
      this.setDays(0);
    } else {
      tmp = -1;
    }
    return tmp;
  }
}
