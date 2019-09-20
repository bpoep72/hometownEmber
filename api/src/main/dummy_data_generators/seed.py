

from dummyEvent import Event
from dummyFormat import Format
from dummyGame import Game
from dummyProduct import Product
from dummySocialMediaGroups import SocialMediaGroups

import pymongo
import dns # required for connecting with SRV

class Seeder(object):

    def __init__(self, numEvents, numFormats, numGames, numProducts, numSocialMediaGroups):
        self.events = []
        self.formats = []
        self.games = []
        self.products = []
        self.socialMediaGroups = []

        self.numGames = numGames
        self.numFormats = numFormats
        self.numEvents = numEvents
        self.numProducts = numProducts
        self.numSocialMediaGroups = numSocialMediaGroups

        self.make_dummy_data()

        self.connectionString = "mongodb+srv://hometown:HyE6ktXZSFckfGK9@cluster0-aogrt.mongodb.net/test?retryWrites=true&w=majority"

        self.seed_db()

    def make_dummy_data(self):

        self.events = [Event() for i in range(self.numEvents)]
        self.formats = [Format() for i in range(self.numFormats)]
        self.games = [Game() for i in range(self.numGames)]
        self.products = [Product() for i in range(self.numProducts)]
        self.socialMediaGroups = [SocialMediaGroups() for i in range(self.numSocialMediaGroups)]

    def insert_documents(self, database, collection_name, objects):

        for i in range(len(objects)):
            object_to_insert = objects[i].__dict__
            database[collection_name].insert_one(object_to_insert)

    def seed_db(self):
        
        client = pymongo.MongoClient(self.connectionString)
        database = client['hometown']
        collections = database.list_collection_names()

        #remove old collections
        for i in range(len(collections)):
            database[ collections[i] ].drop()

        new_database = client['hometown']

        #add the new records
        self.insert_documents(new_database, 'games', self.games)
        self.insert_documents(new_database, 'formats', self.formats)
        self.insert_documents(new_database, 'events', self.events)
        self.insert_documents(new_database, 'products', self.products)
        self.insert_documents(new_database, 'social_media_groups', self.socialMediaGroups)

    def make_relationship(self, database, collection_name, field):


if __name__ == '__main__':

    Seeder(25, 3, 4, 50, 8)
