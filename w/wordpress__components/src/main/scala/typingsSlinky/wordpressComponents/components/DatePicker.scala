package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.dateMod.DatePicker.Props
import typingsSlinky.wordpressComponents.mod.DatePicker.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  @JSImport("@wordpress/components", "DatePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1661094714[^] = new SharedBuilder_Props1661094714[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: String => Unit): SharedBuilder_Props1661094714[^] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_Props1661094714[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

