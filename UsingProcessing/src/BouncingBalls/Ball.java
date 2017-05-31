package BouncingBalls;

import processing.core.PApplet;

public class Ball {
	private float x,y;
	private float xDelta,yDelta;
	private final int RADIUS = 10;
	private float r,g,b;
	
	private float random(float Min, float Max){
		return (float) (Min+ Math.random()*Max);
	}
	
	public Ball(PApplet p) {
		x = random(RADIUS/2, p.width-(RADIUS/2));
		y = random(RADIUS/2, p.height-(RADIUS/2));
		xDelta = random(-4,4);
		yDelta = random(-4,4);
		r = random(0,255);
		g = random(0,255);
		b = random(0,255);	
	}
	
	public void bounce(PApplet p){
		p.fill(r,g,b);
		p.noStroke();
		p.ellipse(x,y,RADIUS,RADIUS);
		if(x<RADIUS/2 || x>p.width-RADIUS/2)
			xDelta *=-1;
		if(y<RADIUS/2 || y>p.height-RADIUS/2)
			yDelta *= -1;
		x += xDelta;
		y += yDelta;
		
	}

}
