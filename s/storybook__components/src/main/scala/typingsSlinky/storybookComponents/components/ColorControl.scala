package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.colorMod.ColorProps
import typingsSlinky.storybookComponents.controlsTypesMod.ColorValue
import typingsSlinky.storybookComponents.typesMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorControl {
  
  @JSImport("@storybook/components", "ColorControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def argType(value: ArgType): this.type = set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: ColorValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* evt */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* evt */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def presetColorsVarargs(value: String*): this.type = set("presetColors", js.Array(value :_*))
    
    @scala.inline
    def presetColors(value: js.Array[String]): this.type = set("presetColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: ColorValue): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String, onChange: ColorValue => ColorValue | Unit): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorProps]))
  }
}
