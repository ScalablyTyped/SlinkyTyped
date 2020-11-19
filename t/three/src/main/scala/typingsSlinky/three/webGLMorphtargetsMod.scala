package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLMorphtargets", JSImport.Namespace)
@js.native
object webGLMorphtargetsMod extends js.Object {
  
  @js.native
  class WebGLMorphtargets protected () extends js.Object {
    def this(gl: WebGLRenderingContext) = this()
    
    def update(`object`: Object3D, geometry: BufferGeometry, material: Material, program: WebGLProgram): Unit = js.native
  }
}
