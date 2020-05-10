package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.iconMod.IconsProps
import typingsSlinky.storybookComponents.iconsMod.IconKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icons {
  @JSImport("@storybook/components", "Icons")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(icon: IconKey): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IconsProps]))
  }
}

