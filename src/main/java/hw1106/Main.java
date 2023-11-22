package hw1106;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://api.privatbank.ua/p24api/exchange_rates?json&date=22.11.2023";

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new URL(apiUrl));

            JsonNode baseCurrencyNode = jsonNode.get("baseCurrencyLit");

            if (baseCurrencyNode != null) {
                String baseCurrency = baseCurrencyNode.asText();
                System.out.println("Base Currency: " + baseCurrency);
            } else {
                System.out.println("Key 'BaseCurencyLit' not found in JSON.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}