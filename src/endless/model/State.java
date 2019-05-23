package endless.model;

public abstract class State {

    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    public void crawl() {

    }

    public void stopCrawling() {

    }

    public void enterGround() {

    }

    public void jumpPressed() {

    }

    public void crawlPressed() {

    }

    public void crawlReleased() {

    }
}
