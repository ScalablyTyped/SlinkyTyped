package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.colorPickerMod.ColorPicker.OnChangeCompleteValue
import typingsSlinky.wordpressComponents.colorPickerMod.ColorPicker.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPicker {
  
  @JSImport("@wordpress/components", "ColorPicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableAlpha(value: Boolean): this.type = set("disableAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oldHue(value: Double): this.type = set("oldHue", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChangeComplete: OnChangeCompleteValue => Unit): Builder = {
    val __props = js.Dynamic.literal(onChangeComplete = js.Any.fromFunction1(onChangeComplete))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
