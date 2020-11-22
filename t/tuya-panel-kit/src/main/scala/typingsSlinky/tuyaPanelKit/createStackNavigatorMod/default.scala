package typingsSlinky.tuyaPanelKit.createStackNavigatorMod

import slinky.core.facade.ReactElement
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import typingsSlinky.tuyaPanelKit.typesMod.TypedNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/stack/navigators/createStackNavigator", JSImport.Default)
@js.native
object default extends js.Object {
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  def apply[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, ReactElement]
  ] = js.native
}
