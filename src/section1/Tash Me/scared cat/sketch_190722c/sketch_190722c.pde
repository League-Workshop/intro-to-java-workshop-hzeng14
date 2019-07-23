PImage mustache;
PImage friend;
PImage hat;
void setup(){
  size(800,800);
  friend = 
  loadImage("friend.jpg");
  friend.resize(800,800);
  mustache = 
  loadImage("mustache.png");
  hat =
  loadImage("hat.jpeg");
}
void draw(){
  background(friend);
  image(mustache,mouseX,mouseY);
  if(mousePressed);
  mustache.resize(200,50);
  if (mouseButton == RIGHT) { image(hat,250,70);
  }
  
  
}
