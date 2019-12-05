package typingsSlinky.wonderDotJs

import typingsSlinky.wonderDotJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typingsSlinky.wonderDotJs.distEs2015ComponentRendererMeshRendererMod.MeshRenderer
import typingsSlinky.wonderDotJs.distEs2015ComponentRendererRendererComponentMod.RendererComponent
import typingsSlinky.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typingsSlinky.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typingsSlinky.wonderDotJs.distEs2015RendererRendererRendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", JSImport.Namespace)
@js.native
object distEs2015ComponentRendererMeshRendererMod extends js.Object {
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

