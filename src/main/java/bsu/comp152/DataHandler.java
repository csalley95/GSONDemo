package bsu.comp152;

import java.net.http.HttpClient;
import java.util.ArrayList;

public class DataHandler {
    private HttpClient dataGrabber;
    private String webLocation;

    public DataHandler(String webLocation) {
        dataGrabber = HttpClient.newHttpClient();
        this.webLocation = webLocation;
    }
        class responseDataType {
            String title;
            float version;
            String href;
            ArrayList<recipeDataType> results;
        }
        class recipeDataType {
            String title;
            String href;
            String ingredients;
            String thumbnail;
            @Override
            public String toString() {
                return "Recipe Title: " + title ;
            }
        }
}
