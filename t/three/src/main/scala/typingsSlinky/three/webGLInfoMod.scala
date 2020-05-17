package typingsSlinky.three

import typingsSlinky.three.anon.Calls
import typingsSlinky.three.anon.Textures
import typingsSlinky.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLInfo", JSImport.Namespace)
@js.native
object webGLInfoMod extends js.Object {
  @js.native
  class WebGLInfo () extends js.Object {
    var autoReset: Boolean = js.native
    var memory: Textures = js.native
    var programs: js.Array[WebGLProgram] | Null = js.native
    var render: Calls = js.native
    def reset(): Unit = js.native
  }
  
}

