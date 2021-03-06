package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.descriptionMod.DescriptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Description {
  
  @scala.inline
  def apply(markdown: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[DescriptionProps]))
  }
  
  @JSImport("@storybook/components", "Description")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DescriptionProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
