class Pendulum{
int len;
float clock = PI/2;
float amplitude = PI/6;

Pendulum(int len)
{
  this.len = len;
}

void tick()
{ 
  clock = (clock + 1/(sqrt(len)*3))%(2*PI);
  float swing = cos(clock)*amplitude;
  pushMatrix();
  translate (300, 0);
  rotate(swing);
  stroke(255, 0, 0);
  line(0, 0, 0, len);
  translate(0, len);
  fill(255);
  ellipse(0, 0, 10, 10);
  popMatrix();
}
}