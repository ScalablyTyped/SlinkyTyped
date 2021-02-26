package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.WindowLocation
import typingsSlinky.storybookAddons.distMod.Addon
import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.storiesMod.Group
import typingsSlinky.storybookApi.storiesMod.Story
import typingsSlinky.storybookRouter.routerMod.RenderData
import typingsSlinky.storybookUi.toolbarMod.ToolData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolRes {
  
  @scala.inline
  def apply(
    api: API,
    isShown: Boolean,
    location: WindowLocation[LocationState],
    path: String,
    story: Story | Group,
    tabs: js.Array[Addon]
  ): Builder = {
    val __props = js.Dynamic.literal(api = api.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToolData with RenderData]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/toolbar", "ToolRes")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def navigate(value: NavigateFn): this.type = set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refId(value: String): this.type = set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def storyId(value: String): this.type = set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewMode(value: String): this.type = set("viewMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToolData with RenderData): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
