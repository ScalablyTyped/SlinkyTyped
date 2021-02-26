package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.iconMod.IconsProps
import typingsSlinky.storybookComponents.iconsMod.IconKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icons {
  
  @scala.inline
  def apply(icon: IconKey): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IconsProps]))
  }
  
  @JSImport("@storybook/components", "Icons")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
