$(document).ready(function () {
	
    $('#bth-search').click(function (event) {
     // var data = $("#search-form").serializeFormJSON();
     // console.log(data);  
     fire_ajax("api/search", "qqqq");
});

});

/*
function fire_ajax_submit() {

    var search = {};
    search["aereo"] = $("#aereo").val();
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/WebAppTemplate/api/search",
        data: JSON.stringify(search),
        dataType: 'json',
        cache: false,
        success: function (data) {
            var json = JSON.stringify(data);
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {
            var json = "<h4>Ajax Response</h4>&lt;pre&gt;"
                + e.responseText + "&lt;/pre&gt;";
        }
   });
}*/
