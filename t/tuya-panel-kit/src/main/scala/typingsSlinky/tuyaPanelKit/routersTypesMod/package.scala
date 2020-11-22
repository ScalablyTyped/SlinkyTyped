package typingsSlinky.tuyaPanelKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routersTypesMod {
  
  type ActionCreators[Action /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction */] = org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.Any, Action]]
  
  type CommonNavigationAction = typingsSlinky.tuyaPanelKit.commonActionsMod.Action
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type NavigationRoute[ParamList /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = (typingsSlinky.tuyaPanelKit.routersTypesMod.Route[
    typingsSlinky.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]) with typingsSlinky.tuyaPanelKit.anon.`15`
  
  type ParamListBase = typingsSlinky.std.Record[java.lang.String, js.UndefOr[js.Object]]
  
  type PartialRoute[R /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.Route[java.lang.String, js.UndefOr[js.Object]] */] = (typingsSlinky.std.Omit[R, typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.key]) with typingsSlinky.tuyaPanelKit.anon.KeyState
  
  type PartialState[State /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase] */] = (typingsSlinky.std.Partial[
    typingsSlinky.std.Omit[
      State, 
      typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.stale | typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.routes
    ]
  ]) with typingsSlinky.tuyaPanelKit.anon.Routes[State]
  
  type Route[RouteName /* <: java.lang.String */, Params /* <: js.UndefOr[js.Object] */] = typingsSlinky.tuyaPanelKit.anon.KeyStringNameRouteName[RouteName] with (typingsSlinky.tuyaPanelKit.anon.ParamsReadonly[Params] | typingsSlinky.tuyaPanelKit.anon.`17`[Params])
  
  type RouterFactory[State /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase] */, Action /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction */, RouterOptions /* <: typingsSlinky.tuyaPanelKit.routersTypesMod.DefaultRouterOptions[java.lang.String] */] = js.Function1[
    /* options */ RouterOptions, 
    typingsSlinky.tuyaPanelKit.routersTypesMod.Router[State, Action]
  ]
}
