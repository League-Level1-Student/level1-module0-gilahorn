package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    
    
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    
    int x = 250; 
    int y = 300;
    
    int birdVelocity = -10;
    int gravity = -1;
	int  pipeX = WIDTH;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        back = loadImage("flappyBackground.jpg");
        pipeBottom = loadImage("bottomPipe.png");
        pipeTop = loadImage ("topPipe.png");
        bird = loadImage("bird.png");
        back.resize(WIDTH, HEIGHT);
        bird.resize(50,50);
    }

    @Override
    public void draw() {
        background(back);
        image(pipeBottom, 250, 375);
        image (pipeTop, 250, -130);
        image (bird, x, y);
        
        y += birdVelocity;
        birdVelocity += gravity;
        
         pipeX -=5;
    }
    @Override
    public void mousePressed() {
    	birdVelocity =-10;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
