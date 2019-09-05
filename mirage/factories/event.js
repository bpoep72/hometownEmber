import { Factory, faker } from 'ember-cli-mirage';

export default Factory.extend({
  id(i)
  {
    return i + 1;
  },
  title(i)
  {
    return `Event Title ${i + 1}`;
  },
  description()
  {
    //use a random boolean to decide whether an event has a description or not
    if(Math.round(Math.random()))
    {Math.round(Math.random())
      return faker.lorem.paragraphs(15);
    }
    else
    {
      return "";
    }
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
  eventImage()
  {
    return faker.image.image();
  },
});
