var exec = require('cordova/exec');


function removePathProtocolPrefix(path) {
    if (path.indexOf("file://") === 0) {
        path = path.substring(7);
    } else if (path.indexOf("file:") === 0) {
        path = path.substring(5);
    }

    return path.replace(/\/{2,}/g, '/');
}

function ChilFtp() {
}

ChilFtp.prototype.connect = function (hostname, port, username, password, restartNext, ssl, tls, timeout, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "connect", [hostname, port, username, password, restartNext, ssl, tls, timeout]);
};

ChilFtp.prototype.upload = function (local, remote, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "upload", [removePathProtocolPrefix(local), removePathProtocolPrefix(remote)]);
};

ChilFtp.prototype.ls = function (remote, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "ls", [removePathProtocolPrefix(remote)]);
};

ChilFtp.prototype.download = function (remote, local, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "download", [removePathProtocolPrefix(remote), removePathProtocolPrefix(local)]);
};

ChilFtp.prototype.rename = function (path, existingName, newName, replace, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "rename", [removePathProtocolPrefix(path), existingName, newName, replace]);
};

ChilFtp.prototype.getRemoteFileSize = function (remoteFileName, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "getRemoteFileSize", [removePathProtocolPrefix(remoteFileName)]);
};

ChilFtp.prototype.changeRemoteDir = function (remoteDir, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "changeRemoteDir", [removePathProtocolPrefix(remoteDir)]);
};

ChilFtp.prototype.createRemoteDir = function (remoteNewDir, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "createRemoteDir", [removePathProtocolPrefix(remoteNewDir)]);
};

ChilFtp.prototype.deleteRemoteFile = function (remoteFileName, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "deleteRemoteFile", [remoteFileName]);
};

ChilFtp.prototype.keySetting = function (key, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "keySetting", [key]);
};

ChilFtp.prototype.disconnect = function (successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "disconnect", []);
};

ChilFtp.prototype.abort = function () {
    exec(undefined,
        undefined,
        "ChilFtp",
        "abort", []);
};

ChilFtp.prototype.getPathFromMediaUri = function (data, successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "getPathFromMediaUri", [data]);
};

ChilFtp.prototype.checkConnection = function (successCallback, errorCallback) {
    exec(successCallback,
        errorCallback,
        "ChilFtp",
        "checkConnection", []);
};

module.exports = new ChilFtp();
