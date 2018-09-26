package cordova.plugin.ebeam.smart.pen;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("create")) {
            //String message = args.getString(0);
            this.create(callbackContext);
            return true;
        }else if (action.equals("isPenMode")) {
            this.isPenMode(callbackContext);
            return true;
        }
        return false;
    }

    private void create(CallbackContext callbackContext) {
        EBeamSPController.create(this);
        penController =EBeamSPController.getInstance();
        callbackContext.success("true");
    }

    private void isPenMode(CallbackContext callbackContext) {
        boolean status = penController.isPenMode();
        if(status){
            callbackContext.success("true");
        }else{
            callbackContext.error("false");
        }
    }
    
}
