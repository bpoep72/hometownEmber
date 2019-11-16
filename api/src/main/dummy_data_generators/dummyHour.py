import json
from faker import Faker
import random

fake = Faker()

from faker.providers import date_time
fake.add_provider(date_time)

class Hour(object):
    def __init__(self):
        self.dayOfTheWeek = fake.day_of_week()
        self.openingTime = str(random.randint(1, 12)) + 'AM'
        self.closingTime = str(random.randint(1, 12)) + 'PM'
