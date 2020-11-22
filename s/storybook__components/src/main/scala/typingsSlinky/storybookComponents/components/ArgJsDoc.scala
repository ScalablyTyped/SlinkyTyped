package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.argJsDocMod.ArgJsDocArgs
import typingsSlinky.storybookComponents.typesMod.JsDocTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArgJsDoc {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgJsDoc", "ArgJsDoc")
  @js.native
  object component extends js.Object
  
  def withProps(p: ArgJsDocArgs): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(tags: JsDocTags): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ArgJsDocArgs]))
  }
}
