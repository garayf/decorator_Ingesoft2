/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapee;
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("circulo borde normal");
      circle.draw();

      System.out.println("\nCirculo de brode rojo");
      redCircle.draw();

      System.out.println("\nrectangulo de borde rojo");
      redRectangle.draw();
   }
}