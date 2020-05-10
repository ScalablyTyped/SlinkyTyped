package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.axeCore.mod.TagValue
import typingsSlinky.storybookAddonA11y.tagsMod.TagsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tags {
  @JSImport("@storybook/addon-a11y/dist/components/Report/Tags", "Tags")
  @js.native
  object component extends js.Object
  
  def withProps(p: TagsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tags: js.Array[TagValue]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[TagsProps]))
  }
}

