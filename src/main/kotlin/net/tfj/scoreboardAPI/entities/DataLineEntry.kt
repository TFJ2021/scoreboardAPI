package net.tfj.scoreboardAPI.entities

import net.kyori.adventure.text.Component
import net.tfj.scoreboardAPI.ScoreboardAPI
import org.bukkit.entity.Player

/**
 * Data line entry. Display data that updates every [interval] ticks
 *
 * @param provider string method. [Player] input and returns String, Mini-message support.
 * @param interval amount of ticks until the line should be updated
 * @since 1.0
 */
data class DataLineEntry(val provider: (Player) -> String, val interval: Int) : LineBaseEntry() {
    // Returns the data text
    override fun getText(player: Player): Component = ScoreboardAPI.miniMessage.deserialize(provider(player))

    // Updates when interval reached
    override fun shouldUpdate(player: Player): Boolean = tick % interval == 0L
}
