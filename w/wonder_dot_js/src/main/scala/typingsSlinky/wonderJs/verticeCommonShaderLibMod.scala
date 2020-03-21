package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.engineMaterialMod.EngineMaterial
import typingsSlinky.wonderJs.engineShaderLibMod.EngineShaderLib
import typingsSlinky.wonderJs.programMod.Program
import typingsSlinky.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/VerticeCommonShaderLib", JSImport.Namespace)
@js.native
object verticeCommonShaderLibMod extends js.Object {
  @js.native
  class VerticeCommonShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object VerticeCommonShaderLib extends js.Object {
    def create(): VerticeCommonShaderLib = js.native
  }
  
}

