package ru.stqa.pft.sandbox;

class Main {
  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point(1,1);
    System.out.println("Растстояние между точками "+p1+" и "+p2+" равно "+p1.distance(p2));
  }
}
