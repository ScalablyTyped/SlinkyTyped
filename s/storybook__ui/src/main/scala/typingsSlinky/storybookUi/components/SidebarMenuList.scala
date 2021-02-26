package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.Menu
import typingsSlinky.storybookUi.menuMod.MenuList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarMenuList {
  
  @scala.inline
  def apply(menu: MenuList, onHide: () => Unit): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], onHide = js.Any.fromFunction0(onHide))
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Menu]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "SidebarMenuList")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Menu): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
