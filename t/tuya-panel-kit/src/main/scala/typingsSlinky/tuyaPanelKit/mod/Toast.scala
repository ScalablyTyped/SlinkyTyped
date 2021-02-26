package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Toast")
@js.native
class Toast protected ()
  extends Component[ToastProps, js.Object, js.Any] {
  def this(props: ToastProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ToastProps, context: js.Any) = this()
}
/* static members */
object Toast {
  
  @JSImport("tuya-panel-kit", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Toast.Error")
  @js.native
  def Error: ReactElement = js.native
  @scala.inline
  def Error_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Loading")
  @js.native
  def Loading: ReactElement = js.native
  @scala.inline
  def Loading_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loading")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Success")
  @js.native
  def Success: ReactElement = js.native
  @scala.inline
  def Success_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Toast.Warning")
  @js.native
  def Warning: ReactElement = js.native
  @scala.inline
  def Warning_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
