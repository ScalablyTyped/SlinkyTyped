package typingsSlinky.soap.typesMod

import typingsSlinky.soap.anon.Subcode
import typingsSlinky.soap.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.soap.typesMod.ISoapFault11
  - typingsSlinky.soap.typesMod.ISoapFault12
*/
trait ISoapFault extends js.Object
object ISoapFault {
  
  @scala.inline
  def ISoapFault11(faultcode: Double | String, faultstring: String): ISoapFault = {
    val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault]
  }
  
  @scala.inline
  def ISoapFault12(Code: Subcode, Reason: Text): ISoapFault = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault]
  }
}
