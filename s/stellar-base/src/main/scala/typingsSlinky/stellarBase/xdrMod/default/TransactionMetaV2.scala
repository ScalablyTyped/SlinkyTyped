package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.TxChangesAfter
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TransactionMetaV2")
@js.native
class TransactionMetaV2 protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2 {
  def this(attributes: TxChangesAfter) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "TransactionMetaV2")
@js.native
object TransactionMetaV2 extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionMetaV2, io: Buffer): Unit = js.native
}

