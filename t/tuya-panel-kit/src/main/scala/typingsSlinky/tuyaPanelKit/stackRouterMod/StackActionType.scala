package typingsSlinky.tuyaPanelKit.stackRouterMod

import typingsSlinky.tuyaPanelKit.anon.Count
import typingsSlinky.tuyaPanelKit.anon.Params
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.POP
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.POP_TO_TOP
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.PUSH
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tuyaPanelKit.anon.PayloadSource
  - typingsSlinky.tuyaPanelKit.anon.SourceTarget
  - typingsSlinky.tuyaPanelKit.anon.TargetType
  - typingsSlinky.tuyaPanelKit.anon.SourceTargetType
*/
trait StackActionType extends js.Object
object StackActionType {
  
  @scala.inline
  def PayloadSource(payload: Params, `type`: REPLACE): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def SourceTarget(payload: Params, `type`: PUSH): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def TargetType(payload: Count, `type`: POP): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def SourceTargetType(`type`: POP_TO_TOP): StackActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
}
