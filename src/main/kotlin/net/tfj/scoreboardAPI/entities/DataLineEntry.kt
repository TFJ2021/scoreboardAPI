package net.verix.main.custom.scoreboard.entities

import net.kyori.adventure.text.Component
import net.verix.main.stuff.Messenger
import org.bukkit.entity.Player

// Line: containing data
data class DataLineEntry(val provider: (Player) -> String, val interval: Int) : LineBaseEntry() {
    // Returns the data text
    override fun getText(player: Player): Component = Messenger.format(provider(player))

    // Updates when interval reached
    override fun shouldUpdate(player: Player): Boolean = tick % interval == 0L
}
