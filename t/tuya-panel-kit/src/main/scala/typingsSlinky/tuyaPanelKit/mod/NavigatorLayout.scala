package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.tuyaPanelKit.anon.ModalVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "NavigatorLayout")
@js.native
class NavigatorLayout[P, S] ()
  extends Component[P, ModalVisible with S, js.Any] {
  
  def hookRoute(route: DeprecatedNavigatorRoute): NavigationOptions = js.native
  
  def renderScene(route: DeprecatedNavigatorRoute, navigator: DeprecatedNavigator): js.UndefOr[ReactElement] = js.native
}
