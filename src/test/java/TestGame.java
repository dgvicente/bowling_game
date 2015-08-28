import org.junit.Test;
import main.java.Game;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGame{

    @Test
    public void testPinsWereNotHittedInAllFrames(){
        Game game = new Game();
        for ( int i = 0; i < 20; i++ ) {
            game.roll(0);
        }
        assertThat(0, is(game.score()));
    }

}
