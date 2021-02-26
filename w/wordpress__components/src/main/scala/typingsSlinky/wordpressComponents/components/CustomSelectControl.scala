package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.downshift.mod.UseSelectStateChange
import typingsSlinky.wordpressComponents.customSelectControlMod.CustomSelectControl.Option
import typingsSlinky.wordpressComponents.customSelectControlMod.CustomSelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomSelectControl {
  
  @scala.inline
  def apply(label: String, options: js.Array[Option]): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "CustomSelectControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideLabelFromVision(value: Boolean): this.type = set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* changes */ UseSelectStateChange[Option] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: Option): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
