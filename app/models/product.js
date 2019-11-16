import DS from 'ember-data';

export default DS.Model.extend({
    name: DS.attr(),
    manufacture: DS.attr(),
    pricePerUnit: DS.attr(),
    pricePerItem: DS.attr(),
    units: DS.attr(),
    description: DS.attr(),
    
    material: DS.attr(),
    color: DS.attr(),
    edition: DS.attr(),
    releaseDate: DS.attr(),
    picture: DS.attr(),
    size: DS.attr(),
    
});
