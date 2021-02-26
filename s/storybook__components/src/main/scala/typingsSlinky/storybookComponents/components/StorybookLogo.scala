package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.storybookLogoMod.StorybookLogoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StorybookLogo {
  
  @scala.inline
  def apply(alt: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[StorybookLogoProps]))
  }
  
  @JSImport("@storybook/components", "StorybookLogo")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StorybookLogoProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
