package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.IsHighlighted
import typingsSlinky.storybookUi.menuMod.MenuList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarMenu {
  
  @scala.inline
  def apply(isHighlighted: Boolean, menu: MenuList): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IsHighlighted]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu", "SidebarMenu")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IsHighlighted): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
