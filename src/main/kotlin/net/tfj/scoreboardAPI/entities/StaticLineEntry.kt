package net.verix.main.custom.scoreboard.entities

import net.kyori.adventure.text.Component
import net.verix.main.stuff.Messenger
import org.bukkit.entity.Player

// Line: Static content
data class StaticLineEntry(val line: String) : LineBaseEntry() {

    // Formats content once
    val text = Messenger.format(line)

    // Returns the static text
    override fun getText(player: Player): Component = text

    // Never updates
    override fun shouldUpdate(player: Player): Boolean = false
}
