package typingsSlinky.three.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLUniforms")
@js.native
class WebGLUniforms protected ()
  extends typingsSlinky.three.webGLUniformsMod.WebGLUniforms {
  def this(gl: WebGLRenderingContext, program: typingsSlinky.three.webGLProgramMod.WebGLProgram) = this()
}
/* static members */
object WebGLUniforms {
  
  @JSImport("three", "WebGLUniforms.seqWithValue")
  @js.native
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("three", "WebGLUniforms.upload")
  @js.native
  def upload(
    gl: WebGLRenderingContext,
    seq: js.Any,
    values: js.Array[_],
    textures: typingsSlinky.three.webGLTexturesMod.WebGLTextures
  ): Unit = js.native
}
