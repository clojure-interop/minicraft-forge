(ns net.minecraftforge.event.entity.player.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraftforge.event.entity.player.AchievementEvent])
(require '[net.minecraftforge.event.entity.player.AnvilRepairEvent])
(require '[net.minecraftforge.event.entity.player.ArrowLooseEvent])
(require '[net.minecraftforge.event.entity.player.ArrowNockEvent])
(require '[net.minecraftforge.event.entity.player.AttackEntityEvent])
(require '[net.minecraftforge.event.entity.player.BonemealEvent])
(require '[net.minecraftforge.event.entity.player.EntityItemPickupEvent])
(require '[net.minecraftforge.event.entity.player.FillBucketEvent])
(require '[net.minecraftforge.event.entity.player.ItemTooltipEvent])
(require '[net.minecraftforge.event.entity.player.PlayerContainerEvent$Close])
(require '[net.minecraftforge.event.entity.player.PlayerContainerEvent$Open])
(require '[net.minecraftforge.event.entity.player.PlayerContainerEvent])
(require '[net.minecraftforge.event.entity.player.PlayerDestroyItemEvent])
(require '[net.minecraftforge.event.entity.player.PlayerDropsEvent])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$BreakSpeed])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$Clone])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$HarvestCheck])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$LoadFromFile])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$NameFormat])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$SaveToFile])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$StartTracking])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$StopTracking])
(require '[net.minecraftforge.event.entity.player.PlayerEvent$Visibility])
(require '[net.minecraftforge.event.entity.player.PlayerEvent])
(require '[net.minecraftforge.event.entity.player.PlayerFlyableFallEvent])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteractSpecific])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickEmpty])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickEmpty])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem])
(require '[net.minecraftforge.event.entity.player.PlayerInteractEvent])
(require '[net.minecraftforge.event.entity.player.PlayerPickupXpEvent])
(require '[net.minecraftforge.event.entity.player.PlayerSetSpawnEvent])
(require '[net.minecraftforge.event.entity.player.PlayerSleepInBedEvent])
(require '[net.minecraftforge.event.entity.player.PlayerWakeUpEvent])
(require '[net.minecraftforge.event.entity.player.SleepingLocationCheckEvent])
(require '[net.minecraftforge.event.entity.player.UseHoeEvent])