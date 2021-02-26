package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer")
@js.native
class ManageOfferSuccessResultOffer ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer
object ManageOfferSuccessResultOffer {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.manageOfferCreated")
  @js.native
  def manageOfferCreated(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.manageOfferUpdated")
  @js.native
  def manageOfferUpdated(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer, io: Buffer): Unit = js.native
}
