/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ehu.isad.app;

import ehu.isad.list.LinkedList;

import static ehu.isad.utilities.StringUtils.join;
import static ehu.isad.utilities.StringUtils.split;
import static ehu.isad.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
