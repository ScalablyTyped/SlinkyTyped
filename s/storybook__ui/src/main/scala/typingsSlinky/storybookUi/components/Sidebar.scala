package typingsSlinky.storybookUi.components

import typingsSlinky.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar {
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SidebarProps): SharedBuilder_SidebarProps_1274792856 = new SharedBuilder_SidebarProps_1274792856(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    menu: js.Array[_],
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  ): SharedBuilder_SidebarProps_1274792856 = {
    val __props = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    new SharedBuilder_SidebarProps_1274792856(js.Array(this.component, __props.asInstanceOf[SidebarProps]))
  }
}

