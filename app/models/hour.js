import DS from 'ember-data';

/*
  This is the model that represents each opening and closing time per day
*/

//TODO: Remove this model, it is stupid

export default DS.Model.extend({
  dayOfTheWeek: DS.attr(),
  openingTime: DS.attr(),
  closingTime: DS.attr(),
});
