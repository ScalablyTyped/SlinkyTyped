package typingsSlinky.tuyaPanelKit.drawerRouterMod

import typingsSlinky.tuyaPanelKit.anon.NameString
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.JUMP_TO
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tuyaPanelKit.tabRouterMod.TabActionType
  - typingsSlinky.tuyaPanelKit.anon.`13`
*/
trait DrawerActionType extends js.Object
object DrawerActionType {
  
  @scala.inline
  def TabActionType(payload: NameString, `type`: JUMP_TO): DrawerActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
  
  @scala.inline
  def `13`(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): DrawerActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
}
