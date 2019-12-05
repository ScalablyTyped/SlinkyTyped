package typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesDateMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateType
  extends Component[DateTypeProps, DateTypeState, js.Any] {
  var dateInput: HTMLInputElement = js.native
  var timeInput: HTMLInputElement = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateType(): Unit = js.native
  def onDateChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onTimeChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
}

