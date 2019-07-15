package ru.stqa.pft.sandbox;

        import org.testng.Assert;
        import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void PointTest() {

    Point p1 = new Point(0,0);
    Point p2 = new Point(1, 1);
    double distance = p1.distance(p2);
    Assert.assertEquals(distance , 1.4142135623730951);
    System.out.println("Растстояние между точками " + p1 + " и " + p2 + " равно " + p1.distance(p2));
  }

  @Test
  public void PointTest2() {

    Point p1 = new Point(2,2);
    Point p2 = new Point(8, 8);
    double distance = p1.distance(p2);
    Assert.assertEquals(distance , 8.48528137423857);
    System.out.println("Растстояние между точками " + p1 + " и " + p2 + " равно " + p1.distance(p2));
  }
}