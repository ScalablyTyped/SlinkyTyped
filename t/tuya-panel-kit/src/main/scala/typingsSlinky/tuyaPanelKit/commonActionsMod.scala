package typingsSlinky.tuyaPanelKit

import typingsSlinky.tuyaPanelKit.anon.Key
import typingsSlinky.tuyaPanelKit.anon.Params
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", JSImport.Namespace)
@js.native
object commonActionsMod extends js.Object {
  
  def goBack(): Action = js.native
  
  def navigate(name: String): Action = js.native
  def navigate(name: String, params: js.Object): Action = js.native
  def navigate(route: Key): Action = js.native
  def navigate(route: Params): Action = js.native
  
  def reset(): Action = js.native
  def reset(state: ResetState): Action = js.native
  
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tuyaPanelKit.anon.Source
    - typingsSlinky.tuyaPanelKit.anon.Payload
    - typingsSlinky.tuyaPanelKit.anon.PayloadSourceTarget
    - typingsSlinky.tuyaPanelKit.anon.Type
  */
  trait Action extends js.Object
  
  trait _ResetState extends js.Object
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta
    - typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase]
    - typingsSlinky.tuyaPanelKit.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
}
