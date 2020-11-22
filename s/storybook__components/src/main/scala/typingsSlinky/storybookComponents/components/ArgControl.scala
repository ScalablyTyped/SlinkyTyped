package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.argControlMod.ArgControlProps
import typingsSlinky.storybookComponents.typesMod.ArgType
import typingsSlinky.storybookComponents.typesMod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArgControl {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgControl", "ArgControl")
  @js.native
  object component extends js.Object
  
  def withProps(p: ArgControlProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(arg: js.Any, row: ArgType, updateArgs: Args => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], updateArgs = js.Any.fromFunction1(updateArgs))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ArgControlProps]))
  }
}
