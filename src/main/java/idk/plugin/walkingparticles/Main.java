package idk.plugin.walkingparticles;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.level.particle.*;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if (e.getFrom().equals(e.getTo())) return;
        Player p = e.getPlayer();
        if (p.isSpectator()) return;
        if (p.hasPermission("particle.angryvillager")) {
            p.getLevel().addParticle(new AngryVillagerParticle(p));
        }
        if (p.hasPermission("particle.bonemeal")) {
            p.getLevel().addParticle(new BoneMealParticle(p));
        }
        if (p.hasPermission("particle.bubble")) {
            p.getLevel().addParticle(new BubbleParticle(p));
        }
        if (p.hasPermission("particle.critical")) {
            p.getLevel().addParticle(new CriticalParticle(p));
        }
        if (p.hasPermission("particle.enchant")) {
            p.getLevel().addParticle(new EnchantParticle(p));
        }
        if (p.hasPermission("particle.enchantmenttable")) {
            p.getLevel().addParticle(new EnchantmentTableParticle(p));
        }
        if (p.hasPermission("particle.entityflame")) {
            p.getLevel().addParticle(new EntityFlameParticle(p));
        }
        if (p.hasPermission("particle.explode")) {
            p.getLevel().addParticle(new ExplodeParticle(p));
        }
        if (p.hasPermission("particle.flame")) {
            p.getLevel().addParticle(new FlameParticle(p));
        }
        if (p.hasPermission("particle.happyvillager")) {
            p.getLevel().addParticle(new HappyVillagerParticle(p));
        }
        if (p.hasPermission("particle.heart")) {
            p.getLevel().addParticle(new HeartParticle(p));
        }
        if (p.hasPermission("particle.ink")) {
            p.getLevel().addParticle(new InkParticle(p));
        }
        if (p.hasPermission("particle.lavadrip")) {
            p.getLevel().addParticle(new LavaDripParticle(p));
        }
        if (p.hasPermission("particle.lava")) {
            p.getLevel().addParticle(new LavaParticle(p));
        }
        if (p.hasPermission("particle.portal")) {
            p.getLevel().addParticle(new PortalParticle(p));
        }
        if (p.hasPermission("particle.rainsplash")) {
            p.getLevel().addParticle(new RainSplashParticle(p));
        }
        if (p.hasPermission("particle.redstone")) {
            p.getLevel().addParticle(new RedstoneParticle(p));
        }
        if (p.hasPermission("particle.smoke")) {
            p.getLevel().addParticle(new SmokeParticle(p));
        }
        if (p.hasPermission("particle.spore")) {
            p.getLevel().addParticle(new SporeParticle(p));
        }
        if (p.hasPermission("particle.waterdrip")) {
            p.getLevel().addParticle(new WaterDripParticle(p));
        }
        if (p.hasPermission("particle.water")) {
            p.getLevel().addParticle(new WaterParticle(p));
        }
    }
}
