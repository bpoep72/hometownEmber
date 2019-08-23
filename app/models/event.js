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
  eventImage: DS.attr(),
  game: DS.belongsTo('game'),

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

  declared_game: computed('gameTitle', function() {
    if(this.gameTitle)
    {
      return true;
    }
    else
    {
      return false;
    }
  }),

  //will make it easier to display the format if it is needed
  declared_format: computed('format', function() {
    if(`${this.format}` == 'null')
    {
      return false;
    }
    else
    {
      return true;
    }
  }),

});
