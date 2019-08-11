export default function() {

  this.namespace = '/api';
  this.urlPrefix = '';

  this.get('/events', (schema) => {
    return schema.events.all();
  });

  this.get('/hours', (schema) => {
    return schema.hours.all();
  })

}
