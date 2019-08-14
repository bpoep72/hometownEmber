import Route from '@ember/routing/route';

export default Route.extend({
  model(params) {
      //get a single event
      return this.store.find('event', params.event_id);
  },
  actions: {
    //will handle 404's for events
    error() {
      this.transitionTo('events.not-found');
    }
  }
});
