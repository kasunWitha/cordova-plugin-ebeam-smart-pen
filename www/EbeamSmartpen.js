var exec = require('cordova/exec');



module.exports.create = function(arg0, success, error){
    exec(success, error, 'EbeamSmartpen', 'create', [arg0]);
}

module.exports.isPenMode = function(arg0, success, error){
    exec(success, error, 'EbeamSmartpen', 'isPenMode', [arg0]);
}