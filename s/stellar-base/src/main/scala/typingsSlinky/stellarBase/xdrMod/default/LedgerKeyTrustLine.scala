package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AccountIdAsset
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "LedgerKeyTrustLine")
@js.native
class LedgerKeyTrustLine protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine {
  def this(attributes: AccountIdAsset) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "LedgerKeyTrustLine")
@js.native
object LedgerKeyTrustLine extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine, io: Buffer): Unit = js.native
}
