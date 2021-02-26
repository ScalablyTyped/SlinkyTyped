package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Modal")
@js.native
class Modal protected ()
  extends Component[ModalProps, js.Object, js.Any] {
  def this(props: ModalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ModalProps, context: js.Any) = this()
}
/* static members */
object Modal {
  
  @JSImport("tuya-panel-kit", "Modal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Modal.Countdown")
  @js.native
  def Countdown: ReactElement = js.native
  @scala.inline
  def Countdown_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Countdown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.DatePicker")
  @js.native
  def DatePicker: ReactElement = js.native
  @scala.inline
  def DatePicker_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DatePicker")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.List")
  @js.native
  def List: ReactElement = js.native
  @scala.inline
  def List_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.Picker")
  @js.native
  def Picker: ReactElement = js.native
  @scala.inline
  def Picker_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Picker")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Modal.close")
  @js.native
  def close(): Unit = js.native
  
  @JSImport("tuya-panel-kit", "Modal.render")
  @js.native
  def render(option: ReactElement, props: ModalProps): Unit = js.native
}
