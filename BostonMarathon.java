/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

      /**
 * This program finds the fastest and second-fastest runner from a list.
 * 
 * @author HP
 */
public class BostonMarathon {

  public static class Runner {
    public String name;
    public int time;

    public Runner(String name, int time) {
      this.name = name;
      this.time = time;
    }
  }

  public static void main(String[] args) {
    // Create an array of Runner objects
    Runner[] runners = {
        new Runner("Alice", 220),
        new Runner("Bob", 215),
        new Runner("Charlie", 235),
        new Runner("David", 200)
    };

    // Find the fastest runner
    Runner fastest = runners[0];
    for (Runner runner : runners) {
      if (runner.time < fastest.time) {
        fastest = runner;
      }
    }

    System.out.println("Fastest Runner: " + fastest.name + " (" + fastest.time + " minutes)");

    // Find the second-fastest runner
    Runner secondFastest = null;
    for (Runner runner : runners) {
      if (runner != fastest && (secondFastest == null || runner.time < secondFastest.time)) {
        secondFastest = runner;
      }
    }

    if (secondFastest != null) {
      System.out.println("Second Fastest Runner: " + secondFastest.name + " (" + secondFastest.time + " minutes)");
    } else {
      System.out.println("There is only one runner or the fastest runner participated twice.");
    }
  }
}
