import Route from '@ember/routing/route';
import {all} from 'rsvp';

export default Route.extend({
  model: function(params) {
      return this.store.findRecord('event', params.event_id, {include: 'game'})
  },

  actions: {
    //will handle 404's for events
    error() {
      this.transitionTo('events.not-found');
    }
  },
});
