package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Tab")
@js.native
class Tab protected ()
  extends Component[TabProps, js.Object, js.Any] {
  def this(props: TabProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabProps, context: js.Any) = this()
}
/* static members */
object Tab {
  
  @JSImport("tuya-panel-kit", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Tab.TabPane")
  @js.native
  def TabPane: ReactElement = js.native
  @scala.inline
  def TabPane_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabPane")(x.asInstanceOf[js.Any])
}
