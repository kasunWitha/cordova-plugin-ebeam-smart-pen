var exec = require('cordova/exec');



module.exports.create = function(success, error){
    exec(success, error, 'EbeamSmartpen', 'create');
}

module.exports.isPenMode = function(success, error){
    exec(success, error, 'EbeamSmartpen', 'isPenMode');
}