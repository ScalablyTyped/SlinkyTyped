package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.argValueMod.ArgValueProps
import typingsSlinky.storybookComponents.typesMod.PropSummaryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArgValue {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgValue", "ArgValue")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def initialExpandedArgs(value: Boolean): this.type = set("initialExpandedArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: PropSummaryValue): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ArgValueProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ArgValue.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
