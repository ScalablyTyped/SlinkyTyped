package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.webGLAttributesMod.WebGLAttributes
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLBindingStates", JSImport.Namespace)
@js.native
object webGLBindingStatesMod extends js.Object {
  @js.native
  class WebGLBindingStates protected () extends js.Object {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      attributes: WebGLAttributes,
      capabilities: WebGLCapabilities
    ) = this()
    def disableUnusedAttributes(): Unit = js.native
    def dispose(): Unit = js.native
    def enableAttribute(attribute: Double): Unit = js.native
    def initAttributes(): Unit = js.native
    def releaseStatesOfGeometry(): Unit = js.native
    def releaseStatesOfProgram(): Unit = js.native
    def reset(): Unit = js.native
    def resetDefaultState(): Unit = js.native
    def setup(
      `object`: Object3D,
      material: Material,
      program: WebGLProgram,
      geometry: BufferGeometry,
      index: BufferAttribute
    ): Unit = js.native
  }
  
}

