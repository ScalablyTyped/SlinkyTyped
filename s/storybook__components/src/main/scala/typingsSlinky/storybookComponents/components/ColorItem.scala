package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.colorPaletteMod.ColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorItem {
  @JSImport("@storybook/components", "ColorItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: ColorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(colors: js.Array[String], subtitle: String, title: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ColorProps]))
  }
}

