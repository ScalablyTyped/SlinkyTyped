package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.trezorConnectStrings.`send-max`
import typingsSlinky.trezorConnect.trezorConnectStrings.opreturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.mod.RegularOutput
  - typingsSlinky.trezorConnect.mod.InternalOutput
  - typingsSlinky.trezorConnect.mod.SendMaxOutput
  - typingsSlinky.trezorConnect.mod.OpReturnOutput
*/
trait Output extends js.Object
object Output {
  
  @scala.inline
  def RegularOutput(address: String, amount: String): Output = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def InternalOutput(address_n: js.Array[Double], amount: String): Output = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def SendMaxOutput(address: String, `type`: `send-max`): Output = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def OpReturnOutput(dataHex: String, `type`: opreturn): Output = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}
