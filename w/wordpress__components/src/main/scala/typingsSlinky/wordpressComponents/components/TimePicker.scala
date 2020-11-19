package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.timeMod.TimePicker.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("@wordpress/components/date-time", "TimePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_5564157 = new SharedBuilder_Props_5564157(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChange: String => Unit): SharedBuilder_Props_5564157 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_Props_5564157(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
