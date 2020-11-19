package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.colorPaletteMod.ColorPalette.Color
import typingsSlinky.wordpressComponents.colorPaletteMod.ColorPalette.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPalette {
  
  @JSImport("@wordpress/block-editor", "ColorPalette")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCustomColors(value: Boolean): this.type = set("disableCustomColors", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(colors: js.Array[Color], onChange: js.UndefOr[Color] => Unit, value: Color): Builder = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
