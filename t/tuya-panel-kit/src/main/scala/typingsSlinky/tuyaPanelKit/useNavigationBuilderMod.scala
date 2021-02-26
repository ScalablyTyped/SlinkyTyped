package typingsSlinky.tuyaPanelKit

import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.anon.Descriptors
import typingsSlinky.tuyaPanelKit.routersTypesMod.DefaultRouterOptions
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.RouterFactory
import typingsSlinky.tuyaPanelKit.typesMod.DefaultNavigatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationBuilderMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/useNavigationBuilder", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
}
