var exec = require('cordova/exec');



module.exports.create = function(success, error, arg0){
    exec(success, error, 'EbeamSmartpen', 'create', [arg0]);
}

module.exports.isPenMode = function(success, error, arg0){
    exec(success, error, 'EbeamSmartpen', 'isPenMode', [arg0]);
}