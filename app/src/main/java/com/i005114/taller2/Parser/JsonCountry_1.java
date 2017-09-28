package com.i005114.taller2.Parser;

import com.i005114.taller2.Models.Country;
import com.i005114.taller2.Models.Country_1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 27/09/2017.
 */

public class JsonCountry_1 {
    public static List<Country_1> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Country_1> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);

            Country_1 country = new Country_1();
            country.setName(item.getString("name"));
            country.setCapital(item.getString("capital"));
            country.setAlphacode(item.getString("alpha3Code"));
            country.setRegion(item.getString("region"));
            country.setPoblacion(item.getString("population"));
country.setIdioma(item.getString("nativeName"));

           JSONObject languages = item.getJSONObject("languages");
country.setIdioma(languages.getString("nativeName"));

            countryList.add(country);
        }
        return countryList;
    }
}
