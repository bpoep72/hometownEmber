import { Factory, faker } from 'ember-cli-mirage';

export default Factory.extend({
  title()
  {
    return faker.commerce.productName();
  },
  owner()
  {
    return faker.company.companyName();
  },
  description()
  {
    return faker.lorem.paragraphs(12);
  },
});
