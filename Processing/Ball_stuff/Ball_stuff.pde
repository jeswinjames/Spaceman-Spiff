Man man;
ArrayList<Ant> ant;
final int COLOR = 128;
final int NUMBER_OF_ANTS = 20;
boolean[] keysPressed= new boolean[128];
boolean[] direction = new boolean[4];

void setup() {
  size(700, 700);

  man = new Man();  
  ant = new ArrayList<Ant>();
  for (int i=0; i < NUMBER_OF_ANTS; i++)
    ant.add(new Ant());
  resetKeys();
}

void draw() {
  background(COLOR);
  man.drawMan();
  for (int i=0; i<NUMBER_OF_ANTS; i++)
    ant.get(i).drawAnt();
}

void keyPressed() {
  if (key< 128)
    keysPressed[key]=true;
}

void keyReleased() {
  if (key<128)
    keysPressed[key] = false;
}

void resetKeys() {
  for (int i=0; i<128; i++)
    keysPressed[i]=false;
}