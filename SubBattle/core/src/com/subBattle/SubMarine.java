package com.subBattle;

public class SubMarine {
	
	int x;
	int y;
	int hp = 3;
	
	public void move(int moveX, int moveY){
		x=x+moveX;
		y=y+moveY;
	}

}
