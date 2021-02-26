package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Picker")
@js.native
class Picker protected ()
  extends Component[PickerViewProps, js.Object, js.Any] {
  def this(props: PickerViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PickerViewProps, context: js.Any) = this()
}
/* static members */
object Picker {
  
  @JSImport("tuya-panel-kit", "Picker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Picker.Item")
  @js.native
  def Item: ReactElement = js.native
  @scala.inline
  def Item_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
