package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScpHistoryEntryV0 extends js.Object {
  def ledgerMessages(): LedgerScpMessages = js.native
  def ledgerMessages(value: LedgerScpMessages): LedgerScpMessages = js.native
  def quorumSets(): js.Array[ScpQuorumSet] = js.native
  def quorumSets(value: js.Array[ScpQuorumSet]): js.Array[ScpQuorumSet] = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

