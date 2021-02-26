package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.dateMod.DatePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  @scala.inline
  def apply(onChange: String => Unit): SharedBuilder_Props_1897558182 = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_Props_1897558182(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components/date-time/date", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_1897558182 = new SharedBuilder_Props_1897558182(js.Array(this.component, p.asInstanceOf[js.Any]))
}
