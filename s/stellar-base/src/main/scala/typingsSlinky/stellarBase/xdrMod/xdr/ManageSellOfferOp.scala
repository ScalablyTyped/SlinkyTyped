package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageSellOfferOp extends StObject {
  
  def amount(): Int64 = js.native
  def amount(value: Int64): Int64 = js.native
  
  def buying(): Asset = js.native
  def buying(value: Asset): Asset = js.native
  
  def offerId(): Int64 = js.native
  def offerId(value: Int64): Int64 = js.native
  
  def price(): Price = js.native
  def price(value: Price): Price = js.native
  
  def selling(): Asset = js.native
  def selling(value: Asset): Asset = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
