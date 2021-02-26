package typingsSlinky.tuyaPanelKit

import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.anon.Key
import typingsSlinky.tuyaPanelKit.anon.Params
import typingsSlinky.tuyaPanelKit.anon.Payload
import typingsSlinky.tuyaPanelKit.anon.PayloadSource
import typingsSlinky.tuyaPanelKit.anon.Readonlykeystringindexnum
import typingsSlinky.tuyaPanelKit.anon.Source
import typingsSlinky.tuyaPanelKit.anon.SourceTarget
import typingsSlinky.tuyaPanelKit.anon.SourceTargetType
import typingsSlinky.tuyaPanelKit.anon.Target
import typingsSlinky.tuyaPanelKit.anon.TargetType
import typingsSlinky.tuyaPanelKit.anon.Type
import typingsSlinky.tuyaPanelKit.commonActionsMod.Action
import typingsSlinky.tuyaPanelKit.commonActionsMod.ResetState
import typingsSlinky.tuyaPanelKit.drawerRouterMod.DrawerActionType
import typingsSlinky.tuyaPanelKit.drawerRouterMod.DrawerNavigationState
import typingsSlinky.tuyaPanelKit.drawerRouterMod.DrawerRouterOptions
import typingsSlinky.tuyaPanelKit.routersTypesMod.CommonNavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.PartialState
import typingsSlinky.tuyaPanelKit.routersTypesMod.Router
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackActionType
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackRouterOptions
import typingsSlinky.tuyaPanelKit.tabRouterMod.TabActionType
import typingsSlinky.tuyaPanelKit.tabRouterMod.TabNavigationState
import typingsSlinky.tuyaPanelKit.tabRouterMod.TabRouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routersMod {
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(route: Key): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(route: Params): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/routers", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/routers", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
}
