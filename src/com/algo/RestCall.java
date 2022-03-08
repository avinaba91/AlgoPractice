package com.algo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;

public class RestCall {

	static Set<String> countries(String s, int p, int pageNum) throws Exception {
		String baseURL = "https://jsonmock.hackerrank.com/api/countries/search?name=";
		StringBuilder urlBuilder = new StringBuilder(baseURL);
		urlBuilder.append(s);
		urlBuilder.append("&page=");
		urlBuilder.append(pageNum);
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
		StringBuilder outputBuilder = new StringBuilder();
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			outputBuilder.append(output);
		}
		conn.disconnect();
		JSONObject jsonObject = new JSONObject(outputBuilder.toString());
		return countries(jsonObject, p);
	}

	static Set<String> countries(JSONObject object, int p) {
		Set<String> countries = new HashSet<>();
		JSONArray array = object.getJSONArray("data");
		for (int i = 0; i < array.length(); i++) {
			if (array.getJSONObject(i).getInt("population") > p) {
				countries.add(array.getJSONObject(i).getString("name"));
			}
		}
		return countries;
	}
	
	/*static Set<String> countries (String s, int p) {
		Set<String> countries = new HashSet<>();
		final String regex = "/(?:\"name\":\")(.*?)(?:\")/g";

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			matcher.
		}
		return countries;
	}*/

	/*
	 * Complete the function below.
	 * https://jsonmock.hackerrank.com/api/countries/search?name=
	 */

	static int getCountries(String s, int p) {
		Set<String> countries = new HashSet<>();
		try {
			JSONObject jsonObject = null;
			String baseURL = "https://jsonmock.hackerrank.com/api/countries/search?name=";
			StringBuilder urlBuilder = new StringBuilder(baseURL);
			urlBuilder.append(s);
			URL url = new URL(urlBuilder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			StringBuilder outputBuilder = new StringBuilder();
			String output;
			while ((output = br.readLine()) != null) {
				outputBuilder.append(output);
			}
			conn.disconnect();
			jsonObject = new JSONObject(outputBuilder.toString());
			countries.addAll(countries(jsonObject, p));
			int totalpages = jsonObject.getInt("total_pages");
			for (int i = 2; i < totalpages; i++) {
				countries.addAll(countries(s, p, i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return countries.size();
	}

	public static void main(String[] args) {
		System.out.println(getCountries("un", 100090));

	}
}
