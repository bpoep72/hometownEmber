import { Factory } from 'ember-cli-mirage';

let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

export default Factory.extend({

  dayOfTheWeek(i)
  {
    return days[i]
  },

  openingTime()
  {
    var hour = Math.floor(Math.random() * 12) + 1;
    return String(hour) + " am";
  },

  closingTime()
  {
    var hour = Math.floor(Math.random() * 12) + 1;
    return String(hour) + " pm"
  },

});
