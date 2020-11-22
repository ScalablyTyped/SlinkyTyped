package typingsSlinky.storybookAddonKnobs.dateMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateType
  extends Component[DateTypeProps, DateTypeState, js.Any] {
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateType(): Unit = js.native
  
  var dateInput: HTMLInputElement = js.native
  
  var onDateChange: js.Any = js.native
  
  var onTimeChange: js.Any = js.native
  
  var timeInput: HTMLInputElement = js.native
}
