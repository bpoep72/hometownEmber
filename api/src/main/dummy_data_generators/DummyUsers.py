
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

class User(object):
    def __init__(self):
        self.username = fake.user_name()
        self.password = fake.word(ext_word_list=None) + str(random.randint(0, 999))
        self.email = fake.ascii_email()
        self.verified = bool(random.getrandbits(1))

if __name__ == '__main__':

    number_to_generate = 40
    users_list = []

    with open("dummyUsers.json", "w") as file:

        for i in range(number_to_generate):
            user = User()
            converted_json_object = json.dumps(user.__dict__)
            converted_json_object = converted_json_object + "\n"
            file.write(converted_json_object)
