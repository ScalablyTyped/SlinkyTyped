package typingsSlinky.storybookDashReactDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookAddons.distTypesMod.StoryApi
import typingsSlinky.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import typingsSlinky.storybookDashReactDashRouter.Anon_Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StoryRouter
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.storybookDashReactDashRouter.storybookDashReactDashRouterMod.StoryRouter
    ] {
  @JSImport("storybook-react-router", "StoryRouter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    links: js.Object,
    routerProps: MemoryRouterProps,
    story: StoryApi[_],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.storybookDashReactDashRouter.storybookDashReactDashRouterMod.StoryRouter
  ] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_Links
}

