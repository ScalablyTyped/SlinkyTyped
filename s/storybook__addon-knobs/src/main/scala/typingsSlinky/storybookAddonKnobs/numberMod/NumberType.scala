package typingsSlinky.storybookAddonKnobs.numberMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberType
  extends Component[NumberTypeProps, js.Object, js.Any] {
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MNumberType(nextProps: NumberTypeProps): Boolean = js.native
}

