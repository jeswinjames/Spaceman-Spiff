 //<>//
ArrayList <Ant> ants = new ArrayList<Ant>();
int numberOfAnts;

void setup() {
  size(800, 800);
  frameRate(60);
  numberOfAnts = 10;
  createAnts();
}

void createAnts() {
  for(int i = 0; i < numberOfAnts; i++){
    ants.add(new Ant());  
  }
}

void draw(){
  background(255);
  for(int i = 0; i < numberOfAnts; i++){
    ants.get(i).drawAnt();  
  }
}
  