/*
  This files purpose is to generate all the entities that will exist within
  the data store.
*/

export default function(server) {

  server.createList('hour', 7);

  //makes 4 games each with 4 related events
  server.createList('game', 4).forEach(function(game) {
    server.createList('event', 4, { game });
  });

}
