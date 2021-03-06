package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.colorPaletteMod.ColorProps
import typingsSlinky.storybookComponents.colorPaletteMod.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorItem {
  
  @scala.inline
  def apply(colors: Colors, subtitle: String, title: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ColorProps]))
  }
  
  @JSImport("@storybook/components", "ColorItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ColorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
