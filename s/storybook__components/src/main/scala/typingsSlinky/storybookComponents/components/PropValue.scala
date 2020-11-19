package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.propDefMod.PropSummaryValue
import typingsSlinky.storybookComponents.propValueMod.PropValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PropValue {
  
  @JSImport("@storybook/components/dist/blocks/PropsTable/PropValue", "PropValue")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: PropSummaryValue): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropValueProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PropValue.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
