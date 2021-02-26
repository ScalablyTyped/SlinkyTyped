package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.checkboxMod.CheckboxProps
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsMultiSelection
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsObject
import typingsSlinky.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxControl {
  
  @scala.inline
  def apply(
    isInline: Boolean,
    name: String,
    onChange: OptionsMultiSelection => OptionsMultiSelection | Unit,
    options: OptionsObject
  ): Builder = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckboxProps]))
  }
  
  @JSImport("@storybook/components/dist/controls/options/Checkbox", "CheckboxControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def argType(value: ArgType): this.type = set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: OptionsMultiSelection): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: js.Any*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def onBlur(value: /* evt */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* evt */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: OptionsMultiSelection): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
  }
  
  def withProps(p: CheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
