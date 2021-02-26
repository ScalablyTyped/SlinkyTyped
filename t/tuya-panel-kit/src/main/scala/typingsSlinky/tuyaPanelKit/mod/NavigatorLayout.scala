package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.tuyaPanelKit.anon.ModalVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "NavigatorLayout")
@js.native
class NavigatorLayout[P, S] protected ()
  extends Component[P, ModalVisible with S, js.Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  def hookRoute(route: DeprecatedNavigatorRoute): NavigationOptions = js.native
  
  def renderScene(route: DeprecatedNavigatorRoute, navigator: DeprecatedNavigator): js.UndefOr[ReactElement] = js.native
}
