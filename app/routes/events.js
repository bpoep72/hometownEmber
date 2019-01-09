import Route from '@ember/routing/route';

export default Route.extend({
  model() {
    //get the events from the data store
    return this.store.query('event', {});
  },
});
