package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.anon.Hex
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
    def disableAlpha(value: Boolean): this.type = set("disableAlpha", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(color: String, onChangeComplete: Hex => Unit): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], onChangeComplete = js.Any.fromFunction1(onChangeComplete))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
