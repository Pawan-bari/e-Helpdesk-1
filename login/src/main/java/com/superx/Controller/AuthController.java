package com.superx.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public abstract class AuthController {
    
    protected final static String API_KEY = "AIzaSyCQrg4rBocTpR_HTjRkO_z5AlPpvHTwXkc";
    
    protected boolean signUp(String email, String password) {
        try {
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=" + API_KEY);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String payloadString = "{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\": true}"
                    .formatted(email, password);

            OutputStream os = conn.getOutputStream();
            os.write(payloadString.getBytes());

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Signup successful: " + responseCode);
                return true;
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                System.out.println("Signup error: " + response);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    protected boolean signIn(String email, String password) {
        try {
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" + API_KEY);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String payloadString = "{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\": true}"
                    .formatted(email, password);

            OutputStream os = conn.getOutputStream();
            os.write(payloadString.getBytes());

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Login successful: " + responseCode);
                return true;
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                System.out.println("Login error: " + response);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    protected boolean resetPassword(String email) {
        try {
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:sendOobCode?key=" + API_KEY);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String payloadString = "{\"email\":\"%s\",\"requestType\":\"PASSWORD_RESET\"}"
                    .formatted(email);

            OutputStream os = conn.getOutputStream();
            os.write(payloadString.getBytes());

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Password reset email sent successfully");
                return true;
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                System.out.println("Password reset error: " + response);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
