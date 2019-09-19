

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
        self.client = None
        self.db = None
        
        self.seed_db()

    def make_dummy_data(self):

        self.events = [Event() for i in range(self.numEvents)]
        self.formats = [Format() for i in range(self.numFormats)]
        self.games = [Game() for i in range(self.numGames)]
        self.products = [Product() for i in range(self.numProducts)]
        self.socialMediaGroups = [SocialMediaGroups() for i in range(self.numSocialMediaGroups)]

    def seed_db(self):
        
        self.client = pymongo.MongoClient(self.connectionString)

        db = self.client.test

        print(self.client.list_database_names())


if __name__ == '__main__':

    Seeder(25, 3, 4, 50, 8)
