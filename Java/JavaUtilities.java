import java.util.HashSet;

/**
 *  <h2>Utilities for Java and JavaFx to create graphical programs</h2>
 *  <p>
 *  These utilities are intended to simplify programming with Java/JavaFX
 *  and keep the code clean.
 *  <p>
 *  <h3>Infos for this specific version:</h3>
 *  <p>
 *  Nop, you don't have to know anything to use this.
 *  <p>
 * @author bauer
 * @version 1.0
 * @since 16.03.2024
 */

public class JavaUtilities {

    /**
     * This method builds a long string using a string code that means a line break
     * @param text Every string that is given here as input is called a line, so every new string is called a line break.
     * @return Returns the new String with the line breaks (String codes).
     */
    public static String buildLongText(String... text) {
        StringBuilder s = new StringBuilder();
        String[] strings = text;
        for (String string : strings) {
            s.append(string);
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * This method checks whether an array has a duplicate.
     * @param objectArray The array.
     * @param <T> The typ from the objects in the array.
     * @return Returns true when the array has a Duplicate, false when not.
     */
    public static <T> boolean hasArrayDuplicates(T[] objectArray) {
        HashSet<T> set = new HashSet<>();
        for (T ob : objectArray) {
            if (!set.add(ob))
                return true; // Wenn der String bereits im Set vorhanden ist, gibt es ein Duplikat
        }

        return false; // Keine Duplikate gefunden
    }

    /**
     * <h1>Still at work</h1>
     */
    public static <T> boolean hasArrayNotNullDuplicates(T[] objectArray) {
        HashSet<T> set = new HashSet<>();
        for (T ob : objectArray) {
            if (ob != null) {
                if (!set.add(ob))
                    return true;
            }
        }

        return false;
    }

}
