package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLUniforms")
@js.native
class WebGLUniforms protected ()
  extends typingsSlinky.three.srcRenderersWebglWebGLUniformsMod.WebGLUniforms {
  def this(gl: js.Any, program: typingsSlinky.three.srcRenderersWebglWebGLProgramMod.WebGLProgram) = this()
}

/* static members */
@JSImport("three", "WebGLUniforms")
@js.native
object WebGLUniforms extends js.Object {
  def evalDynamic(seq: js.Any, values: js.Array[_], `object`: js.Any, camera: js.Any): js.Array[_] = js.native
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def splitDynamic(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def upload(
    gl: js.Any,
    seq: js.Any,
    values: js.Array[_],
    textures: typingsSlinky.three.srcRenderersWebglWebGLTexturesMod.WebGLTextures
  ): Unit = js.native
}

