package tech.aydin.mcstarter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class App {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/mancenter");
        webAppContext.setWar("/Users/emre/projects/hazelcast/management-center/target/mancenter-3.8.2-SNAPSHOT.war");
        webAppContext.setServer(server);
        webAppContext.getSessionHandler().setHttpOnly(true);
        server.setHandler(webAppContext);

        server.start();
        server.join();
    }
}
