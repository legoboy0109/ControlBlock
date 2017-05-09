package main.objects;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x, y;
	protected ID id;
	protected int vel;
	
	public GameObject(int x, int y, int vel, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.vel = vel;
	}
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setVel(int vel) {
		this.vel = vel;
	}
	public int getVel() {
		return vel;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setId(ID id) {
		this.id = id;
	}
	public ID getId() {
		return id;
}
}
