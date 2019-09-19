
'''
    dummy data generator to seed the database for events
'''

import json
from faker import Faker
import random

fake = Faker()

from faker.providers import date_time, internet, lorem
fake.add_provider(date_time)
fake.add_provider(internet)
fake.add_provider(lorem)

class Event(object):
    def __init__(self):
        self.title = fake.sentence(nb_words=6, variable_nb_words=True, ext_word_list=None)
        self.recurrent = bool(random.getrandbits(1))
        self.startTime = fake.past_datetime(start_date="-30d", tzinfo=None).isoformat()
        self.duration = random.randint(1, 5)
        self.participants = random.randint(0, 50)
        self.eventImage = fake.image_url()
        self.description = fake.paragraphs(nb=8, ext_word_list=None)

        delimiter = "\n\t"
        self.description = delimiter.join(self.description)

if __name__ == '__main__':

    number_to_generate = 25
    events_list = []

    with open("dummyEvents.json", "w") as file:

        #generate the random events
        for i in range(number_to_generate):
            event = Event()
            converted_json_object = json.dumps(event.__dict__)
            converted_json_object = converted_json_object + "\n"
            file.write(converted_json_object)
