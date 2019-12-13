import Route from '@ember/routing/route';
import { hash } from 'rsvp';
import { set } from '@ember/object';

export default Route.extend({
  model() {
      return hash({
        //get the events from the data store
        events: this.store.findAll('event', {}).then( events => events.sortBy('startTime') ),
        hours: this.store.findAll('hour', {}),
      });
  },

  setupController(controller, model) {
    this._super(...arguments);
    set(controller, 'events', model.events);
    set(controller, 'hours', model.hours);
  },

  actions: {
    error(error) {
      if(error.status === '403')
      {
        this.replaceWith('login');
      }
      else
      {
        this.transitionTo('site-down');
      }
    }
  }
});
