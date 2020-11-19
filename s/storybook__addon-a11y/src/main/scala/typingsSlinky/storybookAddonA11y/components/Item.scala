package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import typingsSlinky.storybookAddonA11y.itemMod.ItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Item", "Item")
  @js.native
  object component extends js.Object
  
  def withProps(p: ItemProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(item: Result, `type`: RuleType): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ItemProps]))
  }
}
