import Route from '@ember/routing/route';
import { hash } from 'rsvp';
import { set } from '@ember/object';

export default Route.extend({
  model() {
      return hash({
        //get the events from the data store
        events: this.store.query('event', {}).then( events => events.sortBy('startTime') ),
        hours: this.store.query('hour', {}),
      });
  },

  setupController(controller, model) {
    this._super(...arguments);
    set(controller, 'events', model.events);
    set(controller, 'hours', model.hours);
  },
});
