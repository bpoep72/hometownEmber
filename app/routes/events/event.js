import Route from '@ember/routing/route';

export default Route.extend({
  model: function(params) {
      /*
      get the event that this subroute was loaded for an the
      game it is associated with.
      */
      return this.store.findRecord('event', params.event_id, {include: 'game,format'})
  },

  actions: {
    //will handle 404's for single events
    error() {
      this.transitionTo('events.not-found');
    }
  },
});
