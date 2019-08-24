import DS from 'ember-data';

export default DS.Model.extend({
  name: DS.attr(),
  minNumberOfCards: DS.attr(),
  maxNumberOfCards: DS.attr(),
  banlist: DS.attr(),
  maxCopies: DS.attr(),
  description: DS.attr(),

  game: DS.belongsTo('game', { async: false }),

});
