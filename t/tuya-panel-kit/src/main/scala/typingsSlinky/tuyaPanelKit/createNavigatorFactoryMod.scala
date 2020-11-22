package typingsSlinky.tuyaPanelKit

import slinky.core.ReactComponentClass
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.typesMod.EventMapBase
import typingsSlinky.tuyaPanelKit.typesMod.TypedNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/core/createNavigatorFactory", JSImport.Namespace)
@js.native
object createNavigatorFactoryMod extends js.Object {
  
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ReactComponentClass[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
}
