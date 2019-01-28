
var sServiceURL = "http://127.0.0.1:5000/";
var oURLs=[{
    "GetUserDetails" : sServiceURL + "/GetUserDetails"
}];


function makeServiceCall(sRequestURL,sType,sSuccess, sContent){
    $.ajax({
        url: sRequestURL,
        cache: false,
        type: sType,
        success: sSuccess(),
        data: sContent
      });
}