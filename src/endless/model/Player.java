package endless.model;

public class Player {

	public static final int JUMP_SPEED = 300;
	public static final int WIDTH = 30;
	public static final int NORMAL_HEIGHT = 60;
	public static final int CRAWL_HEIGHT = 30;

	private int x;
	private int y;
	private int vY;
	private int width;
	private int height;

	// TODO: Add variables you need.
	private  State state;
	private boolean crawling;
	private long jumpTime;
	private int jumpY;
	private int jumpCount;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		// TODO: Initialize variables you need
		this.state = new Idle(this);
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getvY() {
		return vY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setvY(int vY) {
		this.vY = vY;
	}
	
	public void jump() {
		jumpCount++;
		jumpTime = System.currentTimeMillis();
		jumpY = y;
	}

	public void crawl() {
		crawling = true;
		height = CRAWL_HEIGHT;
	}

	public void stopCrawling() {
		crawling = false;
		height = NORMAL_HEIGHT;
	}

	public void enterGround() {
		y = 0;
		jumpCount = 0;
	}

	public void jumpPressed() {
		state.jumpPressed();
	}

	public void crawlPressed() {
		state.crawlPressed();
	}

	public void crawlReleased() {
		state.crawlReleased();
	}

	public void update() {
		// TODO: Fix this
		if (jumpCount > 0) {
			float t = (System.currentTimeMillis() - jumpTime) / 1000.0f;
			y = (int) (jumpY + JUMP_SPEED * t + 0.5f * Game.GRAVITY * t * t);
			if (y <= 0) {
				state.enterGround();
			}
		}
	}

}
