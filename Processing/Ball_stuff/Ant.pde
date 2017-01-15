class Ant{

  float x, y;
  PImage img = loadImage("ant.png");
  PVector speed;
  int radius = max(img.width, img.height)/2;


  Ant() {
    speed =  new PVector();
    x = random(0+radius, width-radius);
    y = random(0+radius, width-radius);
    speed.x = random (-1, 1);
    speed.y = random (-1, 1);
  }

  void drawAnt() {
    moveAnt();
    pushMatrix();
    translate(x + img.width/2, y + img.height/2);
    rotate(HALF_PI + speed.heading());
    translate(-img.width/2, -img.height/2);
    image(img, 0, 0);
    translate(img.width/2, img.height/2);
    fill(255, 2, 2);
    stroke(255, 0, 0);
    ellipse(0, 0, 5, 5);
    popMatrix();
    
  }

  void moveAnt() {
    if (isAntOutOfWindow()) {
      speed.rotate(PI);
    } else {
      float randomNumber = random(0, 1);
      if (randomNumber <= 0.07) {
        speed.rotate(random(-(PI/16), (PI/16)));
      } else if (randomNumber >= 0.98) {
        speed.rotate(random(-(PI/4), (PI/4)));
      }
    }

    x += speed.x;
    y += speed.y;
  }

  boolean isAntOutOfWindow() {
    boolean leftRight = (x <= radius || x >= width-radius);
    boolean topBottom = (y <= radius || y >= height-radius);

    if (leftRight || topBottom) {
      return true;
    } else {
      return false;
    }
  }
}