import Route from '@ember/routing/route';
import {
  hash
} from 'rsvp';
import {
  set
} from '@ember/object';

/* EVENTS PAGE INDEX */

export default Route.extend({
  model: function () {
    return hash({
      //get the events from the data store
      events: this.store.findAll('event', {
        include: 'game,format',
        reload: true,
      }).then(events => events.sortBy('startTime')),
    });
  },

  setupController(controller, model) {
    this._super(...arguments);
    set(controller, 'events', model.events);
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
