

from dummyEvent import Event
from dummyFormat import Format
from dummyGame import Game
from dummyProduct import Product
from dummySocialMediaGroups import SocialMediaGroups
from dummyUsers import User
from dummyHour import Hour

import pymongo
import dns # required for connecting with SRV
import random

class Seeder(object):

    def __init__(self):
        self.events = [Event() for i in range(25)]
        self.formats = [Format() for i in range(8)]
        self.games = [Game() for i in range(12)]
        self.products = [Product() for i in range(40)]
        self.socialMediaGroups = [SocialMediaGroups() for i in range(10)]
        self.users = [User() for i in range(25)]
        self.hours = [Hour() for i in range(7)]

        self.connectionString = "mongodb+srv://hometown-api:6Cp4EQWJeBOZmeze@cluster0-cf9id.mongodb.net/test?retryWrites=true&w=majority"

        self.database = None
        self.client = None
        self.connect_to_database()

    """
    Opens a connection to the database
    """
    def connect_to_database(self):
        self.client = pymongo.MongoClient(self.connectionString)
        self.database = self.client['hometown']

    """
    Inserts an array of python objects into the database
    """
    def insert_documents(self, database, collection_name, objects_to_insert):

        for i in range(len(objects_to_insert)):
            object_to_insert = objects_to_insert[i].__dict__
            database[collection_name].insert_one(object_to_insert)

    """
    Will seed the database for the given input
    """
    def seed_db(self):
        
        collections = self.database.list_collection_names()

        #remove old collections
        for i in range(len(collections)):
            self.database[ collections[i] ].drop()

        #add the new records
        self.insert_documents(self.database, 'users', self.users)

        self.insert_documents(self.database, 'hours', self.hours)

        self.insert_documents(self.database, 'games', self.games)

        self.insert_documents(self.database, 'formats', self.formats)
        self.relationship_has_a('formats', 'games', .2)

        self.insert_documents(self.database, 'events', self.events)
        self.relationship_has_a('events', 'games', .2)
        self.relationship_has_a('events', 'formats', .5)

        self.insert_documents(self.database, 'products', self.products)
        self.relationship_has_a('products', 'games', .4)

        self.insert_documents(self.database, 'socialMediaGroups', self.socialMediaGroups)
        self.relationship_has_a('socialMediaGroups', 'games', .5)

    """
    Will build relationships between objects and fields in the database
    
    Params:
        parent: the table of documents that need to reference related_to
        related_to: the table that the relationship links this document to
        probability_of_null: a float between 0 and 1 that describes how often the field should be null, 0. = 0% chance of       null, 1. = 100% of the time the field should be null
    """
    def relationship_has_a(self, parent, related_to, probability_of_null):
        
        #get all the documents within the parent table
        try:
            parent_cursor = self.database[parent].find({})
        except:
            raise Exception('Parent table of relationship does not exist.')

        for document in parent_cursor:
            try:
                #get a random document from related_to
                random_document = list(self.database[related_to].aggregate(
                    [ { "$sample": {'size': 1} } ]
                ))[0]
            except:
                raise Exception('Related table of relationship does not contain any documents')

            #get the document id
            random_document_id = random_document["_id"]

            #decide if this document will be null or not
            if(random.random() > probability_of_null):
                #update the current document to reference the random document
                self.database[parent].update_one({'_id': document['_id']}, {"$set": {related_to[:-1]: random_document_id} })
            
    """
    Will build relationships between objects and fields in the database
    
    Params:
        parent: the table of documents that need to reference related_to
        related_to: the table that the relationship links this document to
        min: the minimum number each parent will be related to
        max: the maximum number each parent will be related to
        probability_of_null: a float between 0 and 1 that describes how often the field should be null, 0. = 0% chance of       null, 1. = 100% of the time the field should be null
    """
    '''
    TODO: fix this method currently getting ids but cannot set them
    '''
    def relationship_has_many(self, parent, related_to, min, max, probability_of_null):
        
        #get all the documents within the parent table
        parent_cursor = self.database[parent].find({})

        for document in parent_cursor:
            #decide how many documents to link to
            num_documents = random.randint(min, max + 1)

            #get a random document from related_to
            random_documents = list(self.database[related_to].aggregate(
                [ { "$sample": {'size': num_documents} } ]
            ))

            random_document_ids = {}

            #get the document ids
            for i in range(len(random_documents)):
                random_document_ids[i] = random_documents[i]["_id"]
                print(random_document_ids[i])

            print(random_document_ids)

            #decide if this document will be null or not
            if(random.random() > probability_of_null and num_documents > 0):
                #update the current document to reference the random document
                self.database[parent].update_one({'_id': document['_id']}, {"$set": {related_to[:-1]: random_document_ids} })  

if __name__ == '__main__':

    seed = Seeder()

    seed.seed_db()

