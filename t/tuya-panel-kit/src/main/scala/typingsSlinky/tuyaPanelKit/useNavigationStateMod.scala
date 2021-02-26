package typingsSlinky.tuyaPanelKit

import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationStateMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/useNavigationState", JSImport.Default)
  @js.native
  def default[T](selector: Selector[T]): T = js.native
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type Selector[T] = js.Function1[/* state */ NavigationState[ParamListBase], T]
}
