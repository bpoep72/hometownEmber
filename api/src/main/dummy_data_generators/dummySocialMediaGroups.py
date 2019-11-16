
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

class SocialMediaGroups(object):
    def __init__(self):
        self.name = " ".join(fake.words(nb = 4, ext_word_list=None))
        self.link = fake.uri()
        self.photo = fake.uri()

        self.game = None

    @staticmethod
    def make_dummy_json_file(filename, number_to_generate):

        generated_object_list = []

        with open(filename, "w") as file:
            for i in range(number_to_generate):
                dummy_object = SocialMediaGroups()
                converted_json_object = json.dumps(dummy_object.__dict__)
                converted_json_object = converted_json_object + "\n"
                file.write(converted_json_object)

if __name__ == '__main__':

    SocialMediaGroups.make_dummy_json_file("dummySocialMediaGroups.json", 8)
