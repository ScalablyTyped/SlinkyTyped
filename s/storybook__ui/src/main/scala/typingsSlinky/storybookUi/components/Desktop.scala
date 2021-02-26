package typingsSlinky.storybookUi.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.Key
import typingsSlinky.storybookUi.desktopMod.DesktopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Desktop {
  
  @scala.inline
  def apply(
    Notifications: ReactComponentClass[_],
    Panel: ReactComponentClass[_],
    Preview: ReactComponentClass[_],
    Sidebar: ReactComponentClass[_],
    docsOnly: Boolean,
    height: Double,
    options: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any,
    pages: js.Array[Key],
    panelCount: Double,
    viewMode: String,
    width: Double
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DesktopProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/layout/desktop", "Desktop")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DesktopProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
