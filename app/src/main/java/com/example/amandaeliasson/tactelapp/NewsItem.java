package com.example.amandaeliasson.tactelapp;

/**
 * Created by amandaeliasson on 2018-04-15.
 */

public class NewsItem {
    private String header;
    private String body;
    private String link;

    public NewsItem(String header, String body, String link){
          this.header = header;
          this.body = body;
          this.link = link;

    }
    public String getHeader(){
         return header;
    }
    public String getBody(){
         return body;
    }
    public String getLink(){
        return link;
    }
}
