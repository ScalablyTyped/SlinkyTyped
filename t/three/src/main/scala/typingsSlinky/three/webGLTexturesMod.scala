package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLInfoMod.WebGLInfo
import typingsSlinky.three.webGLPropertiesMod.WebGLProperties
import typingsSlinky.three.webGLStateMod.WebGLState
import typingsSlinky.three.webGLUtilsMod.WebGLUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLTextures", JSImport.Namespace)
@js.native
object webGLTexturesMod extends js.Object {
  
  @js.native
  class WebGLTextures protected () extends js.Object {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      state: WebGLState,
      properties: WebGLProperties,
      capabilities: WebGLCapabilities,
      utils: WebGLUtils,
      info: WebGLInfo
    ) = this()
    
    def allocateTextureUnit(): Unit = js.native
    
    def resetTextureUnits(): Unit = js.native
    
    def safeSetTexture2D(texture: js.Any, slot: Double): Unit = js.native
    
    def safeSetTextureCube(texture: js.Any, slot: Double): Unit = js.native
    
    def setTexture2D(texture: js.Any, slot: Double): Unit = js.native
    
    def setTexture2DArray(texture: js.Any, slot: Double): Unit = js.native
    
    def setTexture3D(texture: js.Any, slot: Double): Unit = js.native
    
    def setTextureCube(texture: js.Any, slot: Double): Unit = js.native
    
    def setupRenderTarget(renderTarget: js.Any): Unit = js.native
    
    def updateMultisampleRenderTarget(renderTarget: js.Any): Unit = js.native
    
    def updateRenderTargetMipmap(renderTarget: js.Any): Unit = js.native
  }
}
