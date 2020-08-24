package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.dateMod.DatePicker.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  @JSImport("@wordpress/components", "DatePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1897558182 = new SharedBuilder_Props_1897558182(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: String => Unit): SharedBuilder_Props_1897558182 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_Props_1897558182(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

