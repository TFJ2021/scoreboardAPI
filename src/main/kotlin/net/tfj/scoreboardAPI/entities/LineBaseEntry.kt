package net.tfj.scoreboardAPI.entities

import net.kyori.adventure.text.Component
import org.bukkit.entity.Player

/**
 * The base interface for lines
 *
 * It is not recommend to use this method to use unless you want to create a new line typ
 * @since 1.0
 */
abstract class LineBaseEntry {

    /**
     * Current frame tick
     */
    var tick = 0L

    /**
     * Gets the up-to-date/current [Component] for the line
     *
     * @param player the player that "requests" the line
     * @return [Component]
     * @since 1.0
     */
    abstract fun getText(player: Player): Component

    /**
     * Checks if the line should be updated
     *
     * @param player required for the data lines
     * @return true when it should be updated, false otherwise
     * @since 1.0
     */
    abstract fun shouldUpdate(player: Player): Boolean
}
