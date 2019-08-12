import Route from '@ember/routing/route';

export default Route.extend({
  model() {
      return Ember.RSVP.hash({
        //get the events from the data store
        events: this.store.query('event', {}).then(events => events.sortBy('startTime'))
      });
  },

  setupController(controller, model) {
    this._super(...arguments);
    Ember.set(controller, 'events', model.events);
  },
});
