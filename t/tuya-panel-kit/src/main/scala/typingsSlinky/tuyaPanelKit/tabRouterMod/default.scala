package typingsSlinky.tuyaPanelKit.tabRouterMod

import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.anon.Payload
import typingsSlinky.tuyaPanelKit.anon.Source
import typingsSlinky.tuyaPanelKit.anon.Target
import typingsSlinky.tuyaPanelKit.anon.Type
import typingsSlinky.tuyaPanelKit.routersTypesMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
}
