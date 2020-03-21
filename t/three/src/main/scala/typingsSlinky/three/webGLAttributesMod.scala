package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.WebGL2RenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLAttributes", JSImport.Namespace)
@js.native
object webGLAttributesMod extends js.Object {
  @js.native
  class WebGLAttributes protected () extends js.Object {
    def this(gl: WebGL2RenderingContext) = this()
    def this(gl: WebGLRenderingContext) = this()
    def get(attribute: js.Any): js.Any = js.native
    def remove(attribute: js.Any): Unit = js.native
    def update(attribute: js.Any, bufferType: js.Array[_]): Unit = js.native
  }
  
}

