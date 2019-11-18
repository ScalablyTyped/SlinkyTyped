package typingsSlinky.three

import typingsSlinky.three.srcMaterialsShaderMaterialMod.ShaderMaterial
import typingsSlinky.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsSlinky.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import typingsSlinky.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.srcRenderersWebglWebGLShaderMod.WebGLShader
import typingsSlinky.three.srcRenderersWebglWebGLUniformsMod.WebGLUniforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLProgram", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLProgramMod extends js.Object {
  @js.native
  class WebGLProgram protected () extends js.Object {
    def this(
      renderer: WebGLRenderer,
      extensions: WebGLExtensions,
      code: String,
      material: ShaderMaterial,
      shader: WebGLShader,
      parameters: WebGLRendererParameters
    ) = this()
    /**
    	 * @deprecated Use {@link WebGLProgram#getAttributes getAttributes()} instead.
    	 */
    var attributes: js.Any = js.native
    var code: String = js.native
    var fragmentShader: WebGLShader = js.native
    var id: Double = js.native
    var program: js.Any = js.native
    /**
    	 * @deprecated Use {@link WebGLProgram#getUniforms getUniforms()} instead.
    	 */
    var uniforms: js.Any = js.native
    var usedTimes: Double = js.native
    var vertexShader: WebGLShader = js.native
    def destroy(): Unit = js.native
    def getAttributes(): js.Any = js.native
    def getUniforms(): WebGLUniforms = js.native
  }
  
}

