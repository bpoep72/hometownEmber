
'''
    dummy data generator to seed the database for users
'''

import json
from faker import Faker
import random

fake = Faker()

from faker.providers import date_time, internet, lorem, company
fake.add_provider(date_time)
fake.add_provider(internet)
fake.add_provider(lorem)
fake.add_provider(company)

class Game(object):
    def __init__(self):
        self.title = fake.sentence(nb_words=2, variable_nb_words=True, ext_word_list=None)
        self.owner = fake.company()
        self.description = " ".join(fake.paragraphs(nb=16))

    @staticmethod
    def make_dummy_json_file(filename, number_to_generate):

        generated_object_list = []

        with open(filename, "w") as file:
            for i in range(number_to_generate):
                dummy_object = Game()
                converted_json_object = json.dumps(dummy_object.__dict__)
                converted_json_object = converted_json_object + "\n"
                file.write(converted_json_object)

if __name__ == '__main__':

    Game.make_dummy_json_file("dummyGame.json", 3)
