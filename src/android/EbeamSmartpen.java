package cordova.plugin.ebeam.smart.pen;

import org.apache.cordova.*;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.luidia.ebeam.pen.sdk.EBeamSPController;
import com.luidia.ebeam.pen.sdk.constants.PenEvent;
import com.luidia.ebeam.pen.sdk.constants.PenMessage;
import com.luidia.ebeam.pen.sdk.listener.PenEventListener;
import com.luidia.ebeam.pen.sdk.listener.PenMessageListener;

/**
 * This class echoes a string called from JavaScript.
 */
public class EbeamSmartpen extends CordovaPlugin {

    private EBeamSPController penController;
    private CordovaWebView web;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("create")) {
            //String message = args.getString(0);
            this.create(args, callbackContext);
            return true;
        }else if (action.equals("isPenMode")) {
            this.isPenMode(args, callbackContext);
            return true;
        }
        return false;
    }

    private void create(JSONArray args, CallbackContext callbackContext) {
       
        
        callbackContext.success("true");
    }

    private void isPenMode(JSONArray args, CallbackContext callbackContext) {
        boolean status = penController.isPenMode();

        if(status){
            callbackContext.success("true");
        }else{
            callbackContext.success("false");
        }
    }

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView){
        super.initialize(cordova, webView);
        this.web = webView;

        Context context = cordova.getActivity().getApplicationContext();
       // EBeamSPController.create(context);
        //penController =EBeamSPController.getInstance();
    }
    
}
