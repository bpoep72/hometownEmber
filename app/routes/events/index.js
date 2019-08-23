import Route from '@ember/routing/route';
import {hash} from 'rsvp';
import {set} from '@ember/object';

/* EVENTS PAGE INDEX */

export default Route.extend({
  model: function() {
      return hash({
        //get the events from the data store
        events: this.store.query('event', { include: 'format,game' }).then(events => events.sortBy('startTime'))
      });
  },

  setupController(controller, model) {
    this._super(...arguments);
    set(controller, 'events', model.events);
  },
});
