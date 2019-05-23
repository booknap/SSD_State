package endless.model;

public class Jump extends State {

    public Jump(Player player) {
        super(player);
    }

    public void jumpPressed() {
        player.jump();
        player.setState(new Jump2(player));
    }

    public void enterGround() {
        player.enterGround();
        player.setState(new Idle(player));
    }

}
