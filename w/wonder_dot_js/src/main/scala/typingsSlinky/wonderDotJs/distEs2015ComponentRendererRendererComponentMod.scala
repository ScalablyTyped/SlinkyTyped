package typingsSlinky.wonderDotJs

import typingsSlinky.wonderDotJs.distEs2015CoreComponentMod.Component
import typingsSlinky.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typingsSlinky.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typingsSlinky.wonderDotJs.distEs2015RendererRendererRendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/renderer/RendererComponent", JSImport.Namespace)
@js.native
object distEs2015ComponentRendererRendererComponentMod extends js.Object {
  @js.native
  abstract class RendererComponent () extends Component {
    def render(renderer: Renderer, target: EntityObject, camera: GameObject): js.Any = js.native
  }
  
}

