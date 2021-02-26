package typingsSlinky.tuyaPanelKit

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.anon.Descriptors
import typingsSlinky.tuyaPanelKit.anon.Key
import typingsSlinky.tuyaPanelKit.anon.Options
import typingsSlinky.tuyaPanelKit.anon.Params
import typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta
import typingsSlinky.tuyaPanelKit.anon.Payload
import typingsSlinky.tuyaPanelKit.anon.PayloadSource
import typingsSlinky.tuyaPanelKit.anon.Readonlykeystringindexnum
import typingsSlinky.tuyaPanelKit.anon.Source
import typingsSlinky.tuyaPanelKit.anon.SourceTarget
import typingsSlinky.tuyaPanelKit.anon.SourceTargetType
import typingsSlinky.tuyaPanelKit.anon.State
import typingsSlinky.tuyaPanelKit.anon.Target
import typingsSlinky.tuyaPanelKit.anon.TargetType
import typingsSlinky.tuyaPanelKit.anon.Type
import typingsSlinky.tuyaPanelKit.commonActionsMod.Action
import typingsSlinky.tuyaPanelKit.commonActionsMod.ResetState
import typingsSlinky.tuyaPanelKit.drawerRouterMod.DrawerActionType
import typingsSlinky.tuyaPanelKit.drawerRouterMod.DrawerNavigationState
import typingsSlinky.tuyaPanelKit.drawerRouterMod.DrawerRouterOptions
import typingsSlinky.tuyaPanelKit.getActionFromStateMod.NavigateAction
import typingsSlinky.tuyaPanelKit.getStateFromPathMod.ResultState
import typingsSlinky.tuyaPanelKit.routersTypesMod.CommonNavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.DefaultRouterOptions
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.PartialState
import typingsSlinky.tuyaPanelKit.routersTypesMod.Route
import typingsSlinky.tuyaPanelKit.routersTypesMod.Router
import typingsSlinky.tuyaPanelKit.routersTypesMod.RouterFactory
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackActionType
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackRouterOptions
import typingsSlinky.tuyaPanelKit.tabRouterMod.TabActionType
import typingsSlinky.tuyaPanelKit.tabRouterMod.TabNavigationState
import typingsSlinky.tuyaPanelKit.tabRouterMod.TabRouterOptions
import typingsSlinky.tuyaPanelKit.typesMod.DefaultNavigatorOptions
import typingsSlinky.tuyaPanelKit.typesMod.EventMapBase
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerProps
import typingsSlinky.tuyaPanelKit.typesMod.NavigationContainerRef
import typingsSlinky.tuyaPanelKit.typesMod.NavigationHelpers
import typingsSlinky.tuyaPanelKit.typesMod.NavigationProp
import typingsSlinky.tuyaPanelKit.typesMod.RouteProp
import typingsSlinky.tuyaPanelKit.typesMod.TypedNavigator
import typingsSlinky.tuyaPanelKit.useFocusEffectMod.EffectCallback
import typingsSlinky.tuyaPanelKit.useNavigationStateMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/core", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(route: Key): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(route: Params): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("tuya-panel-kit/@react-navigation/core", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core", "NavigationContext")
  @js.native
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typingsSlinky.tuyaPanelKit.typesMod.PrivateValueStore[A, B, C]
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/core", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/core", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "createNavigatorFactory")
  @js.native
  def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ReactComponentClass[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "getActionFromState")
  @js.native
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  @JSImport("tuya-panel-kit/@react-navigation/core", "getActionFromState")
  @js.native
  def getActionFromState(
    state: PartialStateNavigationSta,
    options: typingsSlinky.tuyaPanelKit.getActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "getFocusedRouteNameFromRoute")
  @js.native
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) with State): js.UndefOr[String] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "getPathFromState")
  @js.native
  def getPathFromState(state: typingsSlinky.tuyaPanelKit.getPathFromStateMod.State): String = js.native
  @JSImport("tuya-panel-kit/@react-navigation/core", "getPathFromState")
  @js.native
  def getPathFromState(
    state: typingsSlinky.tuyaPanelKit.getPathFromStateMod.State,
    options: typingsSlinky.tuyaPanelKit.getPathFromStateMod.Options
  ): String = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String): js.UndefOr[ResultState] = js.native
  @JSImport("tuya-panel-kit/@react-navigation/core", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String, options: typingsSlinky.tuyaPanelKit.getStateFromPathMod.Options): js.UndefOr[ResultState] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "useFocusEffect")
  @js.native
  def useFocusEffect(effect: EffectCallback): Unit = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "useIsFocused")
  @js.native
  def useIsFocused(): Boolean = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "useNavigation")
  @js.native
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "useNavigationBuilder")
  @js.native
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "useNavigationState")
  @js.native
  def useNavigationState[T](selector: Selector[T]): T = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "useRoute")
  @js.native
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = js.native
}
