
var sServiceURL = "http://127.0.0.1:5000/";
var oURLs=[{
    "GetUserDetails" : sServiceURL + "/GetUserDetails"
}];

var sNavigationURL=[{
    "LoginPage":"file:///Users/admin/Documents/GitHub/KisanSevaKiosk/"+"register.html"
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