package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Slider")
@js.native
class Slider protected ()
  extends Component[SliderProps, js.Object, js.Any] {
  def this(props: SliderProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SliderProps, context: js.Any) = this()
}
/* static members */
object Slider {
  
  @JSImport("tuya-panel-kit", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Slider.Horizontal")
  @js.native
  def Horizontal: ReactElement = js.native
  @scala.inline
  def Horizontal_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Slider.Vertical")
  @js.native
  def Vertical: ReactElement = js.native
  @scala.inline
  def Vertical_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}
