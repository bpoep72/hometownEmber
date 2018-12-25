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
  startTime()
  {
    var options = {weekday: 'long', month: 'long', day: 'numeric' };
    var date = faker.date.future();
    return date.toLocaleDateString('en-US', options);
  },
  duration()
  {
    return Math.floor(Math.random() * 3) + 1;
  },
  participants()
  {
   return Math.floor(Math.random() * 50) + 1;
  },
  format(i)
  {
    return `Format ${i}`;
  },
});
