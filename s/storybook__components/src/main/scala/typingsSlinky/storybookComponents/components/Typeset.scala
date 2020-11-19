package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.typesetMod.TypesetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typeset {
  
  @JSImport("@storybook/components", "Typeset")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeight(value: Double): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sampleText(value: String): this.type = set("sampleText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TypesetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(fontSizes: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TypesetProps]))
  }
}
