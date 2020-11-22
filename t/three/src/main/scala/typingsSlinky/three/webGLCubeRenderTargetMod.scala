package typingsSlinky.three

import typingsSlinky.three.cubeTextureMod.CubeTexture
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTarget
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/WebGLCubeRenderTarget", JSImport.Namespace)
@js.native
object webGLCubeRenderTargetMod extends js.Object {
  
  @js.native
  class WebGLCubeRenderTarget protected () extends WebGLRenderTarget {
    def this(size: Double) = this()
    def this(size: Double, options: WebGLRenderTargetOptions) = this()
    
    def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
    
    @JSName("texture")
    var texture_WebGLCubeRenderTarget: CubeTexture = js.native
  }
}
