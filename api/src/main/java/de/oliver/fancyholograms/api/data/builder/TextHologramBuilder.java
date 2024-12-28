package de.oliver.fancyholograms.api.data.builder;

import de.oliver.fancyholograms.api.data.TextHologramData;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.TextDisplay;

import java.util.List;

public class TextHologramBuilder extends HologramBuilder{

    private TextHologramBuilder(String name, Location location) {
        super();
        this.data = new TextHologramData(name, location);
    }

    /**
     * Creates a new instance of TextHologramBuilder with the specified name and location.
     *
     * @param name the name of the text hologram
     * @param location the location of the text hologram
     * @return a new instance of TextHologramBuilder
     */
    public static TextHologramBuilder create(String name, Location location) {
        return new TextHologramBuilder(name, location);
    }

    public TextHologramBuilder text(List<String> text) {
        ((TextHologramData) data).setText(text);
        return this;
    }

    public TextHologramBuilder background(Color background) {
        ((TextHologramData) data).setBackground(background);
        return this;
    }

    public TextHologramBuilder textAlignment(TextDisplay.TextAlignment textAlignment) {
        ((TextHologramData) data).setTextAlignment(textAlignment);
        return this;
    }

    public TextHologramBuilder textShadow(boolean textShadow) {
        ((TextHologramData) data).setTextShadow(textShadow);
        return this;
    }

    public TextHologramBuilder seeThrough(boolean seeThrough) {
        ((TextHologramData) data).setSeeThrough(seeThrough);
        return this;
    }

    public TextHologramBuilder updateTextInterval(int updateTextInterval) {
        ((TextHologramData) data).setTextUpdateInterval(updateTextInterval);
        return this;
    }

}
