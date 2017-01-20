class Man {
  PImage man;
  PImage[][] cliparts;
  int x=width/2-20, y =height/2-32;
  int xDelta=0, yDelta=0;
  final int DOWN=0, LEFT=1, RIGHT=2, UP=3;
  int DELTA=1;
  float j=0;
  int direction;

  Man()
  {
    man= loadImage("dashch14.png");
    cliparts = new PImage[4][4];
    for (int i=0; i<4; i++)
      for (int j=0; j<4; j++)
        cliparts[i][j]=man.get(30+100*i, 54+100*j, 40, 64);
    direction = UP;
  }  

  void drawMan() {
    moveMan();
    image(cliparts[int(j)][direction], x, y);
  }

  void moveMan() {
    if (keysPressed['s']) {
      yDelta=DELTA; 
      direction=DOWN;
    }
    if (keysPressed['w']) {
      yDelta = -DELTA; 
      direction = UP;
    }
    if (keysPressed['a']) {
      xDelta=-DELTA; 
      direction =LEFT;
    }
    if (keysPressed['d']) {
      xDelta=DELTA; 
      direction = RIGHT;
    }
    if (keysPressed['j'] && DELTA<10)
      DELTA = DELTA +1;
    if (keysPressed['k'] && DELTA>1)
      DELTA = DELTA -1;
    
    if (!keysPressed['a']&&!keysPressed['d'])
      xDelta = 0;
    if (!keysPressed['w']&&!keysPressed['s'])
      yDelta = 0;
    if ((x<0 && xDelta<0) || (x>(width-40) && xDelta>0))
      xDelta =0;
    if ((y<0 && yDelta<0)|| (y>height-50 && yDelta>0))
      yDelta =0;
    x = x +xDelta;
    y = y+ yDelta;
    if(!(xDelta==0 && yDelta==0))
      j = (j+0.1)%4;
  }
}