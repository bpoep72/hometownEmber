import Route from '@ember/routing/route';

export default Route.extend({

    actions: {
        error(error) {
          if(error.status === '403')
          {
            this.replaceWith('login');
          }
          else
          {
            this.transitionTo('homepage');
          }
        }
    }
});
