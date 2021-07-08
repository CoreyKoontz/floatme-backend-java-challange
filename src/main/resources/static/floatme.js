"use strict";
(function($) {
    let request = $.ajax({'url': '/people.json'});
    request.done(function (people) {
        let html = '';
        people.forEach(function(person) {
            html += '<div>';
            html += '<h1>' + person.name + '</h1>';
            html += '<p>Age: ' + person.age + '</p>';
            html += '<p>Joined: ' + person.dateJoined + '</p>';
            html += '<p>Last Updated: ' + person.dateUpdated + '</p>';
            html += '</div>';
        });
        $('#people').html(html);
    });
})(jQuery);