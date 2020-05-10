package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.propDefMod.JsDocTags
import typingsSlinky.storybookComponents.propJsDocMod.PropJsDocProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PropJsDoc {
  @JSImport("@storybook/components/dist/blocks/PropsTable/PropJsDoc", "PropJsDoc")
  @js.native
  object component extends js.Object
  
  def withProps(p: PropJsDocProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tags: JsDocTags): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropJsDocProps]))
  }
}

