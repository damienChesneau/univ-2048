package fr.damienchesneau.ugame.logique;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Damien Chesneau <contact@damienchesneau.fr>
 */
public interface GameSaveService {

    public GameService getGaveByFileName(final String name);

    public void saveGame(final GameService plateau,final String fileName) throws FileNotFoundException, IOException;
}
