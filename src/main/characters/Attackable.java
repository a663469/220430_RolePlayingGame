package main.characters;

import main.characters.Characters;

public interface Attackable {
    //public boolean attack();

    boolean attack(Characters characters);

    /* В качестве дополнительной задачи самостоятельно продумайте
    и реализуйте логику критических ударов (например, с какой-то
    вероятностью сила удара будет умножаться на 2). */
}
