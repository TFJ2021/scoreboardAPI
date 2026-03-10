package net.tfj.scoreboardAPI

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
    fun join(event: PlayerJoinEvent) {
        scoreboardAPI.resetScoreboard(event.player)
    }
}
