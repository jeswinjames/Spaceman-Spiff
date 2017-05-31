package BouncingBalls;
import processing.core.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class BouncingBalls extends PApplet {
	private final int BALL_COUNT = 20;
	ArrayList<Ball> ball;
	
	@Override
	public void setup(){
		size(500,500);
		ball = new ArrayList<Ball>();
		for(int i =0;i<BALL_COUNT;i++)
			ball.add(new Ball(this));
		background(255);
	}

	public int getBallCount() {
		return BALL_COUNT;
	}
	
	@Override
	public void draw(){
		background(255);
		for(int i=0; i<BALL_COUNT; i++)
			ball.get(i).bounce(this);
		
	}

}
