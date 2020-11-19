package typingsSlinky.storybookAddonKnobs.checkboxesMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxesType
  extends Component[CheckboxesTypeProps, CheckboxesTypeState, js.Any] {
  
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def renderCheckbox(label: String, value: String): ReactElement = js.native
  
  def renderCheckboxList(hasOptions: CheckboxesTypeKnob): js.Array[ReactElement] = js.native
}
