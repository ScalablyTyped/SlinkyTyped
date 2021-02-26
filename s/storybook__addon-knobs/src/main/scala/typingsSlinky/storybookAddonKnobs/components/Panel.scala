package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookAddonKnobs.anon.PickAPIonoffemitgetQueryP
import typingsSlinky.storybookAddonKnobs.panelMod.KnobPanelProps
import typingsSlinky.storybookAddonKnobs.panelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @scala.inline
  def apply(active: scala.Boolean, api: PickAPIonoffemitgetQueryP): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KnobPanelProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onReset(value: js.Object): this.type = set("onReset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KnobPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
