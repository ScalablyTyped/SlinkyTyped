package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AccountIdAccountId
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "LedgerKeyAccount")
@js.native
class LedgerKeyAccount protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount {
  def this(attributes: AccountIdAccountId) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "LedgerKeyAccount")
@js.native
object LedgerKeyAccount extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount, io: Buffer): Unit = js.native
}
