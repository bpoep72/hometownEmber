import Route from '@ember/routing/route';

export default Route.extend({
  model()
  {
    return this.store.findAll('social-media-group', {include:'game'} );
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
