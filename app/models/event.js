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

  readable_date: computed('startTime', function() {
    var date = moment(`${this.startTime}`);
    return date.format('MMMM, Do YYYY [at] h:mm');
  })
});
