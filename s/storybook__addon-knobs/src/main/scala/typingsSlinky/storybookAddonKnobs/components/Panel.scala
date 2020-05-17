package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookAddonKnobs.anon.PickAPIonoffemitgetQueryP
import typingsSlinky.storybookAddonKnobs.panelMod.KnobPanelProps
import typingsSlinky.storybookAddonKnobs.panelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel {
  @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onReset(value: js.Object): this.type = set("onReset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KnobPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(active: scala.Boolean, api: PickAPIonoffemitgetQueryP): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KnobPanelProps]))
  }
}

