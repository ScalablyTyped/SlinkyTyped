package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerHeaderHistoryEntry extends js.Object {
  def ext(): LedgerHeaderHistoryEntryExt = js.native
  def ext(value: LedgerHeaderHistoryEntryExt): LedgerHeaderHistoryEntryExt = js.native
  def hash(): Buffer = js.native
  def hash(value: Buffer): Buffer = js.native
  def header(): LedgerHeader = js.native
  def header(value: LedgerHeader): LedgerHeader = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

