import { Factory, faker } from 'ember-cli-mirage';

export default Factory.extend({
  name()
  {
    return faker.lorem.words();
  },
  link()
  {
    return faker.internet.url();
  },
  photo()
  {
    return faker.image.image();
  }
});
