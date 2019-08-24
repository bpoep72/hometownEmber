import { Factory, faker } from 'ember-cli-mirage';

export default Factory.extend({
  name()
  {
    return faker.commerce.productMaterial();
  },
  minNumberOfCards()
  {
    return Math.floor(Math.random() * 100) + 1;
  },
  maxNumberOfCards()
  {
    return Math.floor(Math.random() * 100) + 1;
  },
  banlist()
  {
    return faker.internet.url();
  },
  maxCopies()
  {
    return Math.floor(Math.random() * 4) + 1;
  },
  description()
  {
    return faker.lorem.paragraph();
  },
});
