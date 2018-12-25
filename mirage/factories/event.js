import { Factory, faker } from 'ember-cli-mirage';

export default Factory.extend({
  title(i)
  {
    return `Event Title ${i}`;
  },
  recurrence(i)
  {
    return `${i} often`;
  },
  startTime: faker.date.past(),
  duration: faker.random.number(),
  participants: faker.random.number(),
  format(i)
  {
    return `Format${i}`;
  },
});