package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookAddons.distMod.Addon
import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.storiesMod.Group
import typingsSlinky.storybookApi.storiesMod.Story
import typingsSlinky.storybookUi.toolbarMod.ToolData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolbarComp {
  
  @scala.inline
  def apply(api: API, isShown: Boolean, story: Story | Group, tabs: js.Array[Addon]): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(api = api.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ToolData]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "ToolbarComp")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ToolData): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
