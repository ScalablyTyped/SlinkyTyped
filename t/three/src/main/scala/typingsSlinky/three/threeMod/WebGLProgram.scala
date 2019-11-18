package typingsSlinky.three.threeMod

import typingsSlinky.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typingsSlinky.three.srcRenderersWebglWebGLProgramMod.WebGLProgram {
  def this(
    renderer: typingsSlinky.three.srcRenderersWebGLRendererMod.WebGLRenderer,
    extensions: typingsSlinky.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typingsSlinky.three.srcMaterialsShaderMaterialMod.ShaderMaterial,
    shader: typingsSlinky.three.srcRenderersWebglWebGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

