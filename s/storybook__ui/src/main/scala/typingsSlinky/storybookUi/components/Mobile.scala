package typingsSlinky.storybookUi.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.InitialActive
import typingsSlinky.storybookUi.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mobile {
  
  @scala.inline
  def apply(
    Notifications: ReactComponentClass[_],
    Panel: ReactComponentClass[_],
    Preview: ReactComponentClass[_],
    Sidebar: ReactComponentClass[_],
    options: InitialActive,
    pages: js.Array[typingsSlinky.storybookUi.mobileMod.Page],
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.mobileMod.Mobile] = {
    val __props = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.mobileMod.Mobile](js.Array(this.component, __props.asInstanceOf[MobileProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/layout/mobile", "Mobile")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MobileProps): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.mobileMod.Mobile] = new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.mobileMod.Mobile](js.Array(this.component, p.asInstanceOf[js.Any]))
}
