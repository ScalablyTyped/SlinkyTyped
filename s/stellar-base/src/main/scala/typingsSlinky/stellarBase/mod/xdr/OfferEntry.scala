package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Flags
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.OfferEntry")
@js.native
class OfferEntry protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.OfferEntry {
  def this(attributes: Flags) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.OfferEntry")
@js.native
object OfferEntry extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry, io: Buffer): Unit = js.native
}
