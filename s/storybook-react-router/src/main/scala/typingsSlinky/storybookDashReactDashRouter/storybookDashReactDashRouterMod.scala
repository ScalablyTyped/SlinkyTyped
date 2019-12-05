package typingsSlinky.storybookDashReactDashRouter

import slinky.core.ReactComponentClass
import typingsSlinky.atStorybookAddons.distTypesMod.DecoratorFunction
import typingsSlinky.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-react-router", JSImport.Namespace)
@js.native
object storybookDashReactDashRouterMod extends js.Object {
  @js.native
  class StoryRouter protected ()
    extends Component[Anon_Links, ComponentState, js.Any] {
    def this(props: Anon_Links) = this()
    def this(props: Anon_Links, context: js.Any) = this()
  }
  
  val StoryRouter: ReactComponentClass[Anon_Links] = js.native
  def default(): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = js.native
}

