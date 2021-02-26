package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.timeMod.TimePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
  @scala.inline
  def apply(onChange: String => Unit): SharedBuilder_Props_5564157 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_Props_5564157(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components/date-time/time", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_5564157 = new SharedBuilder_Props_5564157(js.Array(this.component, p.asInstanceOf[js.Any]))
}
