package alchemy;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class AlchemyGet {
    private final String USER_AGENT = "Mozilla/5.0";
    
    public static void main(String[] args) throws Exception {
        
        AlchemyGet http = new AlchemyGet();
        
        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();
        
        //		System.out.println("\nTesting 2 - Send Http POST request");
        //		http.sendPost();
        
    }
    
    // HTTP GET request
    private void sendGet() throws Exception {
        
        
        
        //1. Instagram GET call for Jennifer Lawrence's instagram picture of her wearing a gap t-shirt
        //TODO
        
        //2. Using the URL of the instagram picture, we will call the watson API to perform the
        //visual recognition on the Instagram URL of the picture
        String url = "https://watson-api-explorer.mybluemix.net/visual-recognition/api/v3/recognize_text?url=https%3A%2F%2Fwww.instagram.com%2Fp%2F-0WracAArW%2F%3Ftagged%3Dgaplogo%26hl%3Den&version=2016-05-19";
        
        //3. Get the brand name
        //Parse above JSON output to get the brand name
        
        //4. Output to web app 
        
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        
        // optional default is GET
        con.setRequestMethod("GET");
        
        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(
                                               new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
        
    }
    
    // HTTP POST request
    private void sendPost() throws Exception {
        
        String url = "https://selfsolve.apple.com/wcResults.do";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        
        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        
        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
        
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
        
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(
                                               new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
        
    }
}
