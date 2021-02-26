package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.arrayMod.ArrayProps
import typingsSlinky.storybookComponents.controlsTypesMod.ArrayValue
import typingsSlinky.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArrayControl {
  
  @scala.inline
  def apply(name: String, onChange: ArrayValue => ArrayValue | Unit): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[ArrayProps]))
  }
  
  @JSImport("@storybook/components", "ArrayControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def argType(value: ArgType): this.type = set("argType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: ArrayValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def onBlur(value: /* evt */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* evt */ js.Any => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: ArrayValue): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
  }
  
  def withProps(p: ArrayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
