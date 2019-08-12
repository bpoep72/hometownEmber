import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('events', function(){
    this.route('event', {path: '/:event_id'})
    this.route('index', {path: '/'});
    this.route('not-found', {path: '/not-found'})
  });
  this.route('products');
  this.route('homepage');
  this.route('social');
  this.route('location');

  this.route('components', function() {
    this.route('events-list');
  });
});

export default Router;
