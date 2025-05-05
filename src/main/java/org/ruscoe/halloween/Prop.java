package org.ruscoe.halloween;

/**
 * Represents a Halloween prop idea.
 */
public class Prop {

    private String name;
    private String type;

    /**
     * Constructs a new Prop with the given name and type.
     *
     * @param name The name of the prop
     * @param type The type of the prop (e.g., Pneumatic, Scare Actor)
     */
    public Prop(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of the prop.
     *
     * @return The prop name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of the prop.
     *
     * @return The prop type
     */
    public String getType() {
        return type;
    }
}
