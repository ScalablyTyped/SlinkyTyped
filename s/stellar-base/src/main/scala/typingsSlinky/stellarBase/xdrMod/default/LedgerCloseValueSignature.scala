package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.NodeIdSignature
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "LedgerCloseValueSignature")
@js.native
class LedgerCloseValueSignature protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature {
  def this(attributes: NodeIdSignature) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "LedgerCloseValueSignature")
@js.native
object LedgerCloseValueSignature extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature, io: Buffer): Unit = js.native
}
