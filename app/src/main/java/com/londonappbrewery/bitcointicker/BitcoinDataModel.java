package com.londonappbrewery.bitcointicker;

import org.json.JSONObject;

/**
 * Created by opimand on 27.01.2018.
 */

public class BitcoinDataModel {
    private String mPrice;

    public String getPrice() {
        return mPrice;
    }

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            bitcoinData.mPrice = jsonObject.getString("last");
            return bitcoinData;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }

}
