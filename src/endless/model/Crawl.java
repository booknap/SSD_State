package endless.model;

public class Crawl extends State{

    public Crawl(Player player) {
        super(player);
    }

    public void crawlReleased() {
        player.stopCrawling();
        player.setState(new Idle(player));
    }

}
