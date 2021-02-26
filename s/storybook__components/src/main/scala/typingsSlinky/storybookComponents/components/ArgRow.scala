package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.argRowMod.ArgRowProps
import typingsSlinky.storybookComponents.typesMod.ArgType
import typingsSlinky.storybookComponents.typesMod.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArgRow {
  
  @scala.inline
  def apply(arg: js.Any, row: ArgType): Builder = {
    val __props = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ArgRowProps]))
  }
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgRow", "ArgRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialExpandedArgs(value: Boolean): this.type = set("initialExpandedArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def updateArgs(value: /* args */ Args => Unit): this.type = set("updateArgs", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ArgRowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
