package Server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.*;

import java.io.IOException;

/**
 * Created by Bernardo on 01-06-2015.
 */
public class RegisterHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println(httpExchange.getHttpContext().getPath());
        System.out.println("request method: " + httpExchange.getRequestMethod());

        if (httpExchange.getRequestMethod().equals("POST")){

        }


    }
}