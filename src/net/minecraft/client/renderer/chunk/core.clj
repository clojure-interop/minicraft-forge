(ns net.minecraft.client.renderer.chunk.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status])
(require '[net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type])
(require '[net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator])
(require '[net.minecraft.client.renderer.chunk.ChunkRenderDispatcher])
(require '[net.minecraft.client.renderer.chunk.ChunkRenderWorker])
(require '[net.minecraft.client.renderer.chunk.CompiledChunk])
(require '[net.minecraft.client.renderer.chunk.IRenderChunkFactory])
(require '[net.minecraft.client.renderer.chunk.ListChunkFactory])
(require '[net.minecraft.client.renderer.chunk.ListedRenderChunk])
(require '[net.minecraft.client.renderer.chunk.RenderChunk])
(require '[net.minecraft.client.renderer.chunk.SetVisibility])
(require '[net.minecraft.client.renderer.chunk.VboChunkFactory])
(require '[net.minecraft.client.renderer.chunk.VisGraph])