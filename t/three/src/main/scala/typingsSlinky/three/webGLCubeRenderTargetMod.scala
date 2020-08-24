package typingsSlinky.three

import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTarget
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/WebGLCubeRenderTarget", JSImport.Namespace)
@js.native
object webGLCubeRenderTargetMod extends js.Object {
  @js.native
  class WebGLCubeRenderTarget protected () extends WebGLRenderTarget {
    def this(size: Double) = this()
    def this(size: Double, options: WebGLRenderTargetOptions) = this()
    def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
  }
  
}

