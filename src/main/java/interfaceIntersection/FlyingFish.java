package interfaceIntersection;

public class FlyingFish implements Flyable, Swimmable{

  public void swim() {
    System.out.println("Swimmig ...");
  }

  public void fly() {
    System.out.println("Flying ...");
  }

}
