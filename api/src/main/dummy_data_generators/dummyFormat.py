
'''
    dummy data generator to seed the database for users
'''

import json
from faker import Faker
import random

fake = Faker()

from faker.providers import date_time, internet, lorem
fake.add_provider(date_time)
fake.add_provider(internet)
fake.add_provider(lorem)

class Format(object):
    def __init__(self):
        self.name = " ".join(fake.words(nb = 2, ext_word_list=None))
        self.minNumberOfCards = random.randint(40, 100)
        self.maxNumberOfCards = random.randint(0, 150) + 40
        self.banlist = fake.uri()
        self.maxCopies = random.randint(1, 4)
        self.description = " ".join(fake.paragraphs(nb=16, ext_word_list=None))
        self.officialPage = fake.uri()

        self.game = None

    @staticmethod
    def make_dummy_json_file(filename, number_to_generate):

        generated_object_list = []

        with open(filename, "w") as file:
            for i in range(number_to_generate):
                dummy_object = Format()
                converted_json_object = json.dumps(dummy_object.__dict__)
                converted_json_object = converted_json_object + "\n"
                file.write(converted_json_object)

if __name__ == '__main__':

    Format.make_dummy_json_file("dummyFormat.json", 4)
