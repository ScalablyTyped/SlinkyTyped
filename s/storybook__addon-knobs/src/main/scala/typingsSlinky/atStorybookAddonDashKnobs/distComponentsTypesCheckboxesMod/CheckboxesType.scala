package typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesCheckboxesMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesType
  extends Component[CheckboxesTypeProps, CheckboxesTypeState, js.Any] {
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def renderCheckbox(label: String, value: String): Element = js.native
  def renderCheckboxList(hasOptions: CheckboxesTypeKnob): js.Array[Element] = js.native
}

