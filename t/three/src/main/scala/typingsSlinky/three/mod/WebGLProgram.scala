package typingsSlinky.three.mod

import typingsSlinky.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typingsSlinky.three.webGLProgramMod.WebGLProgram {
  def this(
    renderer: typingsSlinky.three.webGLRendererMod.WebGLRenderer,
    extensions: typingsSlinky.three.webGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typingsSlinky.three.shaderMaterialMod.ShaderMaterial,
    shader: typingsSlinky.three.webGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

