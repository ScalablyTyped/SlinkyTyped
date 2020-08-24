package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.PreviousLedgerHash
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TransactionSet")
@js.native
class TransactionSet protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet {
  def this(attributes: PreviousLedgerHash) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "TransactionSet")
@js.native
object TransactionSet extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet, io: Buffer): Unit = js.native
}

