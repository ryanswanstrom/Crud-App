
import models.Sentence;
import models.Story;
import org.junit.Before;
import org.junit.Test;
import play.test.Fixtures;
import play.test.UnitTest;



public class BasicTest extends UnitTest {

    @Before
    public void setup() {
        Fixtures.deleteAllModels();
    }

    @Test
    public void modelCount() {
        assertEquals("should be zero Storys", 0, Story.count());
        assertEquals("should be zero Sentences", 0, Sentence.count());
    }

    @Test
    public void inserts() {
        // must add a story first
        Story story = new Story();
        story.title = "A Story title";
        assertTrue("it should insert",story.validateAndCreate() );
        assertEquals("should be one Story", 1, Story.count());

        // add a sentence
        Sentence sentence = new Sentence();
        sentence.text = "Once upon a time.";
        assertFalse("no Story: #fail", sentence.validateAndCreate());
        sentence.story = story;
        assertTrue("with Story: #success", sentence.validateAndCreate());
        assertEquals("should be one Sentence", 1, Sentence.count());

    }

}
