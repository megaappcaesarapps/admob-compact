'use strict';

var exec = require('cordova/exec');

exports.createbanner = function( success, error) {
  exec(success, error, 'admobcompact', 'createbanner', []);
};