package endless.model;

public class Idle extends State {

    public Idle(Player player) {
        super(player);
    }

    public void jumpPressed() {
        player.jump();
        player.setState(new Jump(player));
    }

    public void crawlPressed() {
        player.crawl();
        player.setState(new Crawl(player));
    }

}
