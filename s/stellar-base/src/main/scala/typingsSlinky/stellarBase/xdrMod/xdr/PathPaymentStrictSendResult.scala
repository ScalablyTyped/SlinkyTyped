package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSendResult extends js.Object {
  
  def noIssuer(): Asset = js.native
  def noIssuer(value: Asset): Asset = js.native
  
  def success(): PathPaymentStrictSendResultSuccess = js.native
  def success(value: PathPaymentStrictSendResultSuccess): PathPaymentStrictSendResultSuccess = js.native
  
  def switch(): PathPaymentStrictSendResultCode = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): PathPaymentStrictSendResultSuccess | Asset = js.native
}
