package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.controlsTypesMod.NumberValue
import typingsSlinky.storybookComponents.rangeMod.RangeProps
import typingsSlinky.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangeControl {
  
  @scala.inline
  def apply(name: String, onChange: NumberValue | Null => NumberValue | Null | Unit): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[RangeProps]))
  }
  
  @JSImport("@storybook/components", "RangeControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def argType(value: ArgType): this.type = set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: NumberValue | Null): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueNull: this.type = set("defaultValue", null)
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* evt */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* evt */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: NumberValue | Null): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: RangeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
