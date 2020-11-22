package typingsSlinky.tuyaPanelKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CompositeNavigationProp[A /* <: typingsSlinky.tuyaPanelKit.typesMod.NavigationProp[
    typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase, 
    java.lang.String, 
    _, 
    _, 
    js.Object
  ] */, B /* <: typingsSlinky.tuyaPanelKit.typesMod.NavigationHelpersCommon[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase, _] */] = (typingsSlinky.std.Omit[
    A with B, 
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, string, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<any>, {}, {}> */ typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dispatch | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.navigate_ | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.reset_ | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.goBack | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.isFocused | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.canGoBack | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetParent | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetState | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings._empty | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.setParams | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.setOptions | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.addListener | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.removeListener
  ]) with (typingsSlinky.tuyaPanelKit.typesMod.NavigationProp[
    js.Any, 
    java.lang.String, 
    typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase], 
    js.Object, 
    js.Object
  ])
  
  type EventArg[EventName /* <: java.lang.String */, CanPreventDefault /* <: js.UndefOr[scala.Boolean] */, Data] = typingsSlinky.tuyaPanelKit.anon.TypeEventName[EventName] with (js.Object | typingsSlinky.tuyaPanelKit.anon.DefaultPrevented) with (typingsSlinky.tuyaPanelKit.anon.DataReadonly[Data] | typingsSlinky.tuyaPanelKit.anon.`2`[Data])
  
  type EventListenerCallback[EventMap /* <: typingsSlinky.tuyaPanelKit.typesMod.EventMapBase */, EventName /* <: /* keyof EventMap */ java.lang.String */] = js.Function1[
    /* e */ typingsSlinky.tuyaPanelKit.typesMod.EventArg[
      typingsSlinky.std.Extract[EventName, java.lang.String], 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ], 
    scala.Unit
  ]
  
  type EventMapBase = typingsSlinky.std.Record[java.lang.String, typingsSlinky.tuyaPanelKit.anon.CanPreventDefault]
  
  type NavigatorScreenParams[ParamList, State /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase] */] = typingsSlinky.tuyaPanelKit.anon.Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)
  
  type RouteConfig[ParamList /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */, State /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: typingsSlinky.tuyaPanelKit.typesMod.EventMapBase */] = (typingsSlinky.tuyaPanelKit.anon.InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]) with (typingsSlinky.tuyaPanelKit.anon.Children | typingsSlinky.tuyaPanelKit.anon.Component | (typingsSlinky.tuyaPanelKit.anon.GetComponent[ParamList, RouteName]))
  
  type RouteProp[ParamList /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = typingsSlinky.tuyaPanelKit.routersTypesMod.Route[
    typingsSlinky.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]
  
  type ScreenListeners[State /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase] */, EventMap /* <: typingsSlinky.tuyaPanelKit.typesMod.EventMapBase */] = typingsSlinky.std.Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EventName in keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> ]: tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventListenerCallback<EventMap, EventName>}
    */ typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScreenListeners with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
}
