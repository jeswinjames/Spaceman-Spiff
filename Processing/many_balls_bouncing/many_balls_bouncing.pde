float [] x = {100, 145, 250, 310, 470};
float [] y = {370, 200, 480, 110, 90};
float [] del_x = {1, -2.1, 0.7, 1.7, 2.5};
float [] del_y = {-2.3, 0.9, -0.7, 1.9, -0.5};


void setup() {
  size(500, 500);
  frameRate(60);
}

void draw() {
  background(0);
  fill(0, 256, 256);
  stroke(256, 256, 0);

  for (int i = 0; i < 5; i++) {
    ellipse(x[i], y[i], 20, 20);
    
    if (x[i] <= 10 || x[i] >= 490) {
      del_x[i] *= -1;
    }

    if (y[i] <= 10 || y[i] >= 490) {
      del_y[i] *= -1;
    }
    
    x[i] += del_x[i];
    y[i] += del_y[i];
    
  }
}