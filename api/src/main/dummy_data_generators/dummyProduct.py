
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

class Product(object):
    def __init__(self):
        self.name = " ".join(fake.words(nb = 2))
        self.manufacture = fake.company()
        self.pricePerUnit = str(random.randint(0, 300)) + "." + str(random.randint(0, 99))
        self.pricePerItem = str(random.randint(0, 300)) + "." + str(random.randint(0, 99))
        self.units = random.randint(1, 36)
        self.description = " ".join(fake.paragraphs(nb=16, ext_word_list=None))

        self.material = " ".join(fake.words(nb = 1))
        self.color = " ".join(fake.words(nb = 2))
        self.edition = random.randint(1, 36)
        self.releaseDate =  fake.past_datetime(start_date="-30d", tzinfo=None).isoformat()
        self.picture = fake.image_url()
        self.size = str(random.randint(1, 36)) + "x" + str(random.randint(1, 36))

    @staticmethod
    def make_dummy_json_file(filename, number_to_generate):

        generated_object_list = []

        with open(filename, "w") as file:
            for i in range(number_to_generate):
                dummy_object = Product()
                converted_json_object = json.dumps(dummy_object.__dict__)
                converted_json_object = converted_json_object + "\n"
                file.write(converted_json_object)

if __name__ == '__main__':

    Product.make_dummy_json_file("dummyProduct.json", 50)
