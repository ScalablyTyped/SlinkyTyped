package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Offer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ManageOfferSuccessResult")
@js.native
class ManageOfferSuccessResult protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.ManageOfferSuccessResult {
  def this(attributes: Offer) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.ManageOfferSuccessResult")
@js.native
object ManageOfferSuccessResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult, io: Buffer): Unit = js.native
}
