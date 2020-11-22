package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsObject
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsSelection
import typingsSlinky.storybookComponents.selectMod.SelectProps
import typingsSlinky.storybookComponents.typesMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectControl {
  
  @JSImport("@storybook/components/dist/controls/options/Select", "SelectControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def argType(value: ArgType): this.type = set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: js.Any*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: OptionsSelection): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* evt */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* evt */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: OptionsSelection): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    isMulti: Boolean,
    name: String,
    onChange: OptionsSelection => OptionsSelection | Unit,
    options: OptionsObject
  ): Builder = {
    val __props = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectProps]))
  }
}
