package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureManagerMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", "TextureManager")
  @js.native
  class TextureManager protected () extends StObject {
    def this(gpgpu: GPGPUContext) = this()
    
    var _numBytesAllocated: js.Any = js.native
    
    var _numBytesFree: js.Any = js.native
    
    def acquireTexture(shapeRC: js.Tuple2[Double, Double], usage: TextureUsage, isPacked: Boolean): WebGLTexture = js.native
    
    def dispose(): Unit = js.native
    
    var freeTextures: js.Any = js.native
    
    def getNumFreeTextures(): Double = js.native
    
    def getNumUsedTextures(): Double = js.native
    
    var gpgpu: js.Any = js.native
    
    var log: js.Any = js.native
    
    var logEnabled: js.Any = js.native
    
    val numBytesAllocated: Double = js.native
    
    val numBytesFree: Double = js.native
    
    var numFreeTextures: js.Any = js.native
    
    var numUsedTextures: js.Any = js.native
    
    def releaseTexture(
      texture: WebGLTexture,
      shape: js.Tuple2[Double, Double],
      logicalTexType: TextureUsage,
      isPacked: Boolean
    ): Unit = js.native
    
    var usedTextures: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/texture_manager", "computeBytes")
  @js.native
  def computeBytes(
    shape: js.Tuple2[Double, Double],
    physicalTexType: PhysicalTextureType,
    gl: WebGLRenderingContext,
    textureConfig: TextureConfig,
    isPacked: Boolean
  ): Double = js.native
}
