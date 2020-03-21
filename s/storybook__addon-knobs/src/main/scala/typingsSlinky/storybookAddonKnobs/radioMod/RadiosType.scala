package typingsSlinky.storybookAddonKnobs.radioMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiosType
  extends Component[RadiosTypeProps, js.Object, js.Any] {
  def renderRadioButton(label: String, value: RadiosTypeKnobValue): ReactElement = js.native
  def renderRadioButtonList(hasOptions: RadiosTypeKnob): js.Array[ReactElement] = js.native
}

