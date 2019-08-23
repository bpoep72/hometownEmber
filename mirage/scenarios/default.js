/*
  This files purpose is to generate all the entities that will exist within
  the data store.
*/

export default function(server) {

  server.createList('hour', 7);

  //make some games
  server.createList('game', 4).forEach(function(game) {
    //make some formats
    server.createList('format', 3, { game }).forEach(function(format) {
      //make some events with all relationships expressed
      server.createList('event', 1, { game, format });
    });

    //make events with games but without formats
    server.createList('event', 3, { game, format: null })
  });

  //make events without games or formats
  server.createList('event', 5, { game: null, format: null });


}
