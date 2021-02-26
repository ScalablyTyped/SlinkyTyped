package typingsSlinky.storybookAddonJest.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonJest.messageMod.MessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  @scala.inline
  def apply(msg: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MessageProps]))
  }
  
  @JSImport("@storybook/addon-jest/dist/components/Message", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MessageProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
