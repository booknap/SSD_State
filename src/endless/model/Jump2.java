package endless.model;

public class Jump2 extends State {

    public Jump2(Player player) {
        super(player);
    }

    public void enterGround() {
        player.enterGround();
        player.setState(new Idle(player));
    }

}
