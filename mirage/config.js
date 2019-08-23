export default function() {

  this.namespace = '/api';
  this.urlPrefix = '';

  //get all events
  this.get('/events', (schema) => {
    return schema.events.all();
  });

  //get one event
  this.get('events/:id', (schema, request) => {
    let id = request.params.id;
    return schema.events.find(id);
  });

  //get all store hours
  this.get('/hours', (schema) => {
    return schema.hours.all();
  });

}
