package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "LedgerHeaderHistoryEntry")
@js.native
class LedgerHeaderHistoryEntry protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry {
  def this(attributes: typingsSlinky.stellarBase.anon.Hash) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "LedgerHeaderHistoryEntry")
@js.native
object LedgerHeaderHistoryEntry extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry, io: Buffer): Unit = js.native
}

