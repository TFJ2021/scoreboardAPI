package net.tfj.scoreboardAPI.examples

import net.tfj.scoreboardAPI.ScoreboardAPI
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    // Variables
    companion object {
        lateinit var scoreboardAPI: ScoreboardAPI
    }

    // On enable
    override fun onEnable() {
        // Creates new instance of ScoreboardAPI
        scoreboardAPI = ScoreboardAPI(this, ExampleScoreboard)
    }

    // On disable
    override fun onDisable() {
        // Plugin shutdown logic
    }

    // On player join
    @EventHandler
    fun join(event: PlayerJoinEvent) {
        scoreboardAPI.resetScoreboard(event.player)
    }
}
