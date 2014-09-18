package com.example.exchangedemo;

import android.content.SharedPreferences;

public class AppPreferences {

	private SharedPreferences mPreferences;

	public AppPreferences(SharedPreferences preferences) {
		mPreferences = preferences;
	}

	public String getClientId() {
		String clientId = mPreferences.getString("prefAADClientId", null);
		return clientId;
	}

	public String getRedirectUrl() {
		String redirectUrl = mPreferences.getString("prefAADRedirectUrl", null);
		return redirectUrl;
	}
}