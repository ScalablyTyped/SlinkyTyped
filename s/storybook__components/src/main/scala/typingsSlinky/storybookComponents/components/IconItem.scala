package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.iconGalleryMod.IconItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconItem {
  
  @scala.inline
  def apply(name: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IconItemProps]))
  }
  
  @JSImport("@storybook/components", "IconItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconItemProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
