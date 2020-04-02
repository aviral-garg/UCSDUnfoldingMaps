/**
 * 
 */
package scratchPad.week3.guimodule;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * @author Aviral Garg
 *
 */
public class MyDisplay extends PApplet{

	private String bloodURL = "blood.png";
	private String smileURL = "smile.png";
	private String eyeURL = "eye.png";
	private PImage bloodImg;
	private PImage smileImg;
	private PImage eyeImg;
	
	public void setup() {
		size(400, 400);
		background(200, 200, 200);
		bloodImg = loadImage(bloodURL, "png");
		smileImg = loadImage(smileURL, "png");
		eyeImg = loadImage(eyeURL, "png");
	}
	
	public void draw() {
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		image(eyeImg, -150, -67);
		image(bloodImg, -35, -5);
		image(eyeImg, -50, -10);
		image(smileImg, -35, -30);
	}

}
