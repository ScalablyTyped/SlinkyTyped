package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.trezorConnectBooleans.`false`
import typingsSlinky.trezorConnect.trezorConnectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.mod.Error
  - typingsSlinky.trezorConnect.mod.Success[T]
*/
trait ResponseMessage[T] extends StObject
object ResponseMessage {
  
  @scala.inline
  def Error(payload: typingsSlinky.trezorConnect.anon.Error, success: `false`): typingsSlinky.trezorConnect.mod.Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.Error]
  }
  
  @scala.inline
  def Success[T](id: Double, payload: T, success: `true`): typingsSlinky.trezorConnect.mod.Success[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.Success[T]]
  }
}
