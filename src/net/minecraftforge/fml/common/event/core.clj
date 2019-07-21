(ns net.minecraftforge.fml.common.event.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraftforge.fml.common.event.FMLConstructionEvent])
(require '[net.minecraftforge.fml.common.event.FMLEvent])
(require '[net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent])
(require '[net.minecraftforge.fml.common.event.FMLInitializationEvent])
(require '[net.minecraftforge.fml.common.event.FMLInterModComms$IMCEvent])
(require '[net.minecraftforge.fml.common.event.FMLInterModComms$IMCMessage])
(require '[net.minecraftforge.fml.common.event.FMLInterModComms])
(require '[net.minecraftforge.fml.common.event.FMLLoadCompleteEvent])
(require '[net.minecraftforge.fml.common.event.FMLLoadEvent])
(require '[net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action])
(require '[net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$MissingMapping])
(require '[net.minecraftforge.fml.common.event.FMLMissingMappingsEvent])
(require '[net.minecraftforge.fml.common.event.FMLModDisabledEvent])
(require '[net.minecraftforge.fml.common.event.FMLModIdMappingEvent$RemapTarget])
(require '[net.minecraftforge.fml.common.event.FMLModIdMappingEvent])
(require '[net.minecraftforge.fml.common.event.FMLPostInitializationEvent])
(require '[net.minecraftforge.fml.common.event.FMLPreInitializationEvent])
(require '[net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent])
(require '[net.minecraftforge.fml.common.event.FMLServerStartedEvent])
(require '[net.minecraftforge.fml.common.event.FMLServerStartingEvent])
(require '[net.minecraftforge.fml.common.event.FMLServerStoppedEvent])
(require '[net.minecraftforge.fml.common.event.FMLServerStoppingEvent])
(require '[net.minecraftforge.fml.common.event.FMLStateEvent])