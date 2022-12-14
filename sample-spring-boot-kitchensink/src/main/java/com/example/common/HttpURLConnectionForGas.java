/**
 *
 */
package com.example.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import lombok.extern.slf4j.Slf4j;

/**
 * HTTPコネクション操作クラス
 * @author vvggh
 *
 */
@Slf4j
public class HttpURLConnectionForGas {
	 private final static String USER__AGENT = "Mozilla/5.0";

	 //HTTP GET request
	 public static void sendGet() throws Exception {

		 String url = "http://www.google.com/search?q=mkyong";

		 URL obj = new URL(url);
		 HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		 //optional default is GET
		 con.setRequestMethod("GET");

		 //add request header
		 con.setRequestProperty("User-Agent", USER__AGENT);

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

	 //HTTP POST request
	 public static void sendPost(Status status) throws Exception {
		 String url = "https://script.google.com/macros/s/AKfycbyehWbBWOWUaaov9Mx1VhXyobWE0s_u7jQmdE6P5ckpLMBIznC3/exec";
		 URL obj = new URL(url);
		 HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		 //add reuqest header
		 con.setRequestMethod("POST");
		 con.setRequestProperty("User-Agent", USER__AGENT);
		 con.setRequestProperty("Accept-Language", "jp");


		 String encodeItem = Encode(status.getItem());
		 String encodeDate = Encode(status.getDate());
		 String encodeMoney = Encode(status.getMoney());

		 String urlParameters = new String("&item=" + encodeItem + "&date=" + encodeDate + "&money=" + encodeMoney + "&sub=");

		 //Send post request
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
		 log.info("responsel: ", response.toString());
		 System.out.println(response.toString());

	    }

	 private static String Encode(String arg) throws UnsupportedEncodingException {
		 return URLEncoder.encode(arg, "UTF-8");
	 }

}
