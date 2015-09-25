# ex-zoo
Create a zoo that has different kinds of animals that do different things.

You have been provided with a Zoo class that contains main() and an Animal[]
(but you need to allocate the actual array yourself).

You have also been given a generic Animal class that allows Animals to have a
name that will be printed by toString(), and they can show off by returning a
string from the showOff() method that describes what they do.

However, generic Animals are very boring and don't do anything to show off! You
should make some more interesting animals.  Make at least two classes for
specific animals that inherit from the Animal class.  Implement @Override
methods for showOff() that make your animals do more interesting things.  For
example, you may make a Swallow that "carries coconuts at an impressive
airspeed velocity!"  You should not have to modify the provided Animal class at
all to do this, although you will have to read & understand it in order to
inherit from it properly.

Finally, add some of the animals you created to the array of Animals in Zoo.
Then run your Zoo and watch how they show off for you!
