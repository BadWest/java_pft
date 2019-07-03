package ru.stqa.pft.sandbox;

        import org.testng.Assert;
        import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void PointTest() {
    Point p1 = new Point();
    Point p2 = new Point(1, 1);
    double distance = p1.distance(p2);
    Assert.assertEquals(distance , 1.4142135623730951);
    System.out.println("Растстояние между точками " + p1 + " и " + p2 + " равно " + p1.distance(p2));
  }
}