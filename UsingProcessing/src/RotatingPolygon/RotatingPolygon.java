package RotatingPolygon;

import processing.core.PApplet;

public class RotatingPolygon extends PApplet {
	private float[] x, y;
	private float linear_freq = (float) 0.2;
	private float Amp = 300;
	private final int SIDES = 4;
	float direction = 0;

	@Override
	public void setup() {
		size(600, 800);
		x = new float[SIDES];
		y = new float[SIDES];
		background(0);
		stroke(255, 255, 0);
		frameRate(1);
	}

	@Override
	public void draw() {
		background(0);
		pushMatrix();
		translate(width / 2, height / 2);
		rotate(direction);
		for (int i = 0; i < SIDES; i++) {
			x[i] = Amp * cos(TWO_PI * linear_freq + i * TWO_PI / SIDES);
			y[i] = Amp * sin(TWO_PI * linear_freq + i * TWO_PI / SIDES);
		}
		for (int i = 0; i < SIDES; i++)
			line(x[i], y[i], x[(i + 1) % SIDES], y[(i + 1) % SIDES]);
		popMatrix();
		direction = direction + PI/4;
	}

}