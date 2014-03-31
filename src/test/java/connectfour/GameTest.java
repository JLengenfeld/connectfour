package connectfour;

/**
 * Created with IntelliJ IDEA.
 * User: j.sprenger
 * Date: 03.02.14
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
public class GameTest {

    @Test
    public void putCoin() {
        Game game = new Game();
        game.playerOnePut(4);

    }
}
