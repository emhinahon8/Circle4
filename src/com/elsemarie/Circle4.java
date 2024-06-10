package com.elsemarie;

/**
 * @author Elsemarie Hinahon
 * @date 03/5/2024
 * Using scope to ensure invariants in code with values of a circle
 */

public class Circle4 {
	/**
	 * Instance variables (properties, fields)
	 */
	public int x, y, radius;

	/**
	 * Constructor method with incorporated value restrictions
	 * @param x      X-value of circle
	 * @param y      Y-value of circle
	 * @param radius Radius of circle
	 */
	public Circle4(int x, int y, int radius) {
		this.x = x; // don't hardcode these values
		this.y = y;
		this.radius = radius;

		// If any incoming radius is negative, set it to be 1
		if (radius < 0) {
			this.radius = 1;
		}
		// If any incoming radius is bigger than 100, set it to be 100
		if (radius > 100) {
			this.radius = 100;
		}

		// If any incoming x or y point is bigger than 100, set it to be 100
		if (this.x > 100) {
			this.x = 100;
		}
		if (this.y > 100) {
			this.y = 100;
		}
		// If any incoming x or y point is less than -100, it should be set to -100
		if (this.x < -100) {
			this.x = -100;
		}
		if (this.y < -100) {
			this.y = -100;
		}
	}

// ----------------------------------------------	
	/**
	 * Default constructors
	 */
	public Circle4() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}

	/**
	 * Overloaded constructors
	 * @param radius Radius of circle
	 */
	public Circle4(int radius) {
		this.x = 0;
		this.y = 0;
		this.radius = radius;

		// bound check radius here
		// If any incoming radius is negative, set it to be 1
		if (radius < 0) {
			this.radius = 1;
		}
		// If any incoming radius is bigger than 100, set it to be 100
		if (radius > 100) {
			this.radius = 100;
		}
	}

	/**
	 * Calculates and returns the area of circle given radius as instance variable
	 * @return Area of circle
	 */
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	/**
	 * Updates the origin of the circle to the new coordinates
	 * @param x X-value of circle
	 * @param y Y-value of circle
	 */
	public void move(int x, int y) {
		this.x = x;
		this.y = y;

		// bound check x and y here
		if (this.x > 100) {
			this.x = 100;
		}
		if (this.y > 100) {
			this.y = 100;
		}
		// IMPORTANT NOTE:
		// We don't have to return anything here!! we're just updating within
		// So you can make it void
		// Otherwise, need to put the datatype in place of where the word "void" is
	}

	/**
	 * Updates the size of the circle's radius
	 * @param radius Radius of circle
	 */
	public void resize(int radius) {
		this.radius = radius;

		// bound check radius here
		// If any incoming radius is negative, set it to be 1
		if (radius < 0) {
			this.radius = 1;
		}
		// If any incoming radius is bigger than 100, set it to be 100
		if (radius > 100) {
			this.radius = 100;
		}
	}

	// ____________________________________________ Circle4.java below

	/**
	 * Returns the diameter of the circle based off the radius
	 * @return Diameter of circle
	 */
	private int diameter() {
		return 2 * this.radius;
	}

	/**
	 * Calculates and return the circumference of circle using diameter
	 * @return Circumference of a circle
	 */
	public double perimeter() {
		return Math.PI * this.diameter();
	}

	/**
	 * Returns the radius of the circle
	 * @return Radius of circle
	 */
	public double getRadius() {
		return this.radius;
	}

	/**
	 * Returns the origin of circle based off x and y coordinates as an ARRAY
	 * @return Origin of circle
	 */
	public int[] getOrigin() {
		int[] origin = { this.x, this.y };
		return origin;
	}
}

// NOTES ON PRIVATE/PUBLIC:
// diameter is used inside class method
// We don't want main to call it, that's why it's private.
// We want to use it internally;
// usually for the background work just for us to see.
// The rest are public, can be seen by others and checked in main.
