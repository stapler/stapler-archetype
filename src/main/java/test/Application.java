package test;

import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kohsuke Kawaguchi
 */
public class Application {

    public Map<String, Item> getItems() {
        Map<String, Item> items = new HashMap();
        items.put("1", new Item("item1"));
        items.put("2", new Item("item2"));

        return items;
    }

    /**
     * Action example called when browsing: http://localhost:8080/hello
     */
    public void doHello(StaplerRequest request, StaplerResponse response) throws ServletException, IOException {
        System.out.println("doHello called");

        response.forwardToPreviousPage(request);
    }
}
