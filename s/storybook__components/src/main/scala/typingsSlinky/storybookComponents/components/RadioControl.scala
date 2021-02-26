package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsObject
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsSingleSelection
import typingsSlinky.storybookComponents.radioMod.RadioProps
import typingsSlinky.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioControl {
  
  @scala.inline
  def apply(
    isInline: Boolean,
    name: String,
    onChange: OptionsSingleSelection => OptionsSingleSelection | Unit,
    options: OptionsObject
  ): Builder = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioProps]))
  }
  
  @JSImport("@storybook/components/dist/controls/options/Radio", "RadioControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def argType(value: ArgType): this.type = set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: OptionsSingleSelection): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* evt */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* evt */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: OptionsSingleSelection): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
