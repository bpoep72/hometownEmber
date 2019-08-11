import DS from 'ember-data';
import { computed } from '@ember/object';
import moment from 'moment';

export default DS.Model.extend({
  title: DS.attr(),
  recurrent: DS.attr(),
  startTime: DS.attr(),
  duration: DS.attr(),
  participants: DS.attr(),
  format: DS.attr(),

  //uses moment.js to convert the ISO date into a readable format
  readable_date: computed('startTime', function() {
    var date = moment(`${this.startTime}`);
    //should be '{full month name} {date with suffix} at {hours}:{minutes}'
    return date.format('MMMM, Do YYYY [at] h:mm');
  }),

  //will pluralize the duration if needed
  logical_duration: computed('duration', function() {
    if(`${this.duration}` == 1)
    {
      return `${this.duration} hour`;
    }
    else
    {
      return `${this.duration} hours`;
    }
  }),

  //will make it easier to display the format if it is needed
  format_formatted: computed('format', function() {
    if(`${this.format}` == 'null')
    {
      return '';
    }
    else
    {
      return `${this.format}`;
    }
  }),

});
