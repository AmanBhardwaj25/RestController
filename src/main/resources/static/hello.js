$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8787/greeting1"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.name);
    });
});