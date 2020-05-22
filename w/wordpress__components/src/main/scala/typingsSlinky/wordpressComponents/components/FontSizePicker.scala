package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.fontSizePickerMod.FontSizePicker.FontSize
import typingsSlinky.wordpressComponents.fontSizePickerMod.FontSizePicker.Props
import typingsSlinky.wordpressComponents.mod.FontSizePicker.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FontSizePicker {
  @JSImport("@wordpress/components", "FontSizePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def disableCustomFontSizes(value: Boolean): this.type = set("disableCustomFontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def fallbackFontSize(value: Double): this.type = set("fallbackFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSizes(value: js.Array[FontSize]): this.type = set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def withSlider(value: Boolean): this.type = set("withSlider", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: js.UndefOr[Double] => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

