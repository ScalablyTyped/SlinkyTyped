package typingsSlinky.tuyaPanelKit.typesMod

import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import typingsSlinky.tuyaPanelKit.anon.A
import typingsSlinky.tuyaPanelKit.anon.KeyParams
import typingsSlinky.tuyaPanelKit.anon.NameRouteName
import typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta
import typingsSlinky.tuyaPanelKit.anon.`3`
import typingsSlinky.tuyaPanelKit.anon.`6`
import typingsSlinky.tuyaPanelKit.anon.`7`
import typingsSlinky.tuyaPanelKit.anon.`8`
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<ParamList, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventEmitter<EventMap> & {setParams <RouteName extends keyof ParamList>(params : std.Partial<ParamList[RouteName]>): void} */
@js.native
trait NavigationHelpers[ParamList /* <: ParamListBase */, EventMap /* <: EventMapBase */] extends js.Object {
  
  /**
    * UGLY HACK! DO NOT USE THE TYPE!!!
    *
    * TypeScript requires a type to be used to be able to infer it.
    * The type should exist as its own without any operations such as union.
    * So we need to figure out a way to store this type in a property.
    * The problem with a normal property is that it shows up in intelliSense.
    * Adding private keyword works, but the annotation is stripped away in declaration.
    * Turns out if we use an empty string, it doesn't show up in intelliSense.
    */
  @JSName("")
  var _empty: js.UndefOr[A[ParamList]] = js.native
  
  /**
    * Check if dispatching back action will be handled by navigation.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def canGoBack(): Boolean = js.native
  
  /**
    * Returns the parent navigator, if any. Reason why the function is called
    * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
    * of parent and other hard-to-follow patterns.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def dangerouslyGetParent[T](): T = js.native
  
  /**
    * Returns the navigator's state. Reason why the function is called
    * dangerouslyGetState is to discourage developers to use internal navigation's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
  
  def dispatch(action: js.Function1[/* state */ NavigationState[ParamListBase], NavigationAction]): Unit = js.native
  /**
    * Dispatch an action or an update function to the router.
    * The update function will receive the current state,
    *
    * @param action Action object or update function.
    */
  def dispatch(action: NavigationAction): Unit = js.native
  
  /**
    * Emit an event to child screens.
    *
    * @param options.type Type of the event (e.g. `focus`, `blur`)
    * @param [options.data] Optional information regarding the event.
    * @param [options.target] Key of the target route which should receive the event.
    * If not specified, all routes receive the event.
    */
  def emit[EventName /* <: Extract[/* keyof EventMap */ String, String] */](
    options: (`6`[EventName, EventMap]) with (js.Object | `3`) with ((`8`[EventMap, EventName]) | (`7`[EventMap, EventName]))
  ): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ] = js.native
  
  /**
    * Go back to the previous route in history.
    */
  def goBack(): Unit = js.native
  
  /**
    * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
    * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
    * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
    * To conditionally render content based on focus state, use the `useIsFocused` hook.
    */
  def isFocused(): Boolean = js.native
  
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param name Name of the route to navigate to.
    * @param [params] Params object for the route.
    */
  def navigate[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
    */
  def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyParams[ParamList, RouteName]): Unit = js.native
  def navigate[RouteName /* <: /* keyof ParamList */ String */](route: NameRouteName[RouteName, ParamList]): Unit = js.native
  
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialStateNavigationSta): Unit = js.native
  def reset(state: NavigationState[ParamListBase]): Unit = js.native
  
  /**
    * Update the param object for the route.
    * The new params will be shallow merged with the old one.
    *
    * @param params Params object for the current route.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def setParams[RouteName /* <: /* keyof ParamList */ String */](
    params: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ): Unit = js.native
}
