package typingsSlinky.wonderDotJs

import typingsSlinky.wonderDotJs.distEs2015MaterialStandardBasicMaterialMod.StandardBasicMaterial
import typingsSlinky.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typingsSlinky.wonderDotJs.distEs2015RendererShaderLibBasicEndBasicShaderLibMod.EndBasicShaderLib
import typingsSlinky.wonderDotJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/EndBasicShaderLib", JSImport.Namespace)
@js.native
object distEs2015RendererShaderLibBasicEndBasicShaderLibMod extends js.Object {
  @js.native
  class EndBasicShaderLib () extends EngineShaderLib {
    def setShaderDefinition(cmd: QuadCommand, material: StandardBasicMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object EndBasicShaderLib extends js.Object {
    def create(): EndBasicShaderLib = js.native
  }
  
}

