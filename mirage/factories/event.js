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
    var date = new Date(faker.date.future()).toISOString();
    return date;
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
    if(Math.round(Math.random()))
    {
      return `Format ${i}`;
    }
    else
    {
      return 'null'
    }
  },
});
