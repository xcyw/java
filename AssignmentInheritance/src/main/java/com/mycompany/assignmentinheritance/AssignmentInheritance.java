/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentinheritance;

/**
 *
 * @author ashle
 */
/*************************************************
* Problem: Shapes
**************************************************
* Implement a program that manages shapes.
* Implement a class named Shape with a method
* area() which returns the double value 0.0.
* Implement three derived classes named Rectangle,
* Square, and Circle. Declare necessary properties
* in each including getter and setter function and
* a constructor that sets the values of these
* properties. Override the area() function in each
* by calculating the area in each class.
**************************************************
* Write a program that repeatedly shows the user a
* menu to create one of the three main shapes or to
* print the shapes created so far. If the user
* selects to create a new shape, the program prompts
* the user to enter the values for the size of the
* selected shape. The shape is then stored in an
* array. If the user selects to print the current
* shapes, print the name, and the total area of
* each shape to the console.
***************************************************
* HINT: You may use ArrayList
**************************************************/

import java.util.Scanner;
import java.util.ArrayList;

public class AssignmentInheritance {
	/* BASE - SHAPE */
	public static class Shape {
		/* variables */

		/* methods */
		public double area() {
			return 0.0;
		}
	}

	/* DERIVED - RECTANGLE */
	public static class Rectangle extends Shape {
		/* variables */
		private double length;
		private double width;

		/* methods */
		// default constructor
		public Rectangle() {
			length = 0;
			width  = 0;
		}
		// constructor
		public Rectangle(double length, double width) {
			this.length = length;
			this.width  = width;
		}
		// sets length
		public void setLength(double length) {
			this.length = length;
		}
		// sets width
		public void setWidth(double width) {
			this.width = width;
		}
		// gets length
		public double getLength() {
			return length;
		}
		// gets width 
		public double getWidth() {
			return width;
		}
		// returns area 
		@Override
		public double area() {
			return length * width;
		}
	}

	/* DERIVED - SQUARE */
	public static class Square extends Shape {
		/* variables */
		private double side;

		/* methods */
		// default constructor
		public Square() {
			side = 0;
		}
		// constructor
		public Square(double side) {
			this.side = side;
		}
		// sets side
		public void setSide(double side) {
			this.side = side;
		}
		// gets side
		public double getSide() {
			return side;
		}
		// returns area
		@Override
		public double area() {
			return side * side;
		}
	}

	/* DERIVED - CIRCLE */
	public static class Circle extends Shape {
		/* variables */
		private double radius;
		
		/* methods */
		// default constructor
		public Circle() {
			radius = 0;
		}
		// constructor
		public Circle(double radius) {
			this.radius = radius;
		}
		// sets radius
		public void setRadius(double radius) {
			this.radius = radius;
		}
		// gets radius
		public double getRadius() {
			return radius;
		}
		// returns area
		@Override
		public double area() {
			return 3.14 * radius * radius;
		}
	}
	
	// *******************************************

	/* MAIN CODE */
	public static void main(String[] args) {
		// variables
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> ShapeListArea = new ArrayList<Double>();
                ArrayList<String> ShapeListName = new ArrayList<String>();
		int    userOption = 0;
                double tempLength = 0;
                double tempWidth  = 0;
                double tempSide   = 0;
                double tempRadius = 0;
                double shapeArea  = 0;
                String shapeName  = "";
                

		do {
			// display menu and prompt for userOption
			System.out.println("Enter the # of the option you want to do:");
			System.out.println("1. Create a RECTANGLE \n2. Create a SQUARE ");
			System.out.println("3. Create a CIRCLE \n4. Print the shapes!");
			userOption = scan.nextInt();

                        // OPTION - RECTANGLE
                        if (userOption == 1) {
                            Rectangle currentShape = new Rectangle();
                            // prompt for rectangle length and width
                            System.out.println("Input length value: ");
                            tempLength = scan.nextDouble();
                            System.out.println("Input width value: ");
                            tempWidth = scan.nextDouble();
                            // set length and width
                            currentShape.setLength(tempLength);
                            currentShape.setWidth(tempWidth);
                            // save area and shape name
                            shapeArea = currentShape.area();
                            shapeName = "Rectangle";
                        }
                        // OPTION - SQUARE
                        if (userOption == 2) {
                            Square currentShape = new Square();
                            // prompt for square side
                            System.out.println("Input side value:");
                            tempSide = scan.nextDouble();
                            // set side
                            currentShape.setSide(tempSide);
                            // save area and shape name
                            shapeArea = currentShape.area();
                            shapeName = "Square";
                        }                      
                        // OPTION - CIRCLE
                        if (userOption == 3) {
                            Circle currentShape = new Circle();
                            // prompt for circle radius
                            System.out.println("Input radius value:");
                            tempRadius = scan.nextDouble();
                            // set radius
                            currentShape.setRadius(tempRadius);
                            // save area and shape name
                            shapeArea = currentShape.area();
                            shapeName = "Circle";
                        } 
                        // puts shape area and shape name into arraylist
                        if(userOption < 4) {
                            ShapeListArea.add(shapeArea);
                            ShapeListName.add(shapeName);
                        }
                        
                        System.out.println();
                
		} while(userOption < 4);

                // prints out all shapes inputted
                for(int i = 0; i < ShapeListArea.size(); i++) {
                    System.out.println("Shape: " + ShapeListName.get(i));
                    System.out.println("Area:  " + ShapeListArea.get(i));
                    System.out.println();
                }
	}
}
