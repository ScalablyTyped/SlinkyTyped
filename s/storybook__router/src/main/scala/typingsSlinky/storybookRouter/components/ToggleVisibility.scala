package typingsSlinky.storybookRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookRouter.visibilityMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleVisibility {
  
  @scala.inline
  def apply(hidden: Boolean): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/router/dist/visibility", "ToggleVisibility")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
