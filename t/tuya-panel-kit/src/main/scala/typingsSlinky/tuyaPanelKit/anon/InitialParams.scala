package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.std.Partial
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.typesMod.EventMapBase
import typingsSlinky.tuyaPanelKit.typesMod.ScreenListeners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialParams[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] extends StObject {
  
  /**
    * Initial params object for the route.
    */
  var initialParams: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ] = js.native
  
  /**
    * Event listeners for this screen.
    */
  var listeners: js.UndefOr[
    (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenListeners[State, EventMap]])
  ] = js.native
  
  /**
    * Route name of this screen.
    */
  var name: RouteName = js.native
  
  /**
    * Navigator options for this screen.
    */
  var options: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenOptions])
  ] = js.native
}
object InitialParams {
  
  @scala.inline
  def apply[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */](name: RouteName): InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]]
  }
  
  @scala.inline
  implicit class InitialParamsMutableBuilder[Self <: InitialParams[_, _, _, _, _], RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] (val x: Self with (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap])) extends AnyVal {
    
    @scala.inline
    def setInitialParams(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Self = StObject.set(x, "initialParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialParamsUndefined: Self = StObject.set(x, "initialParams", js.undefined)
    
    @scala.inline
    def setListeners(
      value: (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenListeners[State, EventMap]])
    ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersFunction1(value: /* props */ Route[ParamList, RouteName] => ScreenListeners[State, EventMap]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ScreenOptions | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenOptions])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction1(value: /* props */ Route[ParamList, RouteName] => ScreenOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
