package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerCloseMetaV0")
@js.native
class LedgerCloseMetaV0 protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerCloseMetaV0 {
  def this(attributes: typingsSlinky.stellarBase.anon.LedgerHeader) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.LedgerCloseMetaV0")
@js.native
object LedgerCloseMetaV0 extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0, io: Buffer): Unit = js.native
}
