public class Death extends Square {
    public void enter(Player p) {
        p.setDead(true);
    }
}
