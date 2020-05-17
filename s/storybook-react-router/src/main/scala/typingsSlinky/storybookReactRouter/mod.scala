package typingsSlinky.storybookReactRouter

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookReactRouter.anon.Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-react-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class StoryRouter protected ()
    extends Component[Links, js.Object, js.Any] {
    def this(props: Links) = this()
    def this(props: Links, context: js.Any) = this()
  }
  
  def default(): DecoratorFunction[ReactElement] = js.native
  def default(links: js.Object): DecoratorFunction[ReactElement] = js.native
  def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[ReactElement] = js.native
  @js.native
  object StoryRouter extends TopLevel[ReactComponentClass[Links]]
  
}

