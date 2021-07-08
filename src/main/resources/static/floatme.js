"use strict";

// Ajax request for all People:
(function($) {
    let request = $.ajax({'url': '/people.json'});
    request.done(function (people) {
        let html = '';
        people.forEach(function(person) {
            html += '<div class="card-deck">';
            html += '<div class="card">';
            html += '<div class="card-body">';
            html += '<h5 class="card-title">' + person.name + '</h5>';
            html += '<h6 class="card-subtitle mb-2 text-muted">Age: ' + person.age + '</h6>';
            html += '<h6 class="card-subtitle mb-2 text-muted">Position: ' + person.job.jobTitle + '</h6>';
            html += '<p class="card-text">Joined: ' + person.dateJoined + '</p>';
            html += '<p class="card-text">Last Updated: ' + person.dateUpdated + '</p>';
            html += '<a class="card-link">Update' + '</a>';
            html += '<a class="card-link">Delete' + '</a>';
            html += '</div>';
            html += '</div>';
            html += '</div>';
        });
        $('#people').html(html);
    });
})(jQuery);

// // Ajax request for all Jobs:
// ISSUE: Go back and fix "Current Employee" field ****
(function($) {
    let request = $.ajax({'url': '/jobs.json'});
    request.done(function (jobs) {
        let html = '';
        jobs.forEach(function(job) {
            html += '<div class="card-deck">';
            html += '<div class="card">';
            html += '<div class="card-body">';
            html += '<h5 class="card-title">' + job.jobTitle + '</h5>';
            html += '<h6 class="card-subtitle mb-2 text-muted">Salary: ' + job.salary + '</h6>';
            html += '<p class="card-text">Current Employees: ' + job.people + '</p>';
            html += '<a class="card-link">Update' + '</a>';
            html += '<a class="card-link">Delete' + '</a>';
            html += '</div>';
            html += '</div>';
            html += '</div>';
        });
        $('#jobs').html(html);
    });
})(jQuery);