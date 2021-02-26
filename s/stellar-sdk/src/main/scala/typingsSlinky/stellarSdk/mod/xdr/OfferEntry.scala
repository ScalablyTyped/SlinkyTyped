package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.OfferId
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OfferEntry")
@js.native
class OfferEntry protected ()
  extends typingsSlinky.stellarBase.mod.xdr.OfferEntry {
  def this(attributes: OfferId) = this()
}
object OfferEntry {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntry.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry, io: Buffer): Unit = js.native
}
