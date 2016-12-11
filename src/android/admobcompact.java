package org.apache.cordova.plugin.admobcompact;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class admobcompact extends CordovaPlugin {
	public enum Action{
		createbanner
	}
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("createbanner")) {
			String message = args.getString(0);
			this.createbanner(message, callbackContext);
			return true;
		}
		return false;  // Returning false results in a "MethodNotFound" error.
	}
	
	private void createbanner(String message, CallbackContext callbackContext) {
		if (message != null && message.length() > 0) {
			callbackContext.success(message);
		} else {
			callbackContext.error("Expected one non-empty string argument.");
		}
	}
}
