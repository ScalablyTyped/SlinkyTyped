package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.gameObjectMod.GameObject
import typingsSlinky.wonderJs.geometryMod.Geometry
import typingsSlinky.wonderJs.quadCommandMod.QuadCommand
import typingsSlinky.wonderJs.rendererComponentMod.RendererComponent
import typingsSlinky.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", JSImport.Namespace)
@js.native
object meshRendererMod extends js.Object {
  @js.native
  class MeshRenderer () extends RendererComponent {
    @JSName("entityObject")
    var entityObject_MeshRenderer: GameObject = js.native
    /* protected */ def createDrawCommand(target: GameObject, geometry: Geometry, camera: GameObject): QuadCommand = js.native
    def render(renderer: Renderer, target: GameObject, camera: GameObject): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MeshRenderer extends js.Object {
    def create(): MeshRenderer = js.native
  }
  
}

