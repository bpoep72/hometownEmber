import DS from 'ember-data';

export default DS.Model.extend({
  title: DS.attr(),
  recurrence: DS.attr(),
  startTime: DS.attr(),
  duration: DS.attr(),
  participants: DS.attr(),
  format: DS.attr(),
});
