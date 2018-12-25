import { Factory, faker } from 'ember-cli-mirage';

export default Factory.extend({
  title(i)
  {
    return `Event Title ${i}`;
  },
  recurrent()
  {
    return Boolean(Math.round(Math.random()));
  },
  startTime: faker.date.past(),
  duration: faker.random.number(),
  participants: faker.random.number(),
  format(i)
  {
    return `Format ${i}`;
  },
});
