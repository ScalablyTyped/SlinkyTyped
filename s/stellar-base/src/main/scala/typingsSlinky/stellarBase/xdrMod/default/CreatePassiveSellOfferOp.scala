package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "CreatePassiveSellOfferOp")
@js.native
class CreatePassiveSellOfferOp protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp {
  def this(attributes: typingsSlinky.stellarBase.anon.Price) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "CreatePassiveSellOfferOp")
@js.native
object CreatePassiveSellOfferOp extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp, io: Buffer): Unit = js.native
}
