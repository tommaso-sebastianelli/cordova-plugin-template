package me.rost.myplugin;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.provider.Settings;

public class MyPlugin extends CordovaPlugin {
	public static final String TAG = "MyPlugin";

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("echo")) {
			echo(args, callbackContext);
		} else {
			return false;
		}
		return true;
	}

	public void echo(JSONArray args, CallbackContext callbackContext){
		callbackContext.success("echo");

		// try {
		// 	//data
		// 	result = new PluginResult(PluginResult.Status.OK, ""//data);
		// 	cardReaderContext.sendPluginResult(result);
		// } catch (Exception e) {
		// 	Log.e(TAG, e.getMessage());
		// 	result = new PluginResult(PluginResult.Status.ERROR, e.getMessage());
		// 	cardReaderContext.sendPluginResult(result);
		// }

		// 	//To keep sending data e.g. after an nfc event put this after each sendPluginResult;
		// 	result.setKeepCallback(true);
	}
}
