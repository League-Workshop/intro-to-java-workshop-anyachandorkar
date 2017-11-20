boolean stick=false;
PImage aaron;
PImage beard;
void setup () {
  aaron = loadImage ("aaron.png") ;
  size (800,800);
  beard = loadImage ("beard.png");
  image (beard, 360,415,200,200);
}
int mx=10;
int my=20;

void draw(){
  background (220);
  image (aaron, 50,50,800,800);
if (stick==true) {
  image (beard, mx,my,100,100);
} else {
  image (beard, mouseX,mouseY,100,100); 
}
if (mousePressed) {
  stick=true; 
}

}