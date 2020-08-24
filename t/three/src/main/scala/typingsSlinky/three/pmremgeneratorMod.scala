package typingsSlinky.three

import typingsSlinky.three.cubeTextureMod.CubeTexture
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTarget
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/PMREMGenerator", JSImport.Namespace)
@js.native
object pmremgeneratorMod extends js.Object {
  @js.native
  class PMREMGenerator protected () extends js.Object {
    def this(renderer: WebGLRenderer) = this()
    def compileCubemapShader(): Unit = js.native
    def compileEquirectangularShader(): Unit = js.native
    def dispose(): Unit = js.native
    def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
    def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
    def fromScene(scene: Scene): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: js.UndefOr[scala.Nothing], near: js.UndefOr[scala.Nothing], far: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: js.UndefOr[scala.Nothing], near: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: js.UndefOr[scala.Nothing], near: Double, far: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: js.UndefOr[scala.Nothing], far: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Double, far: Double): WebGLRenderTarget = js.native
  }
  
}

