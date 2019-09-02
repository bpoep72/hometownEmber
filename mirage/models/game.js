import { Model, hasMany } from 'ember-cli-mirage';

export default Model.extend({
  events: hasMany('event'),
  formats: hasMany('format')
});
