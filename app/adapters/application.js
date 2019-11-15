import DS from 'ember-data';

export default DS.RESTAdapter.extend({
  namespace: '',
  host: 'http://localhost:9001'
});
