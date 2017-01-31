ArrayList<Pendulum> pendulums = new ArrayList<Pendulum>();
int numberOfPendulums = 6;

void setup() {
  size(600, 600);
  frameRate(60);
  for (int i=0; i < numberOfPendulums; i ++)
    pendulums.add(new Pendulum(200 + i*10));
}

void draw() {
  background(0);
  for (int i=0; i < numberOfPendulums; i++)
    pendulums.get(i).tick();
}