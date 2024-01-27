## Description

Written as part of a Java course.

## Requirements

Works at least with OpenJDK 17.0.9 but probably other versions as well.

## Compile and run

`git clone https://github.com/sparkhound772/object-oriented-quiz-game.git`

`cd object-oriented-quiz-game`

Compile in this order to avoid "cannot find symbol"-errors and such:

`javac -d bin -cp bin src/general/Question.java`

`javac -d bin -cp bin src/questions/*`

`javac -d bin -cp bin src/general/GameLogic.java`

`javac -d bin -cp bin src/general/Main.java`

Then run:

`java -cp bin general.Main`

## Future improvements

In hindsight not the most elegant solution - for instance it was obviously unnecessary to make a separate class for every question, instead of question strings that could be set in different instances of one question class.

If some version of this program is needed in the future that and other things will be fixed.
