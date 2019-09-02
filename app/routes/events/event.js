import Route from '@ember/routing/route';

export default Route.extend({
  model: function(params)
  {
      return this.store.findRecord('event', params.event_id, {include: 'game,format'})
  },

  actions:
  {
    //will handle 404's for single events
    error()
    {
      this.transitionTo('events.not-found');
    }
  },
});
