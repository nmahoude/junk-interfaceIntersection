package interfaceIntersection;

/**
 * Test interface intersection 
 * 
 *  Objective is to force method parameter to implements multiple interfaces
 *  Without creating aggregating type (FlyableSwimmable ?) or worse solution 
 *
 * The method swimAndFly is the sole elements requesting the 2 interfaces at the same time
 */
public class Main {
  
  static public <T extends Flyable & Swimmable> void swimAndFly(T flyerAndSwimmer) {
    flyerAndSwimmer.fly();
    flyerAndSwimmer.swim();
  }
  
  public static void main(String[] args) {
    FlyingFish flyingFish = new FlyingFish();
    
    swimAndFly(flyingFish);
    
    // swimAndFly(new Fish()); // Error Fish can't fly
    // swimAndFly(new Bird()); // Error Bird can't swim
  }
  
}
