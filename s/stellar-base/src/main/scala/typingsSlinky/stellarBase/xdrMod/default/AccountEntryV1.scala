package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "AccountEntryV1")
@js.native
class AccountEntryV1 protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1 {
  def this(attributes: typingsSlinky.stellarBase.anon.Liabilities) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "AccountEntryV1")
@js.native
object AccountEntryV1 extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1, io: Buffer): Unit = js.native
}

