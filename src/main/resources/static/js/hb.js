
function add(address) {
    $.ajax({
        "url":"login/add",
        "type":"GET",
        "data":"address="+address,
        "dataType":"json",
        "success":function(obj){
        }
    })
}

var map = new AMap.Map('container', {
    resizeEnable: true
});
AMap.plugin('AMap.Geolocation', function () {
    var geolocation = new AMap.Geolocation({
        enableHighAccuracy: true,
        timeout: 10000,
        buttonPosition: 'RB',
        buttonOffset: new AMap.Pixel(10, 20),
        zoomToAccuracy: true,

    });
    map.addControl(geolocation);
    geolocation.getCurrentPosition(function (status, result) {
        if (status == 'complete') {
            add(result.position)
        } else {
            console.log(result)
            console.log(status)
        }
    });
});

