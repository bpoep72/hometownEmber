import DS from 'ember-data';
import {
  computed
} from '@ember/object';
import moment from 'moment';

export default DS.Model.extend({
  title: DS.attr(),
  recurrent: DS.attr(),
  startTime: DS.attr(),
  duration: DS.attr(),
  participants: DS.attr(),
  eventImage: DS.attr(),
  description: DS.attr(),

  //async false loads the model whenever an event loads
  format: DS.belongsTo('format', {
    async: true
  }),
  game: DS.belongsTo('game', {
    async: true
  }),

  //uses moment.js to convert the ISO date into one a human understands
  readable_date: computed('startTime', function () {
    var date = moment(`${this.startTime}`);
    //should be '{full month name} {date with suffix} at {hours}:{minutes}'
    return date.format('MMMM, Do YYYY [at] h:mm');
  }),

  //will pluralize the duration if needed
  logical_duration: computed('duration', function () {
    if (`${this.duration}` == 1) {
      return `${this.duration} hour`;
    } else {
      return `${this.duration} hours`;
    }
  }),

  /*
    Some events do not have declared games
  */
  declared_game: computed('game', function () {
    if (this.game.content !== null) {
      return true;
    } else {
      return false;
    }
  }),

  /*
    Some games do not declated formats
  */
  declared_format: computed('format', function () {
    if (this.format.content !== null) {
      return true;
    } else {
      return false;
    }
  }),

  /*
    If the event does not have a game or format it must be an activity
  */
  declared_activity: computed('format', 'game', function () {
    if (this.format == null && this.game == null) {
      return true
    } else {
      return false;
    }
  }),

  has_description: computed('description', function () {
    if (this.description.length > 0) {
      return true;
    } else {
      return false;
    }
  })

});
