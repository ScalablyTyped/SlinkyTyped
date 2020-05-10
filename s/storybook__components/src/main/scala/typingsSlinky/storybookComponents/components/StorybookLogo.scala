package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.storybookLogoMod.StorybookLogoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StorybookLogo {
  @JSImport("@storybook/components", "StorybookLogo")
  @js.native
  object component extends js.Object
  
  def withProps(p: StorybookLogoProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(alt: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[StorybookLogoProps]))
  }
}

