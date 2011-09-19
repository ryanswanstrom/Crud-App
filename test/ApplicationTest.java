
import org.junit.Test;
import play.mvc.Http.Response;
import play.test.FunctionalTest;



public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
    
    @Test
    public void testThatAdminPageWorks() {
        Response response = GET("/admin");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
        assertContentMatch("Administration", response);
    }
    
}