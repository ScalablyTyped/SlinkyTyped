package typingsSlinky.tuyaPanelKit

import typingsSlinky.std.Extract
import typingsSlinky.std.Omit
import typingsSlinky.tuyaPanelKit.anon.Key
import typingsSlinky.tuyaPanelKit.anon.KeyMerge
import typingsSlinky.tuyaPanelKit.anon.Merge
import typingsSlinky.tuyaPanelKit.anon.Params
import typingsSlinky.tuyaPanelKit.anon.`0`
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.PartialRoute
import typingsSlinky.tuyaPanelKit.routersTypesMod.Route
import typingsSlinky.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.GO_BACK
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.NAVIGATE
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.RESET
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.SET_PARAMS
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonActionsMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "goBack")
  @js.native
  def goBack(): Action = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(name: String): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(name: String, params: js.Object): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(route: Key): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(route: Params): Action = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "reset")
  @js.native
  def reset(): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "reset")
  @js.native
  def reset(state: ResetState): Action = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "setParams")
  @js.native
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tuyaPanelKit.anon.Source
    - typingsSlinky.tuyaPanelKit.anon.Payload
    - typingsSlinky.tuyaPanelKit.anon.PayloadSourceTarget
    - typingsSlinky.tuyaPanelKit.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def Payload(payload: Merge | KeyMerge, `type`: NAVIGATE): typingsSlinky.tuyaPanelKit.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.Payload]
    }
    
    @scala.inline
    def PayloadSourceTarget(`type`: RESET): typingsSlinky.tuyaPanelKit.anon.PayloadSourceTarget = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.PayloadSourceTarget]
    }
    
    @scala.inline
    def Source(`type`: GO_BACK): typingsSlinky.tuyaPanelKit.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.Source]
    }
    
    @scala.inline
    def Type(payload: `0`, `type`: SET_PARAMS): typingsSlinky.tuyaPanelKit.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.Type]
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta
    - typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase]
    - typingsSlinky.tuyaPanelKit.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
  
  trait _ResetState extends StObject
  object _ResetState {
    
    @scala.inline
    def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      stale: `false`,
      `type`: String
    ): typingsSlinky.tuyaPanelKit.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.OmitNavigationStateParamL]
    }
    
    @scala.inline
    def PartialStateNavigationSta(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta]
    }
  }
}
