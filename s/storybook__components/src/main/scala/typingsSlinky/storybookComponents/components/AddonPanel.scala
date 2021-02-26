package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.addonPanelMod.AddonPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddonPanel {
  
  @scala.inline
  def apply(active: Boolean): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[AddonPanelProps]))
  }
  
  @JSImport("@storybook/components", "AddonPanel")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AddonPanelProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
