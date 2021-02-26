package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.trezorConnectStrings.`send-max`
import typingsSlinky.trezorConnect.trezorConnectStrings.opreturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.mod.RegularOutput
  - typingsSlinky.trezorConnect.mod.InternalOutput
  - typingsSlinky.trezorConnect.mod.SendMaxOutput
  - typingsSlinky.trezorConnect.mod.OpReturnOutput
*/
trait Output extends StObject
object Output {
  
  @scala.inline
  def InternalOutput(address_n: js.Array[Double], amount: String): typingsSlinky.trezorConnect.mod.InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.InternalOutput]
  }
  
  @scala.inline
  def OpReturnOutput(dataHex: String, `type`: opreturn): typingsSlinky.trezorConnect.mod.OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.OpReturnOutput]
  }
  
  @scala.inline
  def RegularOutput(address: String, amount: String): typingsSlinky.trezorConnect.mod.RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.RegularOutput]
  }
  
  @scala.inline
  def SendMaxOutput(address: String, `type`: `send-max`): typingsSlinky.trezorConnect.mod.SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.SendMaxOutput]
  }
}
