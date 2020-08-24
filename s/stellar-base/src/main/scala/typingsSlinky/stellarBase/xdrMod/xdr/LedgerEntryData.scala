package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerEntryData extends js.Object {
  def account(): AccountEntry = js.native
  def account(value: AccountEntry): AccountEntry = js.native
  def data(): DataEntry = js.native
  def data(value: DataEntry): DataEntry = js.native
  def offer(): OfferEntry = js.native
  def offer(value: OfferEntry): OfferEntry = js.native
  def switch(): LedgerEntryType = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def trustLine(): TrustLineEntry = js.native
  def trustLine(value: TrustLineEntry): TrustLineEntry = js.native
  def value(): AccountEntry | TrustLineEntry | OfferEntry | DataEntry = js.native
}

