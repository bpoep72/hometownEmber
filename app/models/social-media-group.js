import DS from 'ember-data';

export default DS.Model.extend({
  name: DS.attr(),
  link: DS.attr(),
  photo: DS.attr(),
  game: DS.belongsTo('game', { async: false }),
});
