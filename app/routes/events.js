import Route from '@ember/routing/route';

export default Route.extend({
  model() {
    var events = this.store.findAll('event');
    return events;
  }
});
