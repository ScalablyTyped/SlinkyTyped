package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.componentMod.Component
import typingsSlinky.wonderJs.entityObjectMod.EntityObject
import typingsSlinky.wonderJs.gameObjectMod.GameObject
import typingsSlinky.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/RendererComponent", JSImport.Namespace)
@js.native
object rendererComponentMod extends js.Object {
  @js.native
  abstract class RendererComponent () extends Component {
    def render(renderer: Renderer, target: EntityObject, camera: GameObject): js.Any = js.native
  }
  
}

