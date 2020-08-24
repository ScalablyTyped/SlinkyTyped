package typingsSlinky.three

import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typingsSlinky.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/CubeCamera", JSImport.Namespace)
@js.native
object cubeCameraMod extends js.Object {
  @js.native
  class CubeCamera protected () extends Object3D {
    def this(near: Double, far: Double, renderTarget: WebGLCubeRenderTarget) = this()
    var renderTarget: WebGLCubeRenderTarget = js.native
    @JSName("type")
    var type_CubeCamera: typingsSlinky.three.threeStrings.CubeCamera = js.native
    def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
  }
  
}

