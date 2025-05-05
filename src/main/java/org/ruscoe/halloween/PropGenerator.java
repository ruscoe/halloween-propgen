package org.ruscoe.halloween;

import java.util.Random;

/**
 * Utility class responsible for generating random Halloween props.
 */
public class PropGenerator {

    // Name parts
    private static final String[] NAME_PREFIXES = {
            "Ghastly"
    };

    private static final String[] NAME_SUFFIXES = {
            "Specter"
    };

    // Prop types
    private static final String[] TYPES = {
            "Pneumatic",
            "Scare Actor"
    };

    private static final Random random = new Random();

    /**
     * Generates a random Prop with a random name and type.
     *
     * @return A randomly generated Prop object
     */
    public static Prop generate() {
        String name = generateRandomName();
        String type = TYPES[random.nextInt(TYPES.length)];
        return new Prop(name, type);
    }

    /**
     * Generates a random name by combining a random prefix and suffix.
     *
     * @return The generated name
     */
    private static String generateRandomName() {
        String prefix = NAME_PREFIXES[random.nextInt(NAME_PREFIXES.length)];
        String suffix = NAME_SUFFIXES[random.nextInt(NAME_SUFFIXES.length)];
        return prefix + " " + suffix;
    }
}
