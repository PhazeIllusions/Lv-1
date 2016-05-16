int x = 600;
int y = 600;
int a = 700;
int z = 700;
int w = 50;
int h = 500;
double birdYVelocity = 0;
  double gravity = 0.5;
void setup(){
 size(1000,1000); 



}
void draw(){
  
  a--;
  background(153,123,53);
 if(mousePressed){
  birdYVelocity -= 1.5;
 }
fill(103, 91,129);    
rect(a, z,w ,h );    
  
  birdYVelocity += gravity;
  y+= (int) birdYVelocity;
  
  
  fill(72,122,142);
  ellipse(x,y,105,105);
  if(a <=-w){
    int random = (int) random(0,1400);
    a = 1001;
    h = random;
}
}
