package typingsSlinky.storybookReactRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookReactRouter.anon.Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StoryRouter {
  @JSImport("storybook-react-router", "StoryRouter")
  @js.native
  object component extends js.Object
  
  def withProps(p: Links): Default[tag.type, typingsSlinky.storybookReactRouter.mod.StoryRouter] = new Default[tag.type, typingsSlinky.storybookReactRouter.mod.StoryRouter](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[_]): Default[tag.type, typingsSlinky.storybookReactRouter.mod.StoryRouter] = {
    val __props = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.storybookReactRouter.mod.StoryRouter](js.Array(this.component, __props.asInstanceOf[Links]))
  }
}

