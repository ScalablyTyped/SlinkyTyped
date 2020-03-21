package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.engineShaderSourceBuilderMod.EngineShaderSourceBuilder
import typingsSlinky.wonderJs.shaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/shader/EngineShader", JSImport.Namespace)
@js.native
object engineShaderMod extends js.Object {
  @js.native
  abstract class EngineShader () extends Shader {
    @JSName("sourceBuilder")
    var sourceBuilder_EngineShader: EngineShaderSourceBuilder = js.native
  }
  
}

