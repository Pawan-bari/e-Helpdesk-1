package com.superx.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public abstract class AuthController {

    protected final static String API_KEY = "AIzaSyDc1AAmZzAjPUVg-wWp9H8gLjch00_hayM";

    protected String signUp(String email, String password) {
        try {
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=" + API_KEY);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String payloadString = "{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\": true}"
                    .formatted(email, password);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(payloadString.getBytes());
            }

            return readResponse(conn);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected String signIn(String email, String password) {
        try {
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" + API_KEY);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String payloadString = "{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\": true}"
                    .formatted(email, password);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(payloadString.getBytes());
            }

            return readResponse(conn);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String readResponse(HttpsURLConnection conn) throws Exception {
        int responseCode = conn.getResponseCode();
        BufferedReader reader;
        if (responseCode >= 200 && responseCode < 300) {
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        System.out.println("Firebase Auth Response: " + response.toString());
        return response.toString();
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

            try (OutputStream os = conn.getOutputStream()) {
                os.write(payloadString.getBytes());
            }

            return conn.getResponseCode() == 200;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}