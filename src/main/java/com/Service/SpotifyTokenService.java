package com.Service;
import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.*
import java.util.Base64;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;;


@Service
public class SpotifyTokenService { 
    private static final String CLIENT_ID = "e0380f88880a42fcb1055b8699335e09";
    private static final String CLIENT_SECERT = "5c2a336df3884896b2640678006f8795";
   
    public String getAcessToken() throws Exception{
        String credentials = CLIENT_ID + ":" + CLIENT_SECERT ;
    
   }
}
