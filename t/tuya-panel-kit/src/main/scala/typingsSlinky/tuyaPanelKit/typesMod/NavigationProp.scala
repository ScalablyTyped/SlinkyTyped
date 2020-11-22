package typingsSlinky.tuyaPanelKit.typesMod

import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import typingsSlinky.tuyaPanelKit.anon.A
import typingsSlinky.tuyaPanelKit.anon.B
import typingsSlinky.tuyaPanelKit.anon.KeyParams
import typingsSlinky.tuyaPanelKit.anon.NameRouteName
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.PartialState
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.beforeRemove
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.blur
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.focus
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<ParamList, State> & {setParams (params : std.Partial<ParamList[RouteName]>): void, setOptions (options : std.Partial<ScreenOptions>): void} & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventConsumer<EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State>> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.PrivateValueStore<ParamList, RouteName, EventMap> */
@js.native
trait NavigationProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends js.Object {
  
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
  var _empty: js.UndefOr[A[ParamList]] with (js.UndefOr[B[ParamList, RouteName, EventMap]]) = js.native
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Extract[
    /* keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> */ focus | blur | state | beforeRemove, 
    String
  ] */](`type`: EventName, callback: EventListenerCallback[EventMap with EventMapCore[State], EventName]): js.Function0[Unit] = js.native
  
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
  def dangerouslyGetState(): State = js.native
  
  def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
  /**
    * Dispatch an action or an update function to the router.
    * The update function will receive the current state,
    *
    * @param action Action object or update function.
    */
  def dispatch(action: NavigationAction): Unit = js.native
  
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
  
  def removeListener[EventName /* <: Extract[
    /* keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> */ focus | blur | state | beforeRemove, 
    String
  ] */](`type`: EventName, callback: EventListenerCallback[EventMap with EventMapCore[State], EventName]): Unit = js.native
  
  def reset(state: State): Unit = js.native
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialState[State]): Unit = js.native
  
  /**
    * Update the options for the route.
    * The options object will be shallow merged with default options object.
    *
    * @param options Options object for the route.
    */
  def setOptions(options: Partial[ScreenOptions]): Unit = js.native
  
  /**
    * Update the param object for the route.
    * The new params will be shallow merged with the old one.
    *
    * @param params Params object for the current route.
    */
  def setParams(
    params: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ): Unit = js.native
}
