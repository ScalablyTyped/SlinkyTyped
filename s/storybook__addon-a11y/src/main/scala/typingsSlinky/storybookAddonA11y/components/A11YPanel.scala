package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanelProps
import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object A11YPanel {
  @JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "A11YPanel")
  @js.native
  object component extends js.Object
  
  def withProps(p: A11YPanelProps): Default[tag.type, typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanel] = new Default[tag.type, typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanel](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(active: Boolean, api: API): Default[tag.type, typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanel] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.storybookAddonA11y.a11YPanelMod.A11YPanel](js.Array(this.component, __props.asInstanceOf[A11YPanelProps]))
  }
}

