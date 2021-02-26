package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.axeCore.mod.TagValue
import typingsSlinky.storybookAddonA11y.tagsMod.TagsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tags {
  
  @scala.inline
  def apply(tags: js.Array[TagValue]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TagsProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Tags", "Tags")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TagsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
