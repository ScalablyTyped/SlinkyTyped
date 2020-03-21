package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.arrayBufferMod.ArrayBuffer
import typingsSlinky.wonderJs.edrawmodeMod.EDrawMode
import typingsSlinky.wonderJs.elementBufferMod.ElementBuffer
import typingsSlinky.wonderJs.webGLStateMod.WebGLState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/RenderCommand", JSImport.Namespace)
@js.native
object renderCommandMod extends js.Object {
  @js.native
  abstract class RenderCommand () extends js.Object {
    var drawMode: EDrawMode = js.native
    var webglState: WebGLState = js.native
    def dispose(): Unit = js.native
    /* protected */ def drawArray(vertexBuffer: ArrayBuffer): Unit = js.native
    /* protected */ def drawElements(indexBuffer: ElementBuffer): Unit = js.native
    def execute(): Unit = js.native
    def init(): Unit = js.native
  }
  
}

