var myplugin = (function () {
	var SERVICE_NAME = "MyPlugin";

	return {
		ping: function (cb, err) {
			cordova.exec(cb, err, SERVICE_NAME, "echo", []);
		},
	};
})();
module.exports = myplugin;