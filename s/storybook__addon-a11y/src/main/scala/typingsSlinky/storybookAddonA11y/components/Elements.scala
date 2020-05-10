package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.axeCore.mod.NodeResult
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import typingsSlinky.storybookAddonA11y.elementsMod.ElementsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elements {
  @JSImport("@storybook/addon-a11y/dist/components/Report/Elements", "Elements")
  @js.native
  object component extends js.Object
  
  def withProps(p: ElementsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(elements: js.Array[NodeResult], `type`: RuleType): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ElementsProps]))
  }
}

