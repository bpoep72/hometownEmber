import DS from 'ember-data';

export default DS.Model.extend({
  title: DS.attr(),
  owner: DS.attr(),
  description: DS.attr(),

  events: DS.hasMany('event'),
  formats: DS.hasMany('format'),
});
