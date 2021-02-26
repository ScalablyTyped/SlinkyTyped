package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.argJsDocMod.ArgJsDocArgs
import typingsSlinky.storybookComponents.typesMod.JsDocTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArgJsDoc {
  
  @scala.inline
  def apply(tags: JsDocTags): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ArgJsDocArgs]))
  }
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgJsDoc", "ArgJsDoc")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArgJsDocArgs): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
