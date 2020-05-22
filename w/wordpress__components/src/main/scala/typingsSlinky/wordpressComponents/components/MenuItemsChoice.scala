package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Choice
import typingsSlinky.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Props
import typingsSlinky.wordpressComponents.mod.MenuItemsChoice.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItemsChoice {
  @JSImport("@wordpress/components", "MenuItemsChoice")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(choices: js.Array[Choice], onSelect: String => Unit, value: String): Default[tag.type, ^] = {
    val __props = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
    new Default[tag.type, ^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

