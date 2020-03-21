package typingsSlinky.storybookReactRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookReactRouter.AnonLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StoryRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.storybookReactRouter.mod.StoryRouter] {
  @JSImport("storybook-react-router", "StoryRouter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    links: js.Object,
    routerProps: MemoryRouterProps,
    story: StoryApi[_],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.storybookReactRouter.mod.StoryRouter] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonLinks
}

