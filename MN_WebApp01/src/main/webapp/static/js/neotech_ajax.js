//---- FUNZIONE DI ENCODING IN JSON
(function ($) {
    $.fn.serializeFormJSON = function () {

        var o = {};
        var a = this.serializeArray();
        $.each(a, function () {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
})(jQuery);
//---- FINE FUNZIONE DI ENCODING IN JSON



//Chiama l'API e ritorna il JSON
function fire_ajax(send_url, send_data) {
var jsondata={"aereo":"123"};

var response_data;
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: send_url,
        data: jsondata,
        dataType: 'json',
        cache: false,
        success: function (data) {
            response_data=JSON.stringify(data);
            console.log("SUCCESS :"+response_data);
        },
        error: function (e) {
            console.log("ERROR : ", e);
        }
    });
}